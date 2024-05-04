package com.CoreJavaWeek1;

public class StudentData
{
	/*
	 * Class is collection of similar type of Object
	 */
	//data
	public int id;
	public String name;
	
	//function-Business logic
	public void display()
	{
		System.out.println("Student id is: "+id);
		System.out.println("Student name is: "+name);
	}
	
	
	public static void main(String[] args)
	{
		// Entry point--->Execution
		/*
		 * To access anything from class create Object
		*/
		
		StudentData s1=new StudentData();
		s1.id=101;
		s1.name="Kiran";
		s1.display();
		
		StudentData s2=new StudentData();
		s2.id=201;
		s2.name="Smita";
		s2.display();
		
		
		
		
		
		
		
		

	}

}
