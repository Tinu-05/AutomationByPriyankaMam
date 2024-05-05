package com.CoreJavaWeek2.ControlFlowStatements;

import java.util.Scanner;

public class SimpleIf 
{
	
	//it validate only one true condition
	
	public static void main(String[] args)
	{

		//validate age for voting 18=<
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your location");
		String loc=sc.nextLine();
		
		if(loc.equalsIgnoreCase("Pune"))
		{
			System.out.println("You can join this session!");
		}
		
		System.out.println("done!");
		
		
		
		
//		System.out.println("Enter your age");
//		int age=sc.nextInt();
//		
//		if(age>=18)
//		{
//			System.out.println("Your age is valid!");
//		}
		
		sc.close();
		

	}

}
