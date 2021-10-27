package com.cogent.emsjdbc.utils;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DBUtils {
	//creates the singleton class
	private DBUtils() {
		// TODO Auto-generated constructor stub
	}
	
	private static DBUtils dbUtils;
	public static DBUtils getInstance() {
		// 
		
		if(dbUtils==null) {
			dbUtils = new DBUtils();
			return dbUtils;
		}
		return dbUtils;
	}
	public static void main(String[] args) {
		
		DBUtils  dbUtils  = getInstance();
		
		Properties  properties = dbUtils.readProperties();
		
		System.out.println(properties);
		// can u call readProperties method
		// can u print properties object
		Connection connection = dbUtils.getConnection();
		System.out.println(connection!=null);
	}
	public Properties readProperties() {
		
		Properties properties = new Properties();
		
		InputStream inputStream = getClass()//gets the current class
				.getClassLoader() //load the current the class path
				.getResourceAsStream("application.properties");
		
		try {
			properties.load(inputStream);
			return properties;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
		
	}
	// singleton pattern.
	public Connection getConnection() {
	
		Properties properties = this.readProperties();
		Connection connection = null;
		try {
			Class.forName(properties.getProperty("db.className"));
			connection = DriverManager
					.getConnection(properties.getProperty("db.url"), 
					properties.getProperty("db.username"), 
					properties.getProperty("db.password"));
			return connection;
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return null;
	}
	
	public void closeConnection(Connection connection) {
		try {
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
