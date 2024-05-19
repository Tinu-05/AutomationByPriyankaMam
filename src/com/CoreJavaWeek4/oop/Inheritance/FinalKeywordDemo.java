package com.CoreJavaWeek4.oop.Inheritance;

import java.util.Scanner;

//final class Demo
class Demo
{
	final int id=100;
	
	public final void accept()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your age!");
		int age=sc.nextInt();
		System.out.println("Age is: " +age);
	}
}
//The type FinalKeywordDemo cannot subclass the final class Demo
public class FinalKeywordDemo extends Demo
{

//	@Override
//	public void accept()//System.out.println();
//	{
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter your name: ");
//		String name=sc.nextLine();
//		System.out.println("Enter your age!");
//		int age=sc.nextInt();
//		System.out.println("Name is: "+name);
//		System.out.println("Age is: " +age);
//	}
	public static void main(String[] args)
	{

		FinalKeywordDemo f1=new FinalKeywordDemo();
		System.out.println(f1.id);//100
		//f1.id=200;//The final field Demo.id cannot be assigned
		System.out.println(f1.id);//100
		
		f1.accept();

	}

}
