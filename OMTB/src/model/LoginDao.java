package model;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;
import model.LoginBean;
public class LoginDao 
{
	public static Connection getConnection(){   
        Connection connection = null;
        try {
        	Properties properties = new Properties();
        	properties.load(new FileInputStream("C:\\Users\\Gopika Rangaram\\Desktop\\aspiresys\\property.txt"));
        	Class.forName(properties.getProperty("className"));
        	connection = DriverManager.getConnection(properties.getProperty("dbUrl"),properties.getProperty("userName"),properties.getProperty("password"));
		} 
        catch (SQLException | ClassNotFoundException | IOException exception) {
			exception.printStackTrace();
		}
        return connection;
	}
	public static int authenticateLogin(LoginBean loginBean) {
		int status = 0;
		Connection connection = LoginDao.getConnection();
		try {
			Properties properties = new Properties();
			properties.load(new FileInputStream("C:\\Users\\Gopika Rangaram\\Desktop\\aspiresys\\property.txt"));
			CallableStatement call = connection.prepareCall(properties.getProperty("retrive"));
			call.setString(1, loginBean.getEmailId());
			ResultSet resultSet = call.executeQuery();
			while(resultSet.next()) {
				if (resultSet.getString(2).equals(loginBean.getPassword()) && resultSet.getString(1).equals(loginBean.getEmailId())) {
					status = 1;
					break;
				}
				if( !(resultSet.getString(2).equals(loginBean.getPassword()))){	
				status=2;
				break;
				}
			}
		} 
		catch (SQLException | IOException exception) {
			exception.printStackTrace();
		}
		return status;
	}
	public  static int registerUser(LoginBean loginBean) {
		int status = 0;
		Connection connection = LoginDao.getConnection();
		try {
			Properties properties = new Properties();
			System.out.println(loginBean.getEmailId());
			properties.load(new FileInputStream("C:\\Users\\Gopika Rangaram\\Desktop\\aspiresys\\property.txt"));
			CallableStatement call = connection.prepareCall("call checkForMail(?)");
			call.setString(1, loginBean.getEmailId());
			ResultSet resultSet = call.executeQuery();
			while(resultSet.next()) {
				if (resultSet.getString(1).equals(loginBean.getEmailId())) {
					status = 2;
					break;
				}}
			if(status==0) {
			CallableStatement call1 = connection.prepareCall(properties.getProperty("register"));
			call1.setString(1, loginBean.getUserName());
			call1.setString(2, loginBean.getEmailId());
			call1.setString(3, loginBean.getPassword());
			call1.setString(4, loginBean.getMobileNumber());
			status = call1.executeUpdate();
		}}
		catch (SQLException | IOException exception) {
			exception.printStackTrace();
		}
		return status;
	}
	public static int changePassword(LoginBean loginBean)
	{
		int status=0;
		try {
		Connection connection = LoginDao.getConnection();
		Properties properties = new Properties();
		properties.load(new FileInputStream("C:\\Users\\Gopika Rangaram\\Desktop\\aspiresys\\property.txt"));
		CallableStatement call = connection.prepareCall("call updatePassword(?,?)");
		call.setString(1, loginBean.getEmailId());
		call.setString(2, loginBean.getPassword());
		status=call.executeUpdate();
		}
		catch (SQLException | IOException exception) {
			exception.printStackTrace();
		}
		return status;
	}
}