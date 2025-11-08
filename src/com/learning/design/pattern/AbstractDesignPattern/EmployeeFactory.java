package com.learning.design.pattern.AbstractDesignPattern;

public class EmployeeFactory {

	public static Employee createEmployee(AbstractEmployeeFactory factory){
		return factory.createEmployee();
	}
}
