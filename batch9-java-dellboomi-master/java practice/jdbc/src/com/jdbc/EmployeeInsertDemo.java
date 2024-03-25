package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class EmployeeInsertDemo {

	public static void main(String[] args) {


		String driverName = "org.postgresql.Driver";
		String url = "jdbc:postgresql://localhost:5432/batch9db";
		String username= "batch9";
		String password = "batch9";

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employee Id:");
		int empId = sc.nextInt();
		System.out.println("Enter Employee Name:");
		String empName = sc.next();
		System.out.println("Enter Employee Salary:");
		double salary = sc.nextDouble();
		System.out.println("Enter Dept no:");
		int deptNo = sc.nextInt();
		sc.close();		

		Connection con = null;
		PreparedStatement ps= null;

		try {
			Class.forName(driverName);				
			con = DriverManager.getConnection(url, username, password);						

			String sql = "insert into employee_tbl values(?,?,?,?)";

			ps = con.prepareStatement(sql);
			ps.setInt(1, empId);
			ps.setString(2, empName);
			ps.setDouble(3, salary);
			ps.setInt(4, deptNo);

			int result = ps.executeUpdate(); //insert, delete, update sql commands

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
				ps.close();
				con.close();				
			} catch (SQLException e) {				
				e.printStackTrace();
			}				
		}		

	}

}