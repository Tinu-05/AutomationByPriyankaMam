package com.CoreJavaWeek4.oop.Inheritance;

public class CarTest {

	public static void main(String[] args)
	{
		System.out.println("Scenario1: Child class ref and child class object:Parent+child");
		BMW b1=new BMW();
		b1.start();//inherited
		b1.refule();//inherited
		b1.stop();//inherited
		b1.autoEngine();//individual
		b1.price();
		
		
		Audi a1=new Audi();
		a1.start();
		a1.refule();
		a1.stop();
		a1.autoGear();
		a1.price();
		
		System.out.println("Scenario2: Parent class ref and Parent class object: Only Parent");

		Car c1=new Car();
		c1.start();
		c1.refule();
		c1.stop();
		c1.price();
		System.out.println("Scenario3: Parent class ref and child class object: Only Parent");

		Car c2=new BMW();
		c2.start();
		c2.refule();
		c2.stop();
		c2.price();//updated 
		
		Car c3=new Audi();
		c3.start();
		c3.refule();
		c3.stop();
		c3.price();//updated
		System.out.println("Scenario4: child class ref and parent class object:Invalid");
		
		//BMW b2=new Car();
		
		
		
		
		
		


	}

}
