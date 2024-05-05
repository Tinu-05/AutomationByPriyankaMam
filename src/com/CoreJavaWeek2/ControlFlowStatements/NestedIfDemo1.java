package com.CoreJavaWeek2.ControlFlowStatements;

import java.util.Scanner;

public class NestedIfDemo1 {

	public static void main(String[] args)
	{
		/* marks>=90   A
		 * marks>=95  A++
		 * otherwise  B
		 * 
		 */
	
	

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter marks");
		int marks=sc.nextInt();
		
		if(marks>=90)
		{
			if(marks>=95)
			{
				System.out.println("A++");
			}else
			{
				System.out.println("A");
			}
		}else
		{
			System.out.println("B");
		}
		
		
		
		

	}

}
