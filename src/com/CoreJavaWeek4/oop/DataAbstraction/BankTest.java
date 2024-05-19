package com.CoreJavaWeek4.oop.DataAbstraction;

public class BankTest {

	public static void main(String[] args)
	{

		//Child class ref and child class object
		HDFC h1=new HDFC();
		h1.cust_Details();//Individual
		h1.deposite();//inherited abstract method
		h1.withdraw();//inherited abstract method
		h1.rateOfInterest();//inherited abstract method

		
		//parent ref and parent object
		//RBI r1=new RBI();//Cannot instantiate the type RBI
		
		System.out.println("**********************");
		//Parent class ref and Child class object
		RBI r1=new HDFC();
		r1.deposite();
		r1.withdraw();
		r1.rateOfInterest();
		
	}

}
