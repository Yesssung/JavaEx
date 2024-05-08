package com.javaex.jdbc.dao.practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmpDAOImplOracle implements EmpDAO{

	private Connection getConnection() throws SQLException{
		Connection conn = null;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String dbur1 = "jdbc:oracle:thin:@localhost:1521:xe";
			
			conn = DriverManager.getConnection(dbur1, DatabaseConfig.DB_USER, DatabaseConfig.DB_PASS);
			
		} catch (ClassNotFoundException e) {
			System.err.println("드라이버를 찾을 수 없습니다.");
			e.printStackTrace();
		}
		
		return conn;
	}

	@Override
	public List<EmployeeVO> getList() {

		List<EmployeeVO> list = new ArrayList<>();
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			conn = getConnection();
			stmt = conn.createStatement();
			
			String sql = "SELECT employee_id, first_name||' '||last_name, email, phone_number, hire_date, salary FROM employees";
			rs = stmt.executeQuery(sql);
			while(rs.next()) {
				Long empId = rs.getLong(1);
				String empName = rs.getString(2);
				String empEmail = rs.getString(3);
				String empPh = rs.getString(4);
				String empDate = rs.getString(5);
				Long empSalary = rs.getLong(6);
				
				EmployeeVO vo = new EmployeeVO(empId, empName, empEmail, empPh, empDate, empSalary);
				list.add(vo);
				
			}
			
		} catch(SQLException e) {
			System.err.println("SQLError!");
			e.printStackTrace();
		} finally {
			try {
				if(rs != null) rs.close();
				if(stmt != null) stmt.close();
				if(conn != null) conn.close();
			} catch (Exception e) {
				
			}
		}
		return list;
	}

	@Override
	public EmployeeVO get(String name) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		EmployeeVO vo = null;
		
		Scanner sc = new Scanner(System.in);
		
		try {
			conn = getConnection();
			
			String key = sc.nextLine();
			// 실행계획 수립
			String sql = "SELECT employee_id, first_name||' '||last_name, email, phone_number, hire_date, salary FROM employees "
					+ "WHERE LOWER(first_name) LIKE'%" + key.toLowerCase() + "%' OR LOWER(last_name) LIKE '%" + key.toLowerCase() + "%'";
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, name);
			pstmt.setString(2, name);

			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				Long empId = rs.getLong(1);
				String empName = rs.getString(2);
				String empEmail = rs.getString(3);
				String empPh = rs.getString(4);
				String empDate = rs.getString(5);
				Long empSalary = rs.getLong(6);
				
				vo = new EmployeeVO(empId, empName, empEmail, empPh, empDate, empSalary);
			}
		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null) rs.close(); 
				if (pstmt != null) pstmt.close();
				if (conn != null) conn.close();
			} catch (Exception e) {
				
			}
		}
		return vo;

	}
	
	

}
