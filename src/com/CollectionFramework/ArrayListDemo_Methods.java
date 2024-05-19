package com.CollectionFramework;

import java.util.ArrayList;

public class ArrayListDemo_Methods {

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
		System.out.println("Before adding elements Is list empty?: "+al.isEmpty());//true
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(30);
		al.add(90);
		al.add(70);
		
		System.out.println("After adding elements Is list empty?: "+al.isEmpty());//false

		
		System.out.println("Total Elements are: "+al.size());
		System.out.println("Is 50 is available?: "+al.contains(50));//false
		
		System.out.println("Is 20 is available?: "+al.contains(20));//true
		
		System.out.println(al);
		//to remove elements
		al.remove(3);
		System.out.println(al);
		
		//add element at specific position?
		al.add(3,77);
		System.out.println(al);
		
		//to clear the list
		al.clear();
		
		System.out.println(al);

		
		

		
		
		
		
		
		
		
		
		
		



	}

}
