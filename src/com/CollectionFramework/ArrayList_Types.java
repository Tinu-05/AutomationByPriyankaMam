package com.CollectionFramework;

import java.util.ArrayList;

public class ArrayList_Types {

	/*
	 * ArrayList is class implements List interface
	 * Underline data structure is Dynamic Array
	 * ArrayList internal default capacity is 10 virtual segments
	 * List is internally based on indexing!
	 * ArrayList is ordered collection
	 * ArrayList allowed duplication
	 * frequent operation is data retrieval
	 * 
	 * ArrayList is not synchronized (at a time we can handle many process)
	 * add(),get(),size(),isEmpty(),contains(),remove(),clear()
	 */
	public static void main(String[] args)
	{
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(30);
		
		System.out.println("Total Elements:  "+al.size());
		System.out.println(al);

		System.out.println("**********************");
		
		ArrayList<String> loc=new ArrayList<String>();
		loc.add("Pune");
		loc.add("Mumbai");
		loc.add("Nashik");
		loc.add("Ahemadabad");
		
		System.out.println("Total Locations: "+loc.size());
		System.out.println(loc);
		System.out.println("**********************");
		
		ArrayList<Double> marks=new ArrayList<Double>();
		marks.add(89.67);
		marks.add(55.88);
		
		System.out.println("Total marks are: "+marks.size());
		System.out.println(marks);
		
		
		System.out.println("**********************");

		ArrayList<Object> emp=new ArrayList<Object>();
		emp.add("Sarang");
		emp.add("Pune");
		emp.add('M');
		emp.add(30);
		emp.add(89.78);
		
		System.out.println(emp);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
