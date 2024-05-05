package com.CoreJavaWeek2.ControlFlowStatements;

public class BranchingStatement {

	public static void main(String[] args)
	{

		//break cannot be used outside of a loop or a switch
//		if(true)
//		{
//			break;
//		}
		
		//break exit from switch and loop
		
		for(int i=1;i<=10;i++)
		{
			if(i>5)
			{
				break;
			}
			else
			{
				System.out.println(i);
			}
		}
		
		System.out.println("******************");
		//continue skip certain part of the code
		
		for(int i=1;i<=10;i++)
		{
			if(i==5)
			{
				continue;
			}else
			{
				System.out.println(i);
			}
		}

	}

}
