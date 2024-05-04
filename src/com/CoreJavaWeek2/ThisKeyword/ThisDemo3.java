package com.CoreJavaWeek2.ThisKeyword;

public class ThisDemo3
{
	/*
	 * this() can be used to invoke current class constructor.
	 * this() is always first statement of constructor
	
	 */

	ThisDemo3()
	{
		this(101);
		System.out.println("This is Default Constructor!");
		//Constructor call must be the first statement in a constructor
		//this(100);
	}
	
	ThisDemo3(int id)
	{
		this("Riya");
		System.out.println("This is Parameterized Constructor!: "+id);
	}
	
	ThisDemo3(String name)
	{
		System.out.println("This is Parameterized Constructor!: "+name);
	}
	public static void main(String[] args) 
	{
		
		ThisDemo3 t1=new ThisDemo3();
		
	}

}
