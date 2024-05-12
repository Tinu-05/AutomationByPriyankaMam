package com.CoreJavaWeek3.oop.Polymorphism;

public class AmazonSearch 
{

	public void search(String pname)
	{
		System.out.println("Product searched by product name: "+pname);
	}
	
	
	public void search(int price)
	{
		System.out.println("Product searched by product price: "+price);
	}
	
	public void search(String pname,int price)
	{
		System.out.println("Product searched by product name: "+pname+" & Product price: "+price);
	}
	
	public void search(String pname,String bname)
	{
		System.out.println("Product searched by product name: "+pname+" & Product brand name: "+bname);
	}
	
	public void search(int price,String bname)
	{
		System.out.println("Product searched by product price: "+price+" & Product brand name: "+bname);
	}
}
