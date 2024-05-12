package com.CoreJavaWeek2.ControlFlowStatements;

public class LoopDemo {

	public static void main(String[] args)
	{

		//for loop -Known iteration
		//Print welcome statement 10 time
		for(int i=1;i<=10;i++)
		{
			System.out.println("Welcome");
		}
		
		System.out.println("***************************");
		//1 to 10 numbers
		for(int i=1;i<=10;i++)
		{
			System.out.println(i);
		}
		System.out.println("***************************");
		//reverse 10 to 1 number
		
		for(int i=10;i>=1;i--)
		{
			System.out.println(i);
		}
		
		System.out.println("***************************");

		
		//write a code for sum of 100 natural numbers
		//1+2+3+4+.....+100=5050
		int num=0;
		for(int i=1;i<=100;i++)
		{
			num=num+i;
		}
		
		System.out.println("Sum of naturals 100 numbers is: "+num);
		//write a code for factorial number
		//5!=5*4*3*2*1=120
		int fact=1;
		for(int i=5;i>=1;i--)
		{
			fact=fact*i;
		}
		System.out.println("Factorial of 5 is: "+fact);
		
		
		System.out.println("******************************");
		//Entry control loop
		int i=5;
		
		while(i<10)
		{
			System.out.println("Hello");
			//breaking statement Inc/dec
			i++;
		}
		
	//while loop -entry control sum of digits
		
		//num=123 res=6
		
		int no=123,rem,sum=0;
		while(no>0)
		{
			rem=no%10;
			no=no/10;
			sum=sum+rem;
		}
		
		System.out.println(sum);
		//How to reverse the number
		//123    321
		

		System.out.println("*********************************");
		
		//do-while exit control
		
		int j=5;
		
		do {
			System.out.println(j);
			j++;
		}while(j<=10);
		
		
		System.out.println("***************************");
		
		
//		for(;;)//default condition for loop is true
//		{
//			System.out.println("Hi");//infinite time
//		}
//		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
