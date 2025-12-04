package com.learning.design.pattern.PrototypeDesignPattern;

public class PrototypeDesignPatternMain {
	
	public static void main(String args[]) throws InterruptedException {
		
		System.out.println("Creating Objects Using Ptototype Design Pattern : ");
		
		NetworkConnection conn=new NetworkConnection();
		
		conn.setIp("127.0.0.1");
		conn.loadVeryImportantData(); //this take time to load the data 
		
		System.out.println("Object 1: "+conn);
		
		
		
		
		// We want to create new Object of Network Connection
	
		try {
			NetworkConnection conn1=(NetworkConnection)conn.clone();// it will not take time because it just make clone of the complex object
			System.out.println("Object 2: "+conn1);
			NetworkConnection conn2=(NetworkConnection)conn.clone(); 
			System.out.println("Object 3: "+conn2);
			NetworkConnection conn3=(NetworkConnection)conn.clone();
			System.out.println("Object 4: "+conn3);
			System.out.println("Object 1: "+conn);
			System.out.println(" Now lets delete one domain from network object 2 : ");
			System.out.println("Object 2 before deleting one domain : "+conn1);
			conn1.getDomains().remove("google.com");
			System.out.println("Object 2 After removing one domain : "+conn1);
			System.out.println("Other objects wont get effected : ");
			System.out.println("Object 4: "+conn3);
			System.out.println("Object 1: "+conn);
		
			//Output 
/*Creating Objects Using Ptototype Design Pattern : 
Object 1: NetworkConnection [ip=127.0.0.1, importantData=Very Very Important Data, domains=[google.com, yahoo.com, youtube.com, meta.com, facebook.com, instagram.com, whatsapp.com, gmail.com]]
Object 2: NetworkConnection [ip=127.0.0.1, importantData=Very Very Important Data, domains=[google.com, yahoo.com, youtube.com, meta.com, facebook.com, instagram.com, whatsapp.com, gmail.com]]
Object 3: NetworkConnection [ip=127.0.0.1, importantData=Very Very Important Data, domains=[yahoo.com, youtube.com, meta.com, facebook.com, instagram.com, whatsapp.com, gmail.com]]
Object 4: NetworkConnection [ip=127.0.0.1, importantData=Very Very Important Data, domains=[yahoo.com, youtube.com, meta.com, facebook.com, instagram.com, whatsapp.com, gmail.com]]
Object 1: NetworkConnection [ip=127.0.0.1, importantData=Very Very Important Data, domains=[yahoo.com, youtube.com, meta.com, facebook.com, instagram.com, whatsapp.com, gmail.com]]

*	here we can clearly see that in output if we change any one objects value inside list then it applies on all the objects.
*	like we deleted "google.com" domain from object 2 but it applies on all the 4 objects 
*	it means here we are making "Shallow Copy" of the objects which is not preferred ........
*
*/
		}
		catch(CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}
}
