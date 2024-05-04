package com.CoreJavaWeek2;

import com.CoreJavaWeek1.StudentData;

public class ReturnTypesInMethod 
{
	
	public void m1()
	{
		System.out.println("M1 is calling!");
	}
/**
 * return keyword is used to return anything from method
 * return value will return to the calling method
 * when return keyword apply the return type(void)should be replace with same data type
 * @return
 */
	public int m2()
	{
		return 90;
	}
	
	public String m3()
	{
		return "Smita";
	}
	
	public char m4()
	{
		return 'g';
	}
	//return object of different class
	public StudentData m5()
	{
		StudentData s1=new StudentData();
		
		return s1;
	}
	
	//return object of same class
	public ReturnTypesInMethod m6()
	{
		//ReturnTypesInMethod r1=new ReturnTypesInMethod();
		//return r1;
		return this;
	}
	public static void main(String[] args) 
	{
		ReturnTypesInMethod r1=new ReturnTypesInMethod();
		r1.m1();
		int res=r1.m2();
		System.out.println(res);
		
		String name=r1.m3();
		System.out.println(name);
		
		char ch=r1.m4();
		System.out.println(ch);
		
		StudentData sobj=r1.m5();
		sobj.id=111;
		sobj.display();
		
		ReturnTypesInMethod obj=r1.m6();
		int num=obj.m2();
		System.out.println(num);
		

	}

}
