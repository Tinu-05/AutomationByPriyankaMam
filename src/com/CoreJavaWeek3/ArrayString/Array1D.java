package com.CoreJavaWeek3.ArrayString;

public class Array1D 
{
	/*
	 * Array is static data structure
	 * Array is collection of similar data type/Object
	 * Array index always start with 0
	 * length we can calculate with length variable
	 * Type: 1 D array & Multi D
	 * Ways:
	 * 1.Using new keyword
	 * Array implement in java as Object
	 * 2.Using literal
	 * 
	 */

	public static void main(String[] args)
	{
		// Declare
		int sid[]=new int[5];
		//initialize
		sid[0]=101;
		sid[1]=102;
		
		sid[3]=104;
		sid[4]=105;
		
		//read single element
		System.out.println(sid[3]);//104
		System.out.println(sid[1]);//102
		System.out.println(sid[2]);//0
		//System.out.println(sid[5]);//ArrayIndexOutOfBoundsException
		
		System.out.println("Length of array is: "+sid.length);//5
		
		//iterate array
		System.out.println("*******Iteration using for loop*********");
		
		for(int i=0;i<sid.length;i++)
		{
		System.out.println(sid[i]);	
		}
		
		System.out.println("*******Iteration using for Each loop*********");

		for(int i:sid)
		{
			System.out.println(i);
		}
		System.out.println("***************************");
		
		
		String loc[]=new String[3];
		loc[0]="Pune";
		loc[1]="Nashik";
		loc[2]="Mumbai";
		
		//literal
		String area[]={"Pune","Mumbai","Nashik"};
		
		System.out.println(area[2]);
		System.out.println("Total areas are: "+area.length);
		
		for(String i:area)
		{
			System.out.println(i);
		}
		
		System.out.println("*******************************");
		
		double marks[]= {78.66,89.44,59.77};
		System.out.println("Total Marks: "+marks.length);
		
		for(double i:marks)
		{
			System.out.println(i);
		}
		
		//sum of elements of array
		
		double sum=0;
		for(double i:marks)
		{
			sum=sum+i;
		}
		
		
		System.out.println("Sum of array elements are:"+sum);
		
		System.out.println("**********************");
		
		
		Object empData[]= {"Sarang","Pune",30,'M',9876544377L,89.77};
		
		for(Object i:empData)
		{
			System.out.println(i);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
