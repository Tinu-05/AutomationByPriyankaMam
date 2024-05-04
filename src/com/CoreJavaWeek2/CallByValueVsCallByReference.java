package com.CoreJavaWeek2;

import com.CoreJavaWeek1.StudentData;

public class CallByValueVsCallByReference 
{
	public void callByValue(int a)
	{
		System.out.println("Call by value with number: "+a);
	}

	public void callByRef(StudentData s1)
	{
		System.out.println("Call by reference for StudentData class");
		s1.id=201;
		s1.name="Riya";
		s1.display();
	}
	public static void main(String[] args)
	{
		CallByValueVsCallByReference c1=new CallByValueVsCallByReference();
		/*
		 * If any method called by passing value to it then it is called call by value
		 */
		c1.callByValue(100);
		/*
		 * If any method called by passing reference(Object) to it then it is called call by reference
		 
		 */
		
		StudentData s1=new StudentData();
		c1.callByRef(s1);



	}

}
