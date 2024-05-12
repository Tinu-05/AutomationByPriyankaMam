package com.CoreJavaWeek3.ArrayString;

public class MultiDArray {

	public static void main(String[] args)
	{

		int arr[][]=new int[2][3];
		arr[0][0]=10;
		arr[0][1]=20;
		arr[0][2]=100;
		
		arr[1][0]=30;
		arr[1][1]=40;
		arr[1][2]=100;
		
		System.out.println("Total rows in array: "+arr.length);
		//row--->cell-->data
		System.out.println("Total columns are: "+arr[0].length);
		
		//single data read
		
		System.out.println(arr[0][1]);//20
		//System.out.println(arr[1][3]);//ArrayIndexOutBoundsException
		
		
	System.out.println("**************Using Nested For loop***************");
		
		for(int r=0;r<arr.length;r++)//row
		{
			for(int c=0;c<arr[r].length;c++)//col
			{
				System.out.print(arr[r][c]+" ");
			}
			System.out.println();//next row
			
			
		}
		System.out.println("**************Using ForEach loop***************");

		for(int i[]:arr)//[10,20,100]//row
		{
			for(int j:i)//cell
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
		
		System.out.println("****************************************");

		//Multi d array using literal
		
		
		Object data[][]= {{101,"Soumya"},{102,"Kiran"},{103,"Sumit"},{104,"Saranya"}};
		System.out.println("Number of Rows: "+data.length);//4
		System.out.println("Number of columns:  "+data[0].length);//2
		
		for(Object i[]:data)
		{
			for(Object j:i)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
		
		
		
		
		
	
		
		
		
		
		
		
		
		
		
		
	
	
	
	
	
	
	
	
	
	
	
		
		
		

	}

}
