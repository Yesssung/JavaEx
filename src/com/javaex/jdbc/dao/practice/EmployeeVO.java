package com.javaex.jdbc.dao.practice;

public class EmployeeVO {

	private Long empId;
	private String empName;
	private String empEmail;
	private String empPh;
	private String empDate;
	private Long empSalary;
	
	public EmployeeVO() {
		
	}

	public EmployeeVO(Long empId, String empName, String empEmail, String empPh, String empDate, Long empSalary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empEmail = empEmail;
		this.empPh = empPh;
		this.empDate = empDate;
		this.empSalary = empSalary;
	}

	public EmployeeVO(String empName, String empEmail, String empPh, String empDate, Long empSalary) {
		super();
		this.empName = empName;
		this.empEmail = empEmail;
		this.empPh = empPh;
		this.empDate = empDate;
		this.empSalary = empSalary;
	}

	public Long getEmpId() {
		return empId;
	}

	public void setEmpId(Long empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpEmail() {
		return empEmail;
	}

	public void setEmpEmail(String empEmail) {
		this.empEmail = empEmail;
	}

	public String getEmpPh() {
		return empPh;
	}

	public void setEmpPh(String empPh) {
		this.empPh = empPh;
	}

	public String getEmpDate() {
		return empDate;
	}

	public void setEmpDate(String empDate) {
		this.empDate = empDate;
	}

	public Long getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(Long empSalary) {
		this.empSalary = empSalary;
	}

	@Override
	public String toString() {
		return "EmployeeVO [empId=" + empId + ", empName=" + empName + ", empEmail=" + empEmail + ", empPh=" + empPh
				+ ", empDate=" + empDate + ", empSalary=" + empSalary + "]";
	}


	
	
}
