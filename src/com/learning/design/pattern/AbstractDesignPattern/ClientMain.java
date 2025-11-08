package com.learning.design.pattern.AbstractDesignPattern;

public class ClientMain {
	
	public static void main(String args[]) {
		//I want to get AndroidDeveloper
		Employee emp1=EmployeeFactory.createEmployee(new AndroidDevFactory());
		emp1.name();
		System.out.println(emp1.salary());
		
		Employee emp2=EmployeeFactory.createEmployee(new WebDevFactory());
		emp2.name();
		System.out.println(emp2.salary());
		
		
		
	}

}
