package com.learning.design.pattern.factoryDesignPattern;

public class DeveloperClient {
	public static void main(String args[]) {
		Employee employee=EmployeeFactory.getEmployee("Web Developer");
		int salary=employee.salary();
		System.out.println(salary);
	}
}
