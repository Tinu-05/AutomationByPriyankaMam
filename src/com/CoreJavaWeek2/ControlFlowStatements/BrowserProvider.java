
package com.CoreJavaWeek2.ControlFlowStatements;

import java.util.Scanner;

public class BrowserProvider {

	public static void main(String[] args) 
	{

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your browser name");
		String bname=sc.nextLine();
		
		if(bname.equalsIgnoreCase("chrome"))
		{
			System.out.println("Test case is executing on Chorme!");
		}else if(bname.equalsIgnoreCase("firefox"))
		{
			System.out.println("Test case is executing on Firefox!");

		}else if(bname.equalsIgnoreCase("edge"))
		{
			System.out.println("Test case is executing on Edge!");
		}
		
		sc.close();
		
		
		
		
		
		
		
		
		
		
		
//		
		/*
		 * String is class
		 * For equality between string you can test with
		 * 1.equals()
		 * ===============
		 * Exact matching (String contents) it is case sensitive
		 * 
		 * 2.equalsIgnoreCase()
		 * ========================
		 *  Exact matching (String contents) it is not case sensitive
		 * 
		 
		
		
		
		String s1="Java is Platform Independent Language!";
		String s2="java is platform independent language!";
		
		if(s1.equalsIgnoreCase(s2))
		{
			System.out.println("Strings are equal");
		}else
		{
			System.out.println("Strings are not equal");
		}
		
		*/
		
		
		
		
		
		
		
		

	}

}
