package model;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

import java.sql.CallableStatement;

import model.LoginBean;

public class LoginDao {

	public static Connection getConnection(){   
        Connection connection = null;
        try {
        	Properties properties = new Properties();
        	properties.load(new FileInputStream("C:\\Users\\HP\\Desktop\\Propertiesfile.txt"));
        	Class.forName(properties.getProperty("className"));
        	connection = DriverManager.getConnection(properties.getProperty("dbUrl"), properties.getProperty("userName"), properties.getProperty("password"));
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
        	properties.load(new FileInputStream("C:\\Users\\HP\\Desktop\\Propertiesfile.txt"));
			CallableStatement callableStatement = connection.prepareCall(properties.getProperty("authenticateProcedure"));
			ResultSet resultSet = callableStatement.executeQuery();
			while(resultSet.next()) {
				if ((resultSet.getString(1).equals(loginBean.getEmailId())) && (!resultSet.getString(2).equals(loginBean.getPassword()))) {
					status = -1;
				}
				if ((resultSet.getString(1).equals(loginBean.getEmailId())) && (resultSet.getString(2).equals(loginBean.getPassword()))) {
					status = 1;
				}
			}
		} 
		catch (SQLException | IOException exception) {
			exception.printStackTrace();
		}
		return status;
	}
	
	public static int registerUser(LoginBean loginBean) {
		int status = 0;
		Connection connection = LoginDao.getConnection();
		try {
			Properties properties = new Properties();
        	properties.load(new FileInputStream("C:\\Users\\HP\\Desktop\\Propertiesfile.txt"));
        	CallableStatement callableStatement = connection.prepareCall(properties.getProperty("registerProcedure"));
        	callableStatement.setString(1, loginBean.getUserName());
        	callableStatement.setString(2, loginBean.getEmailId());
        	callableStatement.setString(3, loginBean.getPassword());
        	callableStatement.setString(4, loginBean.getMobileNumber());
			status = callableStatement.executeUpdate();
		} 
		catch (SQLException | IOException exception) {
			exception.printStackTrace();
		}
		return status;
	}
	
}