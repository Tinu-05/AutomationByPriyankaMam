package com.CoreJavaWeek1;

public class OperatorDemo {

	public static void main(String[] args)
	{
		System.out.println("*******Arithemetic Operators******");
		 
		int a=20,b=10;//local
		System.out.println("Addition is: "+(a+b));
		System.out.println("Subtration is: "+(a-b));
		System.out.println("Division is: "+(a/b));
		System.out.println("Multiplication is: "+(a*b));
		System.out.println("Modulus is: "+(a%b));
		
		System.out.println("********Unary operators*******");
		/*
		 * ++(Increment)
		 * a=20; 
		 * a++= 
		 * a++ post increment
		 * ++a pre increment
		 */
		
		
		System.out.println("Post increment");
		int x=100;
		System.out.println(x);//100
		System.out.println(x++);//100
		System.out.println(x);//101
		
		System.out.println("Pre increment");

		int y=100;
		System.out.println(y);//100
		System.out.println(++y);//101
		
		
		int c=90;
		int d=c++;
		System.out.println(d);//90
		System.out.println(c);//91
		
		int p=6758;
		int r=p++;
		
		System.out.println(p);//6759
		System.out.println(r);//6758
		
		int s=49;
		int j=++s;
		System.out.println(s);//50
		System.out.println(j);//50
		
		int e=789;
		int k=++e;
		
		System.out.println(e);//790
		System.out.println(k);//790
		
		
		/*
		 * decrement
		 * a--= a=a-1
		 * 	 a-- = Post decrement
		 * 	--a  = Pre decrement
		 */
		
		int a1=90;
		System.out.println(a1);//90
		System.out.println(a1--);//90
		System.out.println(a1);//89
		
		int b1=78;
		System.out.println(b1);//78
		System.out.println(--b1);//77

		System.out.println("***************Relational operators*****************");
		
		//a1=89 b1=77 s=j=50 c=91 d=90
		
		System.out.println("Less than <: "+(a1<d));//true
		System.out.println("Greater than >: "+(c>s));//true
		System.out.println("Less than equal to <=: "+(s<=j));//true
		System.out.println("Greater than equal to >=: "+(c>=a1));//true
		System.out.println(s==j);//true
		System.out.println(s!=j);//false
		System.out.println(c<=d);//false
		System.out.println(b>j);//true
		System.out.println(j<b1);//true
		System.out.println(a1<b1);//false
		
		System.out.println("*************** Logical Operators*****************");
/*
 *  a    b          a&&b (And)     a||b(Or)   a!(Not)
 * true  true		true			true		false
 * true  false		false			true		false
 * 	
 * false true		false			true		true	
 * false false		false			false		true
 * 
 *  */
		
		System.out.println((a1>b1) && (a1<d));//true
		System.out.println((a1>b1) && (s!=j));//false
		System.out.println((s!=j) && (a1<d));//false
		System.out.println((d>c) && (s!=j));//false
		
		System.out.println((a1>b1) || (a1<d));//true
		System.out.println((a1>b1) || (s!=j));//true
		System.out.println((s!=j) || (a1<d));//true
		System.out.println((d>c) || (s!=j));//false
		
		
		//not !
		System.out.println(s==j);//true
		System.out.println(!(s==j));//false
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
