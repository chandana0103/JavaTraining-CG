package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectDemo {

	public static void main(String[] args) {

		String driverName = "org.postgresql.Driver";
		String url = "jdbc:postgresql://localhost:5432/batch9db";
		String username = "batch9";
		String password = "batch9";

		Connection con = null;

		try {
			Class.forName(driverName);
			System.out.println("Driver loaded...");
			con = DriverManager.getConnection(url, username, password);
			System.out.println("Connection established...");

			String sql = "select * from employee_tbl";

			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(sql); // for select sql command
			while (rs.next()) {
				int empno = rs.getInt(1);
				String name = rs.getString(2);
				double salary = rs.getDouble(3);
				int deptNo = rs.getInt(4);
				System.out.println(empno + " " + name + " " + salary+" "+deptNo);
			}

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
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
