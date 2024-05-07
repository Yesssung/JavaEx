package com.javaex.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

// HRSalary 와 비교해보세유
public class HRSalaryPstmt {

	public static void main(String[] args) {
		
		String dbur1 = "jdbc:oracle:thin:@localhost:1521:xe";
		String dbuser = "hr";
		String dbpass = "hr";
		
		Connection conn = null;
		PreparedStatement pstmt= null;
		ResultSet rs = null;
		
		Scanner sc = new Scanner(System.in);
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(dbur1, dbuser, dbpass);
			
			System.out.println("최소급여 최대급여: ");
			String key = sc.nextLine();
			
			String[] input = key.trim().split(" ");
			
			// 실행계획 수립
			String sql = "SELECT first_name||' '|| last_name, salary FROM employees " + 
						 "WHERE salary BETWEEN ? AND ? ORDER BY salary ASC";
			
			pstmt = conn.prepareStatement(sql); // 실행계획 기반으로 동적 바인딩할 준비 완료!
			
			// 동적 파라미터 바인딩
			pstmt.setString(1, input[0]);
			pstmt.setString(2, input[1]);
			
			// 쿼리수행
			rs = pstmt.executeQuery();
			
			// rs 순회 출력
			while(rs.next()) {
				
				String name = rs.getString(1);
				int salary = rs.getInt(2);
				
				System.out.printf("%s	%d%n", name, salary);
			}
		} catch (ClassNotFoundException e) {
			System.err.println("드라이버를 로드하지 못했습니다.");
			e.printStackTrace();
		} catch ( SQLException e) {
			System.err.println("SQLError!");
			e.printStackTrace();
		} finally {
			try {
				if(rs != null) rs.close();
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close();
			} catch (Exception e) {
				
			}
			sc.close();
		}
	
	}

}
