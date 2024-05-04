package com.CoreJavaWeek1;

public class VariableDemo 
{
	/*
	 * Local variable get the memory within method
	 * Scope: Within Method
	 * 
	 * Instance memory get separate memory for every separate Object
	 * Scope: Within Object 
	 * 
	 * Static variable get the memory one time and it share that memory with every object
	 * Scope: Within class
	 * (without object)
	 */
	int id;//instance
	String name;//instance
	
	static String clgname="AISSPMS";//static 

	public void show()
	{
		int marks=90;//local- scope is within method
		System.out.println("Marks from show(): "+marks);
		
	}
	
	public void display()
	{
		int marks=88;//local to display()
		System.out.println("Marks from display(): "+marks);
	}
	
	public static void main(String[] args)
	{

		System.out.println("College name is: "+clgname);
		
		VariableDemo v1=new VariableDemo();
		v1.id=101;
		System.out.println("Student id is: "+v1.id);
		v1.name="Ram";
		System.out.println("Student name is: "+v1.name);
		v1.show();
		v1.display();
		
	

	}

}
