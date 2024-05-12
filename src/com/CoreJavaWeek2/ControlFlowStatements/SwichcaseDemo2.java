package com.CoreJavaWeek2.ControlFlowStatements;

import java.util.Scanner;

public class SwichcaseDemo2 {

	public static void main(String[] args)
	{
		//key == value
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name of the browser");
		String browserName = sc.nextLine();
		switch (browserName.toLowerCase()) 
		{
		case "chrome": System.out.println("The test case is running on Chrome Browser");
		break;
		case "cafari": System.out.println("The test case is running on Safari Browser");

		break;
		case "edge": System.out.println("The test case is running on Edge Browser");

		break;

		default:System.out.println("OOPS ! Could not Identify the browser on which the test case is running !");
		break;
		}
		// TODO Auto-generated method stub
		sc.close();

	}

}
