package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDemo {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		String driverName = "org.postgresql.Driver";
		String url = "jdbc:postgresql://localhost:5432/batch9db";
		String username= "batch9";
		String password = "batch9";
		
		//step1: register/load the driver		
		Class.forName(driverName);
		System.out.println("Driver loaded...");
		
		//step2: establish the connection
		Connection con = DriverManager.getConnection(url, username, password);
		System.out.println("Connection established...");
		
		//step3: perform db operations		
		
		//step4: close the connection
		con.close();	
		System.out.println("Connection closed...");
		
	}

}
