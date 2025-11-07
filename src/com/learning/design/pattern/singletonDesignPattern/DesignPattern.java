package com.learning.design.pattern.singletonDesignPattern;

import java.lang.reflect.Constructor;

public class DesignPattern {

	public static void main(String[] args) throws Exception {
		SingletonDesignPattern singleObject1=SingletonDesignPattern.getObject();
		System.out.println(singleObject1.hashCode());
		
		
		SingletonDesignPattern singleObject2=SingletonDesignPattern.getObject();
		System.out.println(singleObject2.hashCode());

		SingletonDesignPattern singleObject3=SingletonDesignPattern.getObject();
		System.out.println(singleObject3.hashCode());

		SingletonDesignPattern singleObject4=SingletonDesignPattern.getObject();
		System.out.println(singleObject4.hashCode());
		
		/*Ways to Break the SingletonDesign Pattern :=
		 * 
		 * 1.Breaking Singleton Design Pattern by Using Reflection APIs
		 * 
		 */
		 		Constructor<SingletonDesignPattern> cons=SingletonDesignPattern.class.getDeclaredConstructor();
															  cons.setAccessible(true);
					SingletonDesignPattern s4=cons.newInstance();
		
					System.out.println(s4.hashCode());		//Different HashCode for Constructor means designpattern is broken
		/* 
		 * 
		 * Solution 1:-> if object is there=>throw exception from inside constructor
		 * 
		 * Solution 2:-> Use Enum
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 */
		
		

		
		

	}

}
		