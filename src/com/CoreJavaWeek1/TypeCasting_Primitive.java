package com.CoreJavaWeek1;

public class TypeCasting_Primitive {

	public static void main(String[] args)
	{
		/*
		 * Primitive to Primitive casting!
		 *  Implicit
		 *  ---------
		 *  small size ---->large size
		 *  byte--->char-->short-->int--->long--->float--->double
		 *  
		 */
		
		byte b1=127;//1 byte
		int i1=b1;//4 byte
		System.out.println("byte to int conversion: "+i1);//127
		
		int i2=122;//4 byte
		float f1=i2;// 4byte
		System.out.println("int to float conversion is: "+f1);
		
		char ch='z';//2 byte
		int x=ch;// 4byte
		System.out.println("char to int conversion is: "+x);//Ascii of z 122
		
		
		/*
		 * Explicit casting- Manual conversion with casting operator
		 * 
		 * large size to small size
		 * double->float-->long-->int-->short->char->byte
		 * 
		 * 
		 * 
		 */
		
		long l1=9999999999L;//8byte
		int a=(int)l1;
		System.out.println("long to int conversion: "+a);
		
		double d1=9876.6787665;//8byte
		int b=(int) d1;//4byte
		System.out.println("double to int conversion: "+b);
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
