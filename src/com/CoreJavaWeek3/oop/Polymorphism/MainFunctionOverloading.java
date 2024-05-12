package com.CoreJavaWeek3.oop.Polymorphism;

public class MainFunctionOverloading {


	public static void main(String[] args)
	{

		System.out.println("Main() is calling with Array of String!");
		main("Testing!");
		main(1000);
	}
	
	public static void main(String args)
	{

		System.out.println("Main() is calling with String!");


	}
	
	public static void main(int args)
	{

		System.out.println("Main() is calling with int!");


	}

}
