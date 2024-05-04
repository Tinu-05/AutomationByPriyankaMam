package com.CoreJavaWeek2;

/**
 * Constructor is special method
 * Constructor name should be same like its class name
 * Constructor is used to initialized Object
 * Constructor get called at the time of Object creation
 * Constructor should not have any return type
 * Constructor should not any special keyword final,static
 * 
 * Types
 * =======
 * 1.Default constructor : called always by JVM
 * 2.Parameterized Constructor
 * 
 * Constructor overloading is possible but Overriding is not possible
 * 
 * 
 * @author Priyanka
 *
 */
public class ConstructorDemo
{
	//instance
	int id;
	String name;
	
	//constructor
	public ConstructorDemo(int i,String n)//local data
	{
		//Initialize the object
		//instance=local
		id=i;
		name=n;
	}
	
	//method
	public void show()
	{
		System.out.println("Id is: "+id);
		System.out.println("Name is: "+name);
	}
	

	public static void main(String[] args) 
	{
		ConstructorDemo c1=new ConstructorDemo(101,"Jaya");
		c1.show();
		
		

	}

}
