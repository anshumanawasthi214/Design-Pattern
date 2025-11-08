package com.learning.design.pattern.AbstractDesignPattern;

public class AndroidDeveloper implements Employee {

	@Override
	public int salary() {
		System.out.println("Salary of Android Developer is :");
		return 45000;
	}

	@Override
	public String name() {
		System.out.println("My name is Android Developer");
		return "Android Developer";
	}
}
