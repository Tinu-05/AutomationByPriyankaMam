package com.CoreJavaWeek1;

public class DataTypesDemo {

	public static void main(String[] args)
	{
		// Primitive data types
		//boolean 1bit true/false
		
		boolean status;//declaration
		status=true;//initialization
		
		System.out.println("boolean status is: "+status);
		boolean newstatus=false;
		
		System.out.println("boolean newstatus is: "+newstatus);

		System.out.println("**************************");
		//Numeric--->character  + Integral-->Integer and Floating point
		
		/*
		 * Character char  2byte
		 * 
		 * 1.single character 
		 * 2.Special character 
		 * 3.ASCII values of characters
		 * 
		 * A-Z  : 65 to 90
		 * a-z  : 97 to 122
		 * 0-9  : 48 to 57
		 * 
		 */
		char c1='A';
		System.out.println("Character data is: "+c1);//A
		
		char c2='$';
		System.out.println("Special character is: "+c2);//$
		
		char c3=97;//c3 hold ascii of character 'a'
		System.out.println("Character of Ascii value 97: "+c3);
		
		System.out.println("*****************************************");
		//Numeric--->Integral--->Integer(whole number) 
		/*byte 1byte  -128 to 127
		 *short  2byte -32768 to 32767
		 *int 4byte ----default type
		 *long 8byte 
		 *  
		 */
		byte b1=-128;
		byte b2=127;
		//Type mismatch: cannot convert from int to byte
		//byte b3=190;
		System.out.println("byte type data: "+b1);
		System.out.println("byte data is: "+b2);
		
		short s1=190;
		
		short s2=-32768;
		//Type mismatch: cannot convert from int to short
		//short s3=35000;
		System.out.println("short data is: "+s1);
		System.out.println("Short data is: "+s2);
		
		int i1=35000; //4byte
		
		int i2=68867658;
		//The literal 9999999999 of type int is out of range 
		//int i3=9999999999;
		
		System.out.println("integer data is: "+i1);

		System.out.println("integer data is: "+i2);
		
		//long 8byte
		long l1=9999999999L;
		System.out.println("long data is: "+l1);
		
		long l2=689L;
		System.out.println("long tye data is: "+l2);
		
		System.out.println("**********************************");
		/*
		 * Floating point 
		 * float 4byte 
		 * double 8byte (default type)
		 */
		
		
		double d1=6775548.78;
		System.out.println("Double data is: "+d1);

		float f1=79.89F;
		System.out.println("Float data is: "+f1);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
