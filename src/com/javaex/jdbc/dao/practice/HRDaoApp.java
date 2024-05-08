package com.javaex.jdbc.dao.practice;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class HRDaoApp {

	public static void main(String[] args) {
		listEmployees();
//		System.out.println();
		
		getEmployeesInfo();
		System.out.println();
		
//		listEmployees();
	}

	private static void getEmployeesInfo() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 : ");
		String empName = sc.nextLine();
		
		EmpDAO dao = new EmpDAOImplOracle();
		EmployeeVO vo = dao.get(empName);
		
		if (vo != null) {
			System.out.printf("%d\t%s\t%s\t%s\t%s\t%d%n", vo.getEmpId(), vo.getEmpName(), vo.getEmpEmail(), vo.getEmpPh(), vo.getEmpDate(), vo.getEmpSalary());
		} else {
			System.out.println("레코드를 찾지 못했습니다.");
		}
		
		sc.close();
	}
	
	private static void listEmployees() {
		
		EmpDAO dao = new EmpDAOImplOracle();
		System.out.println("=========== Employees ===========");
		
		List<EmployeeVO> list = dao.getList();
		if (list.size() > 0) {
			// Iterator 순회
			Iterator<EmployeeVO> it = list.iterator();
			
			while(it.hasNext()) {
				EmployeeVO vo = it.next();
				System.out.printf("%d\t%s\t%s\t%s\t%s%d%n", vo.getEmpId(), vo.getEmpName(), vo.getEmpEmail(), vo.getEmpPh(), vo.getEmpDate(), vo.getEmpSalary());
			}
		} else {
			System.out.println("데이터가 없습니다.");
		}
	}

}
