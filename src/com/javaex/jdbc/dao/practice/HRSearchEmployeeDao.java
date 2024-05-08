package com.javaex.jdbc.dao.practice;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class HRSearchEmployeeDao {
	
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
			String key = sc.nextLine();
			
			stmt = conn.createStatement();
			
			String sql = "SELECT employee_id, first_name||' '||last_name, email, phone_number, hire_date, salary " +
						 "FROM employees WHERE LOWER(first_name) LIKE'%" + key.toLowerCase() + "%' OR LOWER(last_name) LIKE '%" + key.toLowerCase() + "%' ";
			
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				
				Long empId = rs.getLong(1);
				String empName = rs.getString(2);
				String empEmail = rs.getString(3);
				String empPh = rs.getString(4);
				Date empDate = rs.getDate(5);
				Long empSalary = rs.getLong(6);

				System.out.printf("%s	%s	%s	%s	%s %s%n", empId, empName, empEmail, empPh, empDate, empSalary);
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
		
		sc.close();
		
		
		
	}
}
