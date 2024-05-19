package com.CollectionFramework;

import java.util.ArrayList;

public class ArrayList_Employee {

	public static void main(String[] args)
	{

		Employee e1=new Employee(101,"Sarang");
		Employee e2=new Employee(102,"Amit");
		Employee e3=new Employee(103,"Ketaki");
		Employee e4=new Employee(104,"Shilpa");
		Employee e5=new Employee(105,"Sumit");
		
		ArrayList<Employee> emp=new ArrayList<Employee>();
		emp.add(e1);
		emp.add(e2);
		emp.add(e3);
		emp.add(e4);
		emp.add(e5);
		
		
		for(Employee i: emp)
		{
			System.out.println(i.eid+" : "+i.name);
			
		}


		
			

	}

}
