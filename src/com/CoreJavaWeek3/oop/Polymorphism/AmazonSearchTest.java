package com.CoreJavaWeek3.oop.Polymorphism;

public class AmazonSearchTest {

	public static void main(String[] args)
	{
		AmazonSearch s1=new AmazonSearch();
		s1.search("Iphone15");
		s1.search(130000);
		s1.search(75000,"SamsungS23");
		s1.search("Zarabag", 10000);
		
		
		

	}

}
