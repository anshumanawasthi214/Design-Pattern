package com.learning.design.pattern.AbstractDesignPattern;

public class AndroidDevFactory extends AbstractEmployeeFactory{

	@Override
	public Employee createEmployee() {
		return new AndroidDeveloper();
	}

}
