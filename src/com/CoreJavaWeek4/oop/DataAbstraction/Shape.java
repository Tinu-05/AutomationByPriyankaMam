package com.CoreJavaWeek4.oop.DataAbstraction;

public abstract class Shape 
{
	/*
	 * Class declare with abstract keyword called Abstract class
	 * It can have implemented and non implemented method
	 * It helps to achieve only partial abstraction
	 * Abstract method implements by child class
	 * Object we cant create for Abstract class
	 * 
	 * 
	 * Abstract method doesn't contains any body 
	 * It implements by subclass
	 */
	
	String name="Circle";
	
	//Implemented method
	public void getShape()
	{
		System.out.println("Shape is: "+name);
	}
	
	public abstract void getshapeArea();

}
