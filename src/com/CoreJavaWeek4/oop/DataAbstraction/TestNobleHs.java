package com.CoreJavaWeek4.oop.DataAbstraction;

public class TestNobleHs {

	public static void main(String[] args) 
	{

		NobleHs n1=new NobleHs();
		n1.medical();//individual
		n1.dental();//inherited abstract method
		n1.nero();//inherited abstract method
		n1.physio();//inherited abstract method
		n1.cardio();//inherited abstract method
		n1.covid19Test();
		
		System.out.println("*****************************");
		
		
		IMA i1=new NobleHs();
		i1.cardio();
		i1.physio();
		i1.covid19Test();
		
		
		System.out.println("*****************************");
		USMA u1=new NobleHs();
		u1.nero();
		u1.dental();
		u1.covid19Test();
				
		System.out.println("*****************************");
		WHO w1=new NobleHs();
		w1.covid19Test();
		
		
		
		

	}

}
