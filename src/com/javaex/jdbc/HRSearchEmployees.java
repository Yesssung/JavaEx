package com.javaex.jdbc;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class HRSearchEmployees {

	public static void main(String[] args) {
		
		String dbur1 = "jdbc:oracle:thin:@localhost:1521:xe";
		String dbuser = "hr";
		String dbpass = "hr";
		
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		Scanner sc = new Scanner(System.in);	
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(dbur1, dbuser, dbpass);
			
			System.out.println("이름을 입력해주세오.");
			String key = sc.next();
			
			stmt = conn.createStatement();
			rs = null;
			
			String sql = "SELECT first_name||' '||last_name, email, phone_number, hire_date " +
						 "FROM employees WHERE LOWER(first_name) LIKE'%" + key.toLowerCase() + "%' OR LOWER(last_name) LIKE '%" + key.toLowerCase() + "%' ";
			
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				
				String name = rs.getString(1);
				String email = rs.getString(2);
				String number = rs.getString(3);
				Date hireDate = rs.getDate(4);

				System.out.printf("%s	%s	%s	%s%n", name, email, number, hireDate);
			}
			
		} catch (ClassNotFoundException e) {
			System.err.println("드라이버를 로드하지 못했습니다.");
		} catch (SQLException e) {
			System.err.println("SQLError!");
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
		
		sc.close();
	}

}
