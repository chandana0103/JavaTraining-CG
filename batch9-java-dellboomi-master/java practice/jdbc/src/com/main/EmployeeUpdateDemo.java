package com.main;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.util.DBUtil;

public class EmployeeUpdateDemo {

	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement ps = null;

		con = DBUtil.getDBConnection();

		String sql = "update employee_tbl set salary = ? where empid = ?";	

		double newSalary = 67000;
		int empId = 1008;

		try {
			ps = con.prepareStatement(sql);
			ps.setDouble(1, newSalary);
			ps.setInt(2, empId);

			ps.executeUpdate();
			System.out.println("Employee Salary updated");

		} catch (SQLException e) {			
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
