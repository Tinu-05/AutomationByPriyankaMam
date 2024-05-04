package com.CoreJavaWeek2;

import java.util.Scanner;

public class RunTimeParameterPassing 
{
	public void add(int a,int b)
	{
		System.out.println("Addition is: "+(a+b));
	}

	public static void main(String[] args)
	{

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number");
		int num1=sc.nextInt();
		System.out.println("Enter seond number");
		int num2=sc.nextInt();
		
		//method call
		RunTimeParameterPassing r1=new RunTimeParameterPassing();
		r1.add(num1,num2);
		//run time parameter passing
		
		


	}

}
