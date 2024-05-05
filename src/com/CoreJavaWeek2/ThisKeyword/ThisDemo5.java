package com.CoreJavaWeek2.ThisKeyword;

//this can be passed as argument in the constructor call.

class A
{
	//A a;
	A()
	{
		B b1=new B(this);
	}
}

class B
{
	B(A a1)
	{
	System.out.println("This is A class Object Used!");	
	}
}



public class ThisDemo5 {

	public static void main(String[] args) 
	{
		 A a1=new A();
				 
				 

	}

}
