package com.CoreJavaWeek4.oop.DataAbstraction;

public class TestShape extends Shape
{
	public void show()
	{
		System.out.println("Shape Test completed!");
	}

	public static void main(String[] args) 
	{

		//Child class ref and child class object
		TestShape t1=new TestShape();
		t1.getShape();
		t1.getshapeArea();
		t1.show();
		
		//Parent ref and Parent Object
		//Shape s1=new Shape();
		
		//Parent ref and child object
		Shape s1=new TestShape();
		s1.getShape();
		s1.getshapeArea();

	}

	@Override
	public void getshapeArea() {

		System.out.println(30);
		
	}

}
