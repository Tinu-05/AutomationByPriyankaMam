package com.CoreJavaWeek2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class InputFromUsers {

	public static void main(String[] args) throws IOException 
	{
		//Scanner class
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name");
		String name=sc.nextLine();		
		System.out.println("Hello "+name);
		
		System.out.println("Enter your age: ");
		int age=sc.nextInt();
		System.out.println(age);
	
		sc.close();
		
		
		
		
		/*
		//BufferedReader class
		
		InputStreamReader ir=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(ir);
		System.out.println("Enter your age");
		String data=br.readLine();
		int age=Integer.parseInt(data);
		System.out.println(age);
		
		
		
		
/*
		//technique1: read() method reads first digit as character and returns its int
		System.out.println("Enter your age");
		int age=System.in.read();
		System.out.println((char)age);
		*/

	}

}
