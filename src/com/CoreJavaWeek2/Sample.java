package com.CoreJavaWeek2;

public class Sample 
{
	//data
	int id=101;
	
	//method
	public void m1()
	{
		System.out.println("Id is: "+id);
	}
	
	public static void main(String[] args) 
	{
		//calling function
		Sample obj;
		Sample ref=new Sample();
		ref.m1();
		
	}

}
