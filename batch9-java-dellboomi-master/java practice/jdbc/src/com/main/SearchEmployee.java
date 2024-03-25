package com.main;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.util.DBUtil;



public class SearchEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;

		con = DBUtil.getDBConnection();

		String sql = "select * from employee_tbl where empid = ?";	

		int empno = 112545;

		try {
			ps = con.prepareStatement(sql);
			ps.setInt(1, empno);

			rs=ps.executeQuery();

			if(rs.next()) {
				int empId = rs.getInt(1);
				String name = rs.getString(2);
				double salary = rs.getDouble(3);
				int deptno = rs.getInt(4);
				System.out.println(empId+" "+name+" "+salary+" "+deptno);				

			}
			else {
				System.out.println("Employee not exisiting with id "+empno);
			}		


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
