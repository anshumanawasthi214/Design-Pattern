package com.learning.design.pattern.singletonDesignPattern;

public class SingletonDesignPattern {
		
	// This is Lazy initialization of Object: only when the first call comes, object will be create.
	
	
//	private static SingletonDesignPattern  lazyObject; //static variables don't need to initialize with any value default is null
//
//		private SingletonDesignPattern() {}//making constructor private so it can't be accessible;
//		
//		public static SingletonDesignPattern getObject(){//Using Getter to create object
//			if(lazyObject==null) {
//				lazyObject=new  SingletonDesignPattern();
//			}
//				return lazyObject;
//			
//		}
	
	
	//Eager way of object creation
	
	private static SingletonDesignPattern  eagerObject=new SingletonDesignPattern(); //static variables don't need to initialize with any value default is null
	
	// private SingletonDesignPattern() {}//making constructor private so it can't be accessible;
	
	
	
	
	/*
	 * Solution to avoid Breaking the design pattern
	 * 
	 * 1. Throw Exception from constructor, if object is already present
	 */
	
	 private  SingletonDesignPattern(){
	  			if(eagerObject!=null){
	  					throw new RuntimeException("you are trying to break singletondesignpattern");
	  			}
	  }
	 /* 
	 * 
	 */
	
	
			
			public static SingletonDesignPattern getObject(){//Using Getter to create object
					return eagerObject;
				
			}
			
			
			/*
			 * 
			 * But in Case of multithreading this law can be break beacuse multiple threads can access the same method at a time
			 *   	to avoid this, we can use "synchronized" keyword.
			 *   			this keyword can be use by two types:
			 *   					1. at method level
			 *   					2. at Block level 
			 *   
			 *   Method level is slower because in this only one thread at a time can access the complete method
			 *    
			 *    private static SingletonDesignPattern  getObject;
			 *    
			 *    
			 *    complete method is locked for one thread at a time
			 *    public static  synchronized SingletonDesignPatter getObject() {
			 *    		if(getObject==null){
			 *    		getObject=new SingletonDesignPattern();
			 *    		}
			 *    		return getObject;
			 *    }
			 * 
			 * this decreases the code performance. so to avoid this we use this synchronized() at block level
			 * 
			 * public static  synchronized SingletonDesignPatter getObject() {
			 *    		synchronized(SingletonDesignPattern.class){
			 *    		if(getObject==null){
			 *    		getObject=new SingletonDesignPattern();
			 *    		}
			 *    		return getObject;
			 * }
			 */
			
			
			
			
			
			

			

}
