package com.learn.mockito;

import java.util.List;
import java.util.stream.Collectors;

public class EmployeeDao {

	public List<Employee> getEmployeeFromDepart(String deptSearchStr,List<Employee> employeeList){
		
		return employeeList.stream().filter(a->a.getDepartment().equalsIgnoreCase(deptSearchStr)).collect(Collectors.toList());
	}
}
