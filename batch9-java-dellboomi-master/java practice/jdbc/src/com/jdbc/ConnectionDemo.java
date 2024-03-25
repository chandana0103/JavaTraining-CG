package com.jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDemo {

	public static void main(String[] args) throws ClassNotFoundException, SQLException  {
		String driverName = "org.postgresql.Driver";
        String url = "jdbc:postgresql://localhost:5432/mydb";
        String username= "chandana";
        String password = "chandu";

	
	//step1: register/load the driver       

	Class.forName(driverName);

	System.out.println("Driver loaded...");

	Connection con = DriverManager.getConnection(url, username, password);

	System.out.println("Connection established...");

	con.close();
    System.out.println("Connection closed...");


	}
}
