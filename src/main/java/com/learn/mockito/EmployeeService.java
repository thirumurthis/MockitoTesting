package com.learn.mockito;

import java.util.List;

public class EmployeeService {
	
	private EmployeeDao employeeDao;
	
	
	public List<Employee> getDepartSearch(String deptSearchStr, List<Employee> employeeList){
		return employeeDao.getEmployeeFromDepart(deptSearchStr, employeeList);
	}

	public int addNumbers(int a , int b) {
		int doubleandadd = add.addNum(2*a, 2*b);
		int tripleandadd = add.addNum(3*a, 3*b);
		return add.addNum(doubleandadd, tripleandadd);
	}
	
	public int addNumbers(long a , long b) {
		int doubleandadd = add.addNum(2*a, 2*b);
		int tripleandadd = add.addNum(3*a, 3*b);
		return add.addNum(doubleandadd, tripleandadd);
	}
	
	private AddNumbers add;
	
	public void setAdd(AddNumbers add) {
		this.add = add;
	}
	
	public void setEmployeeDao(EmployeeDao employeeDao) {
		this.employeeDao = employeeDao;
	}
}
