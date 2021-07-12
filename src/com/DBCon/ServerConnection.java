package com.DBCon;

import java.sql.Connection;
import java.sql.SQLException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class ServerConnection {
	
	public Connection getConnection() {
		
		try {
			InitialContext envContext = new InitialContext();
			Context context = (Context) envContext.lookup("java:comp/env");
			DataSource src = (DataSource) context.lookup("jdbc/dps");
			Connection conn = src.getConnection();
			
			System.out.println("Connection through Context data successful");
			
			return conn;
		} catch (NamingException e) {
			System.out.println("Error occurred when getting context details");
			System.out.println(e.getMessage());
			e.printStackTrace();
			return null;
		} catch (SQLException e) {
			System.out.println("Server: Error Occurred when connecting to the DB");
			System.out.println(e.getMessage());
			e.printStackTrace();
			return null;
		}
	}
	
}
