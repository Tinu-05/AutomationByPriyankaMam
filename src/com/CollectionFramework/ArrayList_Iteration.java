package com.CollectionFramework;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList_Iteration {

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
	 * 
	 * Iteration
	 * simple for loop
	 * for each loop
	 * iterator()
	 * 
	 */
	public static void main(String[] args) 
	{
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		al.add(20);
		
		System.out.println("**********Iteration using for loop**********");
		
		for(int i=0;i<al.size();i++)
			{
		System.out.println(al.get(i));
			}
		
		System.out.println("**********Iteration using foreach loop**********");

		for(Integer i:al)
		{
			System.out.println(i);
		}

		System.out.println("**********Iteration using iterator()**********");

		/*
		 * iterator() is method from Iterable Interface(parent for collection)
		 * return type of this method is  Iterator interface object
		 * 
		 * Method
		 * ==========
		 * 1.hasNext():Returns true if the iteration has more elements. 
		 * 2.next():Returns true if the iteration has more elements. 
		 * 	 next will get the element and increment the counter
		 * 
		 * Iterator is interface in java
		 */
		
		Iterator<Integer> ir=al.iterator();
		while(ir.hasNext())
		{
			System.out.println(ir.next());
		}
		
		
		
		
		
		
		
		
		
	}
	
	
	

}
