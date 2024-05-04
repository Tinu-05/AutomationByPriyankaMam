package com.CoreJavaWeek2;

public class MethodTypes 
{
	/*
	 * 1.Instance method
	 * -----------------------
	 * Method without static keyword is instance
	 * To call Instance we need Object as memory will create at the time of Object creation
	 * 
	 * 
	 * 2.static method
	 * ==============
	 * Method with static keyword is static method
	 * Memory at the time of class load so inside meta space
	 * Without object we can call static method
	 *  if you are calling static method in same class then call directly
	 *  if you are calling static method in different class the call with class name
	 *  (Reusable script=automation )
	 * 
	 */
	
	public void accept()
	{
		System.out.println("Accept method is instance method");
	}
	
	public static void display()
	{
		System.out.println("Display method is static method");
	}
	
	
	
	public static void main(String[] args)
	{
		display();
		MethodTypes.display();
		
		MethodTypes t1=new MethodTypes();
		t1.accept();
		
		//The static method display() from the type MethodTypes should be accessed in a static way
		//t1.display();
		//accept();
		


	}

}
