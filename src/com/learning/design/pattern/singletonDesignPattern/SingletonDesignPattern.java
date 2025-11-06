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
	
			private SingletonDesignPattern() {}//making constructor private so it can't be accessible;
			
			public static SingletonDesignPattern getObject(){//Using Getter to create object
					return eagerObject;
				
			}
	

}
