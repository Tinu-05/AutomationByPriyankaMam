package com.CoreJavaWeek2;

public class MethodDemo 

{
	public void m1()
	{ 	m2();
		System.out.println("M1 is Calling!");
	}
	public  void m2()
	{	m3();
		System.out.println("M2 is Calling!");
	}
	public  void m3()
	{	m4();
		System.out.println("M3 is Calling!");
	}
	public  void m4()
	{	m5();
		System.out.println("M4 is Calling!");
	}
	public  void m5()
	{
		System.out.println("M5 is Calling!");	
	}

	public static void main(String[] args) 
	{
		MethodDemo ref=new MethodDemo();
		ref.m1();

	}

}
