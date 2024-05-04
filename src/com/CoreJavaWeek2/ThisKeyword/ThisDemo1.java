package com.CoreJavaWeek2.ThisKeyword;

public class ThisDemo1 
{
	//instance
	int id;
	String name;
	
	public ThisDemo1(int id,String name)//local
	{//local to local
		/*
		 *  this can be used to refer current class instance variable.
		 *  this can help to differentiate between local and instance data
		 */

		this.id=id;
		this.name=name;
	}
	
	public void show()
	{
		System.out.println("id is: "+id);
		System.out.println("Name is: "+name);
	}
	
	public static void main(String[] args) 
	{

		ThisDemo1 t1=new ThisDemo1(101,"Kiran");
		t1.show();
		

	}

}
