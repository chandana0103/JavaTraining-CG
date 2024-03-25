package com.abc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.abc.bean.Employee;
import com.abc.util.DBUtil;

public class EmployeeDao {

	public void save(Employee emp) {
		
		Connection con = null;
		PreparedStatement ps = null;
		
		String sql = "insert into employee_tbl values(?,?,?,?)";
		
		try {			
			con = DBUtil.getDBConnection();			
			ps = con.prepareStatement(sql);
			ps.setInt(1, emp.getEmpno());
			ps.setString(2, emp.getName());
			ps.setDouble(3, emp.getSalary());
			ps.setInt(4, emp.getDeptNo());						
			ps.executeUpdate();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}		
	}
	
	
}
