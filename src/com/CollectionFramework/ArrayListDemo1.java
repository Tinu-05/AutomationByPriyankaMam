package com.CollectionFramework;

import java.util.ArrayList;

public class ArrayListDemo1 {

	/*
	 * ArrayList is class implements List interface
	 * Underline data structure is Dynamic Array
	 * ArrayList internal default capacity is 10 virtual segments
	 * 
	 * ArrayList is ordered collection
	 * ArrayList allowed duplication
	 * ArrayList is not synchronized (at a time we can handle many process)
	 */
	public static void main(String[] args) 
	{
		//Ways to Declare ArrayList
		//generic
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		al.add(20);
		
		System.out.println(al);
		
		int num=al.get(0);
		System.out.println(num);
		
		
		
		/*
		//1.non-generic 1. not type safe  2.type casting
		
		ArrayList al=new ArrayList();
		al.add(101);
		al.add("Sarang");
		al.add('u');
		al.add(56.77);
		
		System.out.println(al);
		
		int num=(int) al.get(0);
		System.out.println(num);
		*/
		
		
		
		
		
		
		
		

	}

}
