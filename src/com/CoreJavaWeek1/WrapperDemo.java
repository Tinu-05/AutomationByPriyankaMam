package com.CoreJavaWeek1;

public class WrapperDemo {

	public static void main(String[] args)
	{

		//Object to Primitive= Un boxing
		
		Integer i=4567;//Object
		int num1=i.intValue();
		System.out.println("Integer to int conversion: "+num1);
		

		
		
		//primitive to Object Auto boxing
		int x=100;//primitive
		Integer i2=Integer.valueOf(x);
		System.out.println("primitive to Wrapper: Autoboxing: "+i2);
	
		System.out.println("*******************");

		//Object to primitive
		//String s1="100ABCD";
		String s1="100";
		System.out.println(s1+100);//100100
		//String--->int
		int num=Integer.parseInt(s1);//NumberFormatException
		System.out.println(num+100);//200
		
		String s2="67.88";//string
		System.out.println(s2+11.11);//67.8811.11
		double d1=Double.parseDouble(s2);
		System.out.println(d1+11.11);
		
		/*
		 * String is collections of characters 
		 * charAt(index) returns single char 
		 */
		String s3="A";
		//String to character
		char ch=s3.charAt(0);
		System.out.println(ch);
		
		
		//primitive to String valueOf()
		
		int y=100;
		System.out.println(y+90);//190
		String ss1=String.valueOf(y);
		System.out.println(ss1+90);//10090
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
