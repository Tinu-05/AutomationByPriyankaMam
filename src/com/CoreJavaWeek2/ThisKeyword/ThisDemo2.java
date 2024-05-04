package com.CoreJavaWeek2.ThisKeyword;

public class ThisDemo2 
{
	//this can be used to invoke current class method (implicitly)

	public void m1()
	{
		System.out.println("M1() is calling!");
		m2();
		this.m2();
	}
	public void m2()
	{
		System.out.println("M2() is calling!");
	}

	public static void main(String[] args)
	{

		ThisDemo2 t1=new ThisDemo2();
		t1.m1();
		//t1.m2();

	}

}
