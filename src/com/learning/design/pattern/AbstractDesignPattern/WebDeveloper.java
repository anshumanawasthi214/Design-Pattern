package com.learning.design.pattern.AbstractDesignPattern;

public class WebDeveloper implements Employee{

	@Override
	public int salary() {
		System.out.println("Salary of Web Developer is :");
		return 50000;
	}

	@Override
	public String name() {
		System.out.println("My name is Web Developer");
		return "Web Developer";
	}

}
