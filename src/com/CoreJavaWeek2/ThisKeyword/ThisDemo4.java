package com.CoreJavaWeek2.ThisKeyword;

public class ThisDemo4 {

	//this can be passed as an argument in the method call.

	public void m1(ThisDemo4 t)
	{
		System.out.println("This keyword invoke current class Object");
	}
	
	public void m2()
	{
		m1(this);
	}
	public static void main(String[] args)
	{

		ThisDemo4 t1=new ThisDemo4();
		t1.m2();

	}

}
