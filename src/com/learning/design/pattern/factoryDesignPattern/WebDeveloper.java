package com.learning.design.pattern.factoryDesignPattern;

public class WebDeveloper implements Employee {

	@Override
	public int salary() {
System.out.println("Getting Web Developer Salary");
		return 45000;
	}

}
