package com.DBCon;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DBConnection {
	
	public Connection getConnection() {
		
		Properties properties = new Properties();
		
		String DBConnProperties = "DBConnection.properties";
		
		String driver = null;
		String url= null;
		String username = null;
		String password = null;
		
		try {
			
			// Get properties from DBonnection.properties
			InputStream reader = getClass().getClassLoader().getResourceAsStream(DBConnProperties);
			properties.load(reader);
			
			// Retrieve data from properties
			username = properties.getProperty("username");
			password = properties.getProperty("password");
			driver = properties.getProperty("driver");
			url = properties.getProperty("url");
			
		} catch (FileNotFoundException e) {
			System.out.println("Properties file not found");
			System.out.println(e.getMessage());
			return null;
		} catch (IOException e) {
			System.out.println("Unknown IO exception");
			System.out.println(e.getMessage());
			return null;
		}
		
		try {
			
			// Connecting to Oracle DB using the getConnection method
			Class.forName(driver);
			Connection conn = DriverManager.getConnection(url, username, password);
			
			System.out.println("Connection through properties successful");
			return conn;
			
		} catch (ClassNotFoundException e) {
			System.out.println("Class not found exception when trying to get the driver");
			System.out.println(e.getMessage());
			e.printStackTrace();
			return null;
		} catch (SQLException e) {
			System.out.println("Error Occurred when connecting to the DB");
			System.out.println(e.getMessage());
			e.printStackTrace();
			return null;
		}
		
		
	}
}
