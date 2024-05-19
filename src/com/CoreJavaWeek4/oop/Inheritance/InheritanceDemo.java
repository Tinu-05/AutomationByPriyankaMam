package com.CoreJavaWeek4.oop.Inheritance;

class A
{
	public void m1()
	{
		System.out.println("M1 is calling!");
	}
}



class B extends A//A is parent and B is child -Single level inheritance
{
	public void m2()
	{
		System.out.println("M2 is calling!");
	}
}



class C extends B//B is parent and C is child -Multilevel inheritance
{
	public void m3()
	{
		System.out.println("M3 is calling!");
	}
}


class D extends A//A is parent and D is child- Hierarchical 
{
	public void m4()
	{
		System.out.println("M4 is calling!");
	}
	
}

//class X extends B,D
//{
//	
//}


public class InheritanceDemo {

	public static void main(String[] args) 
	{
		
			
		A a1=new A();
		a1.m1();//individual method
	
		
		D d1=new D();
		d1.m1();//inherited
		d1.m4();//individual
		
		
		
		
		
		B b1=new B();
		b1.m2();//individual
		b1.m1();//inherited
		
		
		C c1=new C();
		c1.m1();//inherited
		c1.m2();//inherited
		c1.m3();//individual

	}

}
