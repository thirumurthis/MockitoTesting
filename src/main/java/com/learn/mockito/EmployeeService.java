package com.learn.mockito;

import java.util.List;

public class EmployeeService {
	
	public EmployeeService(EmployeeDao employeeDao) {
		super();
		this.employeeDao = employeeDao;
	}

	private EmployeeDao employeeDao;
	
	
	public List<Employee> getDepartSearch(String deptSearchStr, List<Employee> employeeList){
		return employeeDao.getEmployeeFromDepart(deptSearchStr, employeeList);
	}

}
