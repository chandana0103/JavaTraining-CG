package com.abc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {

	private final static String DRIVERNAME = "org.postgresql.Driver";
	private final static String URL = "jdbc:postgresql://localhost:5432/batch9db";
	private final static String USERNAME = "batch9";
	private final static String PASSWORD  = "batch9";
	
	public static Connection getDBConnection() {
		Connection con = null;
		
		try {
			Class.forName(DRIVERNAME);
			con = DriverManager.getConnection(URL, USERNAME, PASSWORD);		
		} 
		catch (ClassNotFoundException e) {			
			e.printStackTrace();
		}	
		catch (SQLException e) {			
			e.printStackTrace();
		}
		return con;
		
	}
}
