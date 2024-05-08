package com.javaex.jdbc.dao.practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class HRSalaryDao {
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
			
			System.out.print(" 최소급여 최대급여: ");
			String key = sc.nextLine();
			
			String[] input = key.trim().split(" ");
			
			stmt = conn.createStatement();
			
			String sql = "SELECT first_name||' '||last_name, salary " +
						 "FROM employees " + 
						 "WHERE salary BETWEEN " + input[0] + " AND " + input[1] + " ORDER BY salary";
			rs = stmt.executeQuery(sql);
			
			System.out.println("=============================================");
			while(rs.next()) {
					
				String name = rs.getString(1);
				int salary = rs.getInt(2);
			
				System.out.printf("%s		%d%n", name, salary);
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
			
			sc.close();
		}

	}


	
	
}
