package com.javaex.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectTest {

	public static void main(String[] args) {
		
		String dbur1 = "jdbc:oracle:thin:@localhost:1521:xe";
		String dbuser = "hr";
		String dbpass = "hr";
		
		// Connection, Statement, ResultSet
		// try - with - resources 문(자동 자원 정리)
		// AutoCloseable 인터페이스를 구현한 클래스들을 사용 가능
		
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null; // 데이터베이스에서 전달받은 결과를 객체로 받기
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(dbur1, dbuser, dbpass);
			stmt = conn.createStatement();
		
			String sql = "SELECT department_id, department_name FROM departments";
			
			rs = stmt.executeQuery(sql);	// DB Cursor 반환
			
			// ResultSet 순회
			while(rs.next()) {
				// getXXX(컬럼 순서) or getXXX(컬럼 프로젝션 이름)
				int deptId = rs.getInt(1);  							// rs.getInt("department_id")
				String deptName = rs.getString("department_name"); 		// rs.getString(2)
				
				System.out.printf("%d : %s%n", deptId, deptName);
			}
		} catch (ClassNotFoundException e) {
			System.err.println("드라이버를 로드하지 못했습니다.");
		} catch (SQLException e) {
			System.out.println("SQLError!");
		} finally {
			try {
				rs.close();
			} catch (Exception e) {
				
			}
			try {
				stmt.close();
			} catch (Exception e) {
				
			}
			try {
				conn.close();
			} catch (Exception e) {
				
			}
		}
		
	}

}
