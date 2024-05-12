package com.CoreJavaWeek3.ArrayString;

public class StringDemo1 {
	/*
	 * String is immutable class in java
	 * String is collection of characters
	 * 
	 * Ways
	 * =====
	 * 1.Using new keyword
	 * String will create inside NSCP area and SCP
	 * 
	 * 2.Using literal
	 * String will create inside SCP area
	 * 
	 * comparison
	 * =============
	 * operator == it will compare Object id
	 * equals() test the values of string it is case sensitive
	 * equalsIgnoreCase() test the value and it not case sensitive
	 */
	
	public static void main(String[] args)
	{

		String s1="Hello";
		String s2="Hello";
		
		System.out.println(s1==s2);//true
		
		String s3=new String("Hello");
		String s4=new String("Hello");
		System.out.println(s3==s4);//false
		
		String s5="Hello";
		
		System.out.println(s1==s5);//true
		
		s1=s1+"All";
		
		System.out.println(s1==s5);//false
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
