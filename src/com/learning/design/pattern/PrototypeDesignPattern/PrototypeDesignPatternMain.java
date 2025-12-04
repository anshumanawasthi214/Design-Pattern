package com.learning.design.pattern.PrototypeDesignPattern;

public class PrototypeDesignPatternMain {
	
	public static void main(String args[]) throws InterruptedException {
		
		System.out.println("Creating Objects Using Ptototype Design Pattern : ");
		
		NetworkConnection conn=new NetworkConnection();
		
		conn.setIp("127.0.0.1");
		conn.loadVeryImportantData();
		
		System.out.println(conn);
		
		
		// We want to create new Object of Network Connection
	
		try {
			NetworkConnection conn1=(NetworkConnection)conn.clone();// it will not take time because it just make clone of the complex object
			System.out.println(conn1);
		}
		catch(CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}
}
