package model;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
public class OMTBDao {
	public static int insertCity(OMTBBean omtbBean) {
		int status = 0;
		Connection connection = LoginDao.getConnection();
		CallableStatement callableStatement = null;
		try {
			callableStatement = connection.prepareCall("call addCity(?)");
			callableStatement.setString(1, omtbBean.getCityName());
			status = callableStatement.executeUpdate();
		} 
		catch (SQLException exception) {
			exception.printStackTrace();
		}
		finally
		{
			try {
				connection.close();
			} catch (SQLException exception) {
				exception.printStackTrace();
			}
		}
		return status;	
	}
	
	public static int insertMovie (OMTBBean omtbBean) {
		int status = 0;
		Connection connection = LoginDao.getConnection();;
		try {
			CallableStatement callableStatement = connection.prepareCall("call addMovie(?,?,?,?,?,?,?,?,?,?,?,?,?)");
			callableStatement.setString(1, omtbBean.getMovieName());
			callableStatement.setInt(2, omtbBean.getCityId());
			callableStatement.setString(3, omtbBean.getPosterLink());
			callableStatement.setString(4, omtbBean.getCast1());
			callableStatement.setString(5, omtbBean.getCast2());
			callableStatement.setString(6, omtbBean.getCast3());
			callableStatement.setString(7, omtbBean.getCast4());
			callableStatement.setString(8, omtbBean.getCast5());
			callableStatement.setString(9, omtbBean.getCastImage1());
			callableStatement.setString(10, omtbBean.getCastImage2());
			callableStatement.setString(11, omtbBean.getCastImage3());
			callableStatement.setString(12, omtbBean.getCastImage4());
			callableStatement.setString(13, omtbBean.getCastImage5());
			status = callableStatement.executeUpdate();
		}
		catch (SQLException exception) {
			exception.printStackTrace();
		}
		finally
		{
			try {
				connection.close();
			} catch (SQLException exception) {
				exception.printStackTrace();
			}
		}
		return status;
	}
	
	public static int insertTheater (OMTBBean omtbBean) {
		int status = 0, id = 0;
		String seatStatus="";
		Connection connection = LoginDao.getConnection();;
		try {
			CallableStatement callableStatement = connection.prepareCall("call addTheater(?,?,?,?,?,?,?,?)");
			callableStatement.setString(1, omtbBean.getTheaterName());
			callableStatement.setString(2, omtbBean.getTheaterAddress());
			callableStatement.setFloat(3, omtbBean.getFare());
			callableStatement.setInt(4, omtbBean.getNumberOfSeats());
			callableStatement.setString(5, omtbBean.getMovieStartDate());
			callableStatement.setString(6, omtbBean.getMovieEndDate());
			callableStatement.setString(7, omtbBean.getShowTime());
			callableStatement.setInt(8, omtbBean.getMovieId());
			status = callableStatement.executeUpdate();
			if(status==1)
			{
				CallableStatement callStatement = connection.prepareCall("call retriveLastId()");
				ResultSet resultSet = callStatement.executeQuery();
				while(resultSet.next())
				{
					id = resultSet.getInt(1);
				}
				List<Integer> seats = new ArrayList<>();
				for(int index=0;index<omtbBean.getNumberOfSeats();index++)
				{
				seats.add(index,0);
				seatStatus+=seats.get(index)+"*";
				}
				String[] startDay = omtbBean.getMovieStartDate().split("-");
				String[] endDay = omtbBean.getMovieEndDate().split("-");
				int beginingDate = Integer.valueOf(startDay[2]),endingDate=Integer.valueOf(endDay[2]);
				String[] timeArray = omtbBean.getShowTime().split(",");
				while(beginingDate!=endingDate+1)
				{
					for(int index=0;index<timeArray.length;index++) {
						try {
						CallableStatement call= connection.prepareCall("call addSeats(?,?,?,?)");
						call.setInt(1, beginingDate);
						call.setString(2, timeArray[index]);
						call.setString(3, seatStatus);
						call.setInt(4, id);
						status=call.executeUpdate();
						}
						catch (SQLException exception) {
							exception.printStackTrace();
						}
					}
					beginingDate++;
					if(startDay[1].equals("1")||startDay[1].equals("3")||startDay[1].equals("5")||startDay[1].equals("7")||startDay[1].equals("8")||startDay[1].equals("9")||startDay[1].equals("11"))
						{if(beginingDate>31)
							beginingDate=1;
						}
					else if(startDay[1].equals("2"))
						{if(beginingDate>29)
							beginingDate=1;}
					else
						{if(beginingDate>30)
						beginingDate=1;}
				}
			}
		}
		catch (SQLException exception) {
			exception.printStackTrace();
		}
		finally
		{
			try {
				connection.close();
			} catch (SQLException exception) {
				exception.printStackTrace();
			}
		}
		return status;
	}
	public static List<OMTBBean> viewCities() {
		Connection connection = LoginDao.getConnection();;
		List<OMTBBean> result = new ArrayList<OMTBBean>();
		try {
			CallableStatement callableStatement = connection.prepareCall("call getCity()");
			ResultSet resultSet = callableStatement.executeQuery();
			while (resultSet.next()) {  
				OMTBBean omtbBean = new OMTBBean();
				omtbBean.setCityId(resultSet.getInt(1));
				omtbBean.setCityName(resultSet.getString(2));
				result.add(omtbBean);
			}
		}
		catch (SQLException exception) {
			exception.printStackTrace();
		}
		finally
		{
			try {
				connection.close();
			} catch (SQLException exception) {
				exception.printStackTrace();				
			}
		}
		return result;
	}
	public static List<OMTBBean> viewMovies(int cityId) {
		Connection connection = LoginDao.getConnection();;
		List<OMTBBean> result = new ArrayList<OMTBBean>();
		try {
			CallableStatement callableStatement = connection.prepareCall("call getMovie(?)");
			callableStatement.setInt(1, cityId);
			ResultSet resultSet = callableStatement.executeQuery();
			while (resultSet.next()) {  
				OMTBBean omtbBean = new OMTBBean();
				omtbBean.setMovieId(resultSet.getInt(1));
				omtbBean.setMovieName(resultSet.getString(2));
				result.add(omtbBean);
			}
		}
		catch (SQLException exception) {
			exception.printStackTrace();
		}
		finally
		{
			try {
				connection.close();
			} catch (SQLException exception) {
				exception.printStackTrace();
			}
		}
		return result;	
	}

