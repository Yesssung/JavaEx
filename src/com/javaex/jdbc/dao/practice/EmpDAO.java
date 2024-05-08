package com.javaex.jdbc.dao.practice;

import java.util.List;

public interface EmpDAO {
	
	public List<EmployeeVO> getList();
	public EmployeeVO get(String name);

}
