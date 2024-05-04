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
public class SpecialMethods_Constructor
{
	//special method
	public SpecialMethods_Constructor()
	{
		System.out.println("Default Constrcutor is calling");
	}

	public SpecialMethods_Constructor(int id)
	{
		System.out.println("Parameterized Constrcutor is calling: "+id);
	}
	public static void main(String[] args)
	{
		// call Constructor
		SpecialMethods_Constructor s1=new SpecialMethods_Constructor();
		
		SpecialMethods_Constructor s2=new SpecialMethods_Constructor(500);


	}

}
