package com.CoreJavaWeek2.ControlFlowStatements;

public class NestedForLoop {

	public static void main(String[] args)
	{

		//Patterns
		for(int r=1;r<=4;r++)
		{
			for(int c=1;c<=4;c++)
			{
				System.out.print("*"+" " );
			}
			System.out.println();//next line after one row
		}

		System.out.println("*******************");
		
		
		
		for(int r=1;r<=5;r++)
		{
			for(int c=1;c<=r;c++)
			{
				System.out.print("*"+" ");
			}
			System.out.println();//next row
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
