package com.learn.mockito;

public class Employee {

	private String name;
	private int age;
	private String department;
	public Employee(String name, int age, String department ) {
		this.name=name;
		this.age=age;
		this.department=department;	
				
	}
	public int getAge() {
		return age;
	}
	public String getDepartment() {
		return department;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
