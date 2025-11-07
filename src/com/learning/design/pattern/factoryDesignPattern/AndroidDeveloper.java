package com.learning.design.pattern.factoryDesignPattern;

public class AndroidDeveloper implements Employee {

	@Override
	public int salary() {
		System.out.println("Getting android Developer Salary");
		return 40000;
	}

}
