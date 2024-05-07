package com.javaex.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class HREmpList {

	public static void main(String[] args) {
		
		String dbur1 = "jdbc:oracle:thin:@localhost:1521:xe";
		String dbuser = "hr";
		String dbpass = "hr";
		
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(dbur1, dbuser, dbpass);
			stmt = conn.createStatement();
			rs = null;
			
			String sql = "SELECT emp.first_name||' '||emp.last_name name," + 
						 "man.first_name||' '||man.last_name " +
						 "FROM employees emp JOIN employees man " +
						 "ON emp.manager_id = man.employee_id " +
						 "ORDER BY emp.first_name DESC";

			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				String empName = rs.getString(1); // 별칭을 name 이라고 써줬기 때문에 rs.getString("name"); -> 이렇게 해줘도 무방함
				String manName = rs.getString(2);
				
				System.out.printf("NAME : %s	 MANAGER : %s%n", empName, manName);
			}
			
		} catch (ClassNotFoundException e) {
			System.err.println("드라이버를 로드하지 못했습니다.");
			e.printStackTrace();
		} catch (SQLException e) {
			System.err.println("SQLError!");
			e.printStackTrace();
		} finally {
			try {
				rs.close();
			} catch (Exception e) {
				
			}
			try {
				stmt.close();
			} catch(Exception e) {
				
			}
			try {
				conn.close();
			} catch(Exception e) {
				
			}
		}
		
	}

}
