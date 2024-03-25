package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertDemo {

	public static void main(String[] args) {
		
		String driverName = "org.postgresql.Driver";
		String url = "jdbc:postgresql://localhost:5432/batch9db";
		String username= "batch9";
		String password = "batch9";
		
		Connection con = null;
		
		try {
			Class.forName(driverName);
			System.out.println("Driver loaded...");			
			con = DriverManager.getConnection(url, username, password);
			System.out.println("Connection established...");				
			
			String sql = "insert into employee_tbl values(1004,'emp4',82000,20)";
			
			Statement st = con.createStatement();
			int result = st.executeUpdate(sql); //insert, delete, update sql commands
	
			System.out.println("record saved");			
			
		}
		catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		
		finally {
			try {
				con.close();
				System.out.println("Connection closed...");
			} catch (SQLException e) {				
				e.printStackTrace();
			}				
		}		

	}

}