	public static List<OMTBBean> viewTheaters(int movieId) {
		Connection connection = LoginDao.getConnection();
		List<OMTBBean> result = new ArrayList<OMTBBean>();
		try {
			CallableStatement callableStatement = connection.prepareCall("call getTheater(?)");
			callableStatement.setInt(1, movieId);
			ResultSet resultSet = callableStatement.executeQuery();
			while (resultSet.next()) {  
				OMTBBean omtbBean = new OMTBBean();
				omtbBean.setTheaterName(resultSet.getString(1));
				omtbBean.setTheaterAddress(resultSet.getString(2));
				omtbBean.setFare(resultSet.getFloat(3));
				omtbBean.setShowTime(resultSet.getString(7));
				result.add(omtbBean);
			}
		}
		catch (SQLException exception) {
			exception.printStackTrace();
		}
		finally
		{
			try {
				connection.close();
			} catch (SQLException exception) {
				exception.printStackTrace();
			}
		}
		return result;
		
	}

	public static int deleteCity(int id) {
		int status = 0;
		Connection connection = LoginDao.getConnection();
		try {
			CallableStatement callableStatement = connection.prepareCall("call deleteCity(?)");
			callableStatement.setInt(1, id);
			status = callableStatement.executeUpdate();
		}
		catch (SQLException exception) {
			exception.printStackTrace();
		}
		finally
		{
			try {
				connection.close();
			} catch (SQLException exception) {
				exception.printStackTrace();
			}
		}
		return status;
	}

	public static int deleteMovie(int id) {
		int status = 0;
		Connection 	connection = LoginDao.getConnection();
		try {
			CallableStatement callableStatement = connection.prepareCall("call deleteMovie(?)");
			callableStatement.setInt(1, id);
			status = callableStatement.executeUpdate();
		}
		catch (SQLException exception) {
			exception.printStackTrace();
		}
		finally
		{
			try {
				connection.close();
			} catch (SQLException exception) {
				exception.printStackTrace();
			}
		}
		return status;
	}
	public static int deleteTheater(int id) {
		int status = 0;
		Connection connection = LoginDao.getConnection();
		try {
			CallableStatement callableStatement = connection.prepareCall("call deleteTheater(?)");
			callableStatement.setInt(1, id);
			status = callableStatement.executeUpdate();
		}
		catch (SQLException exception) {
			exception.printStackTrace();
		}
		finally
		{
			try {
				connection.close();
			} catch (SQLException exception) {
				exception.printStackTrace();
			}
		}
		return status;
	}
	public static OMTBBean getCast(int movieId) {
		Connection connection = LoginDao.getConnection();
		OMTBBean omtbBean = new OMTBBean();
		try {
		CallableStatement callableStatement = connection.prepareCall("call viewCast(?)");
		callableStatement.setInt(1, movieId);
		ResultSet result = callableStatement.executeQuery();
		while (result.next()) {
		omtbBean.setPosterLink(result.getString(1));
		omtbBean.setCastImage1(result.getString(2));
		omtbBean.setCastImage2(result.getString(3));
		omtbBean.setCastImage3(result.getString(4));
		omtbBean.setCastImage4(result.getString(5));
		omtbBean.setCastImage5(result.getString(6));
		omtbBean.setCast1(result.getString(7));
		omtbBean.setCast2(result.getString(8));
		omtbBean.setCast3(result.getString(9));
		omtbBean.setCast4(result.getString(10));
		omtbBean.setCast5(result.getString(11));
		}
		}
		catch (SQLException exception) {
		exception.printStackTrace();
		}
		finally
		{
			try {
				connection.close();
			} catch (SQLException exception) {
				exception.printStackTrace();
			}
		}
		return omtbBean;
		}
}