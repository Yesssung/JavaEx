package com.javaex.jdbc;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

// HRSearchEmployees 와 비교해보세유
public class HRSearchEmployeesPstmt {

	public static void main(String[] args) {
		
		String dbur1 = "jdbc:oracle:thin:@localhost:1521:xe";
		String dbuser = "hr";
		String dbpass = "hr";
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		Scanner sc = new Scanner(System.in);
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(dbur1, dbuser, dbpass);
			
			System.out.println("이름을 입력해주세요.");
			String key = sc.nextLine();
			
			String sql = "SELECT first_name||' '||last_name, email, phone_number, hire_date " + 
						 "FROM employees WHERE LOWER(first_name) LIKE ? OR LOWER(last_name) LIKE ?" ;
			
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, "%" + key.toLowerCase() + "%" );
			pstmt.setString(2, "%" + key.toLowerCase() + "%" );

			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				
				String name = rs.getString(1);
				String email = rs.getString(2);
				String number = rs.getString(3);
				Date hireDate = rs.getDate(4);
				
				System.out.printf("%s	%s	%s	%s%n", name, email, number, hireDate);
			}
		} catch (ClassNotFoundException e) {
			System.err.println("드라이버를 로드하지 못했습니다.");
			e.printStackTrace();
		} catch (SQLException e ) {
			System.err.println("SQLError!");
			e.printStackTrace();
		} finally {
			try {
				if (rs != null) rs.close();
				if (pstmt != null) pstmt.close();
				if (conn != null) conn.close();
			} catch (Exception e) {
			
		}
			sc.close();
		}

	}

}
