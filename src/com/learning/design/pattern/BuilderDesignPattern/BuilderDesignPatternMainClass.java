package com.learning.design.pattern.BuilderDesignPattern;

public class BuilderDesignPatternMainClass {

	public static void main(String args[]) {
		
		User user=new User.UserBuilder() // creating object here
				.setEmailId("anshumanawasthi214@gmail.com")
				.setUserId("1")
				.setUsername("anshumanawasthi214")
				.build();
		
		System.out.println(user);
		
		User user1= User.UserBuilder.builder() // directly calling the object without creating here
				.setUserId("2")
				.setUsername("anshumanawasthi214")
				.build();
		
		System.out.println(user1);

		
	}
}
