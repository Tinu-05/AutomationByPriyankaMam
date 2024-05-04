package com.CoreJavaWeek2;

public class CompileTimeParameterPassing 
{
	
	//static CompileTimeParameterPassing c1=new CompileTimeParameterPassing();
	
	public void add()//0 parameter method(local)
	{
		int a=10,b=20;//local variable
		System.out.println("Addition is: "+(a+b));
	}
	
	public void sub(int a,int b)//2 parameter method-local a=100 b=20
	{
		System.out.println("Subtraction is: "+(a-b));
	}

	public int mul(int a,int b)
	{
		return a*b;
	}
	public static void main(String[] args)
	{
		CompileTimeParameterPassing c1=new CompileTimeParameterPassing();
		c1.add();
		
		//compile time calling and passing parameters with original data-arguments
		c1.sub(100,20);
		
		//parameter passing without return
		c1.sub(90,50);
		//parameter passing with return
		int result=c1.mul(10,10);
		System.out.println("Multiplication result is: "+result);
		
		
		

	}

}
