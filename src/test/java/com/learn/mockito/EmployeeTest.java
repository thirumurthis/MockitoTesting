package com.learn.mockito;

import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.ArgumentMatchers.anyList;
import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyZeroInteractions;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;

@RunWith(org.mockito.junit.MockitoJUnitRunner.class)
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

		EmployeeDao employeeDaomock = mock(EmployeeDao.class);
		EmployeeService employeeService = new EmployeeService();
		employeeService.setEmployeeDao(employeeDaomock);
		
		employeeService.getDepartSearch("Sales",emplist);
		//verify method calls 
		verify(employeeDaomock).getEmployeeFromDepart(anyString(), anyList());
	}
	
	
	  @Mock
	  private AddNumbers addNumbers;
	  
	  @Mock 
	  private EmployeeService employeeService;
	 
	 	
	//caution to use this if the implementation of hte method call changes
	//then we need to update this test too
	@Test
	public void addTest() {
		//EmployeeDao employeeDao = mock(EmployeeDao.class);
		//AddNumbers addNumbers = mock(AddNumbers.class);
		//EmployeeService employeeService = new EmployeeService(employeeDao);
		employeeService.setAdd(addNumbers);
		//mocking the return value since we are validating the logic of employee service
		when(employeeService.addNumbers(anyInt(), anyInt())).thenReturn(10);
		employeeService.addNumbers(1, 2);
		employeeService.addNumbers(1, 2);
		//add class has method overriding- long long not executed at all
		verify(employeeService,never()).addNumbers(anyLong(),anyLong());
		verify(employeeService,atLeast(2)).addNumbers(anyInt(),anyInt());
		
		//unused mock service zerointeraction
		
		  EmployeeService unusedmock = mock(EmployeeService.class);
		  
		  verifyZeroInteractions(unusedmock);
		 
	}
}

