package com.CoreJavaWeek2;

import java.util.Scanner;

public class PersonData {

	public static void details(String fname,String lname,long phno)
	{
		System.out.println("Your First name is: "+fname);
		System.out.println("Your last name is: "+lname);
		System.out.println("Your phone number is: "+phno);

	}
	public static void main(String[] args)
	{

		//read the data fro  user
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter your First name:");
		String fname=sc.nextLine();
		
		System.out.println("Enter your last name:");
		String lname=sc.nextLine();
		
		System.out.println("Enter your phone number:");
		long phno=sc.nextLong();
		
		//data has to be pass to method
		details(fname,lname,phno);
		
		
	}

}
