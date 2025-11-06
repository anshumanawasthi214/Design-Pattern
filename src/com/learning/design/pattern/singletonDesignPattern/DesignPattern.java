package com.learning.design.pattern.singletonDesignPattern;

public class DesignPattern {

	public static void main(String[] args) {
		SingletonDesignPattern singleObject1=SingletonDesignPattern.getObject();
		System.out.println(singleObject1.hashCode());
		
		
		SingletonDesignPattern singleObject2=SingletonDesignPattern.getObject();
		System.out.println(singleObject2.hashCode());

		SingletonDesignPattern singleObject3=SingletonDesignPattern.getObject();
		System.out.println(singleObject3.hashCode());

		SingletonDesignPattern singleObject4=SingletonDesignPattern.getObject();
		System.out.println(singleObject4.hashCode());

		

		
		

	}

}
		