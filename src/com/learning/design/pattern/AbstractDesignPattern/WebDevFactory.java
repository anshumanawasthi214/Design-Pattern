package com.learning.design.pattern.AbstractDesignPattern;

public class WebDevFactory extends AbstractEmployeeFactory{

	@Override
	public Employee createEmployee() {
		return new WebDeveloper();
	}

}
