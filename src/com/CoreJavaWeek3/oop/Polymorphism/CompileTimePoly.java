package com.CoreJavaWeek3.oop.Polymorphism;

public class CompileTimePoly
{
	/*
	 * Method Overloading
	 * =====================
	 * Method will overload only and only if method is declared in same class
	 * with the same name multiple time with different signature
	 * 1.Number of arguments
	 * 2.Type of Arguments
	 * 3.Order of arguments can change
	 * 
	 * Constructor overload is also possible
	 * Main() overloading also possible
	 * 
	 */
	public void add()//0 parameter
	{
		int a=10,b=20;
		System.out.println("Addition is: "+(a+b));
	}

	//number of arguments
	public void add(int a,int b)//2 parameters
	{
		System.out.println("Addition is: "+(a+b));
	}
	
	public void add(int a,int b,int c)//3 parameters
	{
		System.out.println("Addition is: "+(a+b+c));
	}
	//type of arguments
	public void add(double a,int b)//2 parameters
	{
		System.out.println("Addition is: "+(a+b));
	}
	
	
	public void add(double a,double b,double c)//3 parameters
	{
		
		
		System.out.println("Addition is: "+(a+b+c));
	}
	
	//change order of arguments
	public void add(int a,double b)//2 parameters
	{
		System.out.println("Addition is: "+(a+b));
	}
	public static void main(String[] args)
	{

		CompileTimePoly c1=new CompileTimePoly();
		c1.add();
		c1.add(100.11,100);
		c1.add(100,1000);
		c1.add(10,10,10);
		

	}

}
