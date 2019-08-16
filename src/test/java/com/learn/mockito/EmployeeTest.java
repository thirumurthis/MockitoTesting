package com.learn.mockito;

import static org.mockito.Mockito.mock;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class EmployeeTest {

	@Test
	public void testEmployeeDao() {
		
		Employee employee1 = new Employee("emp1", 25, "Sales");
		Employee employee2 = new Employee("emp1", 25, "Sales");
		List<Employee> emplist = Arrays.asList(employee1,employee2);
		//EmployeeDao employeeDao = mock(EmployeeDao.class);
		
		//when(employeeDao.getEmployeeFromDepart(anyString(),anyList())).thenReturn(emplist);
		EmployeeDao employeeDao = new EmployeeDao();
		assertEquals(2, employeeDao.getEmployeeFromDepart("Sales", emplist).size());
	}
	
	@Test
	public void testEmployeeService() {
		
		Employee employee1 = new Employee("emp1", 25, "Sales");
		Employee employee2 = new Employee("emp1", 25, "Sales");
		List<Employee> emplist = Arrays.asList(employee1,employee2);

		EmployeeDao employeeDao = mock(EmployeeDao.class);
		EmployeeService employeeService = new EmployeeService(employeeDao);
		
		employeeService.getDepartSearch("Sales",emplist);
		//verify method calls 
		verify(employeeDao).getEmployeeFromDepart(anyString(), anyList());
	}
}

