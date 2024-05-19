package com.CoreJavaWeek4.oop.Inheritance;

/*
 * For Run time polymophism classes must be in relation (Is-A)
 * Same name method when we declare in parent and child then child
 * class override parent class method
 * 
 * Child class provides updated method
 */
class Parent
{
	public void color()
	{
		System.out.println("Red!");
	}
}


class Child extends Parent
{
	@Override
	public void color()
	{
		System.out.println("Blue!");
	}
}



public class RuntimePolymorphism {

	public static void main(String[] args)
	{

		Child c1=new Child();
		c1.color();//blue
		
		
		Parent p1=new Parent();
		p1.color();//red
		
		Parent p2=new Child();
		p2.color();//blue
		
		
		
		

	}

}
