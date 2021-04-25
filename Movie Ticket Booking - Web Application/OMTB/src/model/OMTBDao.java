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
		Connection connection;
		CallableStatement callableStatement = null;
		try {
			connection = LoginDao.getConnection();
			callableStatement = connection.prepareCall("call addCity(?)");
			callableStatement.setString(1, omtbBean.getCityName());
			status = callableStatement.executeUpdate();
			connection.close();
		} 
		catch (SQLException exception) {
			exception.printStackTrace();
		}
		return status;	
	}
	
	public static int insertMovie (OMTBBean omtbBean) {
		int status = 0;
		Connection connection;
		try {
			connection = LoginDao.getConnection();
			CallableStatement callableStatement = connection.prepareCall("call addMovie(?,?)");
			callableStatement.setString(1, omtbBean.getMovieName());
			callableStatement.setInt(2, omtbBean.getCityId());
			status = callableStatement.executeUpdate();
			connection.close();
		}
		catch (SQLException exception) {
			exception.printStackTrace();
		}
		return status;
	}
	
	public static int insertTheater (OMTBBean omtbBean) {
		int status = 0;
		Connection connection;
		try {
			connection = LoginDao.getConnection();
			CallableStatement callableStatement = connection.prepareCall("call addTheater(?,?,?,?)");
			callableStatement.setString(1, omtbBean.getTheaterName());
			callableStatement.setString(2, omtbBean.getTheaterAddress());
			callableStatement.setFloat(3, omtbBean.getFare());
			callableStatement.setInt(4, omtbBean.getMovieId());
			status = callableStatement.executeUpdate();
			connection.close();
		}
		catch (SQLException exception) {
			exception.printStackTrace();
		}
		return status;
	}
	
	public static List<OMTBBean> viewCities() {
		Connection connection;
		List<OMTBBean> result = new ArrayList<OMTBBean>();
		try {
			connection = LoginDao.getConnection();
			CallableStatement callableStatement = connection.prepareCall("call getCity()");
			ResultSet resultSet = callableStatement.executeQuery();
			while (resultSet.next()) {  
				OMTBBean omtbBean = new OMTBBean();
				omtbBean.setCityId(resultSet.getInt(1));
				omtbBean.setCityName(resultSet.getString(2));
				result.add(omtbBean);
			}
			connection.close();
		}
		catch (SQLException exception) {
			exception.printStackTrace();
		}
		return result;
	}
	
	public static List<OMTBBean> viewMovies(int cityId) {
		Connection connection;
		List<OMTBBean> result = new ArrayList<OMTBBean>();
		try {
			connection = LoginDao.getConnection();
			CallableStatement callableStatement = connection.prepareCall("call getMovie(?)");
			callableStatement.setInt(1, cityId);
			ResultSet resultSet = callableStatement.executeQuery();
			while (resultSet.next()) {  
				OMTBBean omtbBean = new OMTBBean();
				omtbBean.setMovieId(resultSet.getInt(1));
				omtbBean.setMovieName(resultSet.getString(2));
				result.add(omtbBean);
			}
			connection.close();
		}
		catch (SQLException exception) {
			exception.printStackTrace();
		}
		return result;
		
	}

	public static List<OMTBBean> viewTheaters(int movieId) {
		Connection connection;
		List<OMTBBean> result = new ArrayList<OMTBBean>();
		try {
			connection = LoginDao.getConnection();
			CallableStatement callableStatement = connection.prepareCall("call getTheater(?)");
			callableStatement.setInt(1, movieId);
			ResultSet resultSet = callableStatement.executeQuery();
			while (resultSet.next()) {  
				OMTBBean omtbBean = new OMTBBean();
				omtbBean.setTheaterId(resultSet.getInt(1));
				omtbBean.setTheaterName(resultSet.getString(2));
				omtbBean.setTheaterAddress(resultSet.getString(3));
				omtbBean.setFare(resultSet.getFloat(4));
				result.add(omtbBean);
			}
			connection.close();
		}
		catch (SQLException exception) {
			exception.printStackTrace();
		}
		return result;
		
	}

	public static int deleteCity(int id) {
		int status = 0;
		Connection connection;
		try {
			connection = LoginDao.getConnection();
			CallableStatement callableStatement = connection.prepareCall("call deleteCity(?)");
			callableStatement.setInt(1, id);
			status = callableStatement.executeUpdate();
		}
		catch (SQLException exception) {
			exception.printStackTrace();
		}
		return status;
	}

	public static int deleteMovie(int id) {
		int status = 0;
		Connection connection;
		try {
			connection = LoginDao.getConnection();
			CallableStatement callableStatement = connection.prepareCall("call deleteMovie(?)");
			callableStatement.setInt(1, id);
			status = callableStatement.executeUpdate();
		}
		catch (SQLException exception) {
			exception.printStackTrace();
		}
		return status;
	}

	public static int deleteTheater(int id) {
		int status = 0;
		Connection connection;
		try {
			connection = LoginDao.getConnection();
			CallableStatement callableStatement = connection.prepareCall("call deleteTheater(?)");
			callableStatement.setInt(1, id);
			status = callableStatement.executeUpdate();
		}
		catch (SQLException exception) {
			exception.printStackTrace();
		}
		return status;
	}
}
