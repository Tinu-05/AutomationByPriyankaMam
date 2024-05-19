package com.CoreJavaWeek4.oop.Inheritance;

public class AccessModifiers 
{

	       int id=101;
	public String name="Sarang";
	private long phno=98765544;
	protected int acno=987665;
	
	public static void main(String[] args)
	{
		System.out.println("Same class");
		AccessModifiers a1=new AccessModifiers();
		System.out.println(a1.id);
		System.out.println(a1.name);
		System.out.println(a1.phno);
		System.out.println(a1.acno);
	}

}
