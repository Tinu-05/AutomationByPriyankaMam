package com.CoreJavaWeek2.ThisKeyword;

public class ThisDemo6 {

	//this can be used to return the current class instance from the method.

	public ThisDemo6 start()
	{
		System.out.println("Browser will start");
		return this;
	}
	
	public ThisDemo6 play()
	{
		System.out.println("Application will play");
		return this;
	}
	public void stop()
	{
		System.out.println("Browser will stop");
	}
	public static void main(String[] args) 
	{
		ThisDemo6 t1=new ThisDemo6();
		t1.start().play().stop();
		
		//builder pattern  or method chaining
//		t1.start();
//		t1.play();

	}

}
