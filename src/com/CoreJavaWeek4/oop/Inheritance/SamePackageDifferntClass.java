package com.CoreJavaWeek4.oop.Inheritance;

public class SamePackageDifferntClass {

	public static void main(String[] args) {

		AccessModifiers a1=new AccessModifiers();
		System.out.println(a1.id);
		System.out.println(a1.name);
		System.out.println(a1.acno);
		//System.out.println(a1.phno);//The field AccessModifiers.phno is not visible

	}

}
