package com.CoreJavaWeek3.oop.Polymorphism;

public class EmployeeData 
{
	/*
	 * constructor overloading is possible in Java 
	 */
	int id;
	String ename;
	String email;
	int acno;
	
	public EmployeeData ()
	{
		System.out.println("Default constructor calling!");
		System.out.println(id);
		System.out.println(ename);
		System.out.println(email);
		System.out.println(acno);

		
	}
	
	public EmployeeData (int id,String name,String email,int acno)
	{
		System.out.println("Parameterized constructor calling!");
		this.id=id;
		this.ename=name;
		this.email=email;
		this.acno=acno;
		
		System.out.println(id);
		System.out.println(ename);
		System.out.println(email);
		System.out.println(acno);

		
	}

	public EmployeeData (int id,String name,String email)
	{
		System.out.println("Parameterized constructor calling!");
		this.id=id;
		this.ename=name;
		this.email=email;
		
		
		System.out.println(id);
		System.out.println(ename);
		System.out.println(email);
		

		
	}
	public static void main(String[] args)
	{
		EmployeeData e1=new EmployeeData();
		
		EmployeeData e2=new EmployeeData(101,"Suresh","suresh@gmail.com",787766);

		EmployeeData e3=new EmployeeData(102,"Kiran","kiran@gnmail.com");
	}

}
