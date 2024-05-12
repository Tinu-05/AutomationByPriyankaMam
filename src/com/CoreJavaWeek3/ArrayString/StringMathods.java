package com.CoreJavaWeek3.ArrayString;

public class StringMathods {

	/*
	 * String is immutable class in java
	 * String is collection of characters
	 * 
	 * Ways
	 * =====
	 * 1.Using new keyword
	 * String will create inside NSCP area and SCP
	 * 
	 * 2.Using literal
	 * String will create inside SCP area
	 * 
	 * comparison
	 * =============
	 * operator == it will compare Object id
	 * equals() test the values of string it is case sensitive
	 * equalsIgnoreCase() test the value and it not case sensitive
	 */
	
	public static void main(String[] args)
	{
		
		String s1="Software Testing";
		
		//length()
		System.out.println("Length of string is: "+s1.length());
		
		//toLowerCase() toUpperCase()
		System.out.println("toUpperCase(): "+s1.toUpperCase());
		System.out.println("toLowerCase(): "+s1.toLowerCase());
		
		/*
		 * Compare String
		 * 1.equals() :case sensitive and look for exact matching value
		 * 2.equalsIgnoreCase(): case insensitive 
		 * 
		 * equals() and equalsIgnoreCase() compare string based on value
		 * compareTo() compare string based uni-code value for each character
		 * if strings are equal then you will 0 otherwise as per value either -ve or +ve number
		 */
		
		
		String s2="Software Testing";
		
		System.out.println(s1.equals(s2));//true/false
		System.out.println(s1.equalsIgnoreCase(s2));//true/true
		
		System.out.println(s1.compareTo(s2));
		
		
		//charAt(index) return character for specifi index
		
		System.out.println("Character at index 4: "+s1.charAt(4));
		
		//indexOf(char) returns index value of specific character for its first occurrance
		
		System.out.println("Index of character t: "+s1.indexOf('t'));
		
		//concat() +
		
		System.out.println(s1.concat(" has huge demand!"));
		System.out.println(s1);
		
		s1=s1.concat(" has huge demand! ");
		
		System.out.println(s1);
		s1=s1+"in IT!";
		
		System.out.println(s1);
		
		//trim() ignore white space from starting and from end of the string
		String s3="     Welcome All    ";
		
		System.out.println(s3);
		System.out.println(s3.trim());
		
		String s4="Selenium WebDriver is an API";
		
		//contains(partial match)
		System.out.println("Check String s4 contains API?: "+s4.contains("API"));//true
		System.out.println("Check for automation: "+s4.contains("Automation"));//false
		
		//startsWith(prefix)
		System.out.println("Check for String starts with Selenium?: "+s4.startsWith("Selenium"));//true
		System.out.println("Check for String starts with Sel?: "+s4.startsWith("Sel"));//true

		System.out.println("Check for String starts with S?: "+s4.startsWith("S"));//true

		System.out.println("Check for String starts with lenium?: "+s4.startsWith("lenium"));//false


		//endsWith(suffix)
		
		System.out.println("Check for String ends with API?: "+s4.endsWith("API"));//true
		System.out.println("Check for String ends with I?: "+s4.endsWith("I"));//true

		System.out.println("Check for String ends with PI?: "+s4.endsWith("PI"));//true

		
		//isEmpty()
		String s5="";
		System.out.println("Is string empty?: "+s5.isEmpty());
		
		//substring()
		System.out.println(s1);
		
		System.out.println(s1.substring(4));
		System.out.println(s1.substring(4,14));//end on last index-1
		
		System.out.println(s1);
		//replace
		System.out.println(s1.replace('T','M'));
		
		//character for even position convert into upper case and odd position convert in lower case
		String name="Software";
		String res="";
		
		char ch[]=name.toCharArray();
		for(char i:ch)
		{
		int index=name.indexOf(i);
		if(index%2==0)
		{
			res=res+name.toUpperCase().charAt(index);
		}else
		{
			res=res+name.toLowerCase().charAt(index);

		}
		}
		
		System.out.println(res);
		
		//split(regexp): regual expression means is a pattern matching
		String tools="HpQTP,Slenium,Postman,Appium,Cypress";
		System.out.println(tools);
		String arr[]=tools.split(",");
		
		for(String i:arr)
		{
			System.out.println(i);
		}
		
		
		
		System.out.println(tools.split(",")[2]);//Postman
		
		/*
		 * StringBuffer thread-safe and StringBuilder not thread-safe are mutable
		 * doesn't support literal way
		 * 
		 */
		
		StringBuilder ss1=new StringBuilder("Hello");
		System.out.println(ss1);
		ss1.append("All");
		System.out.println(ss1);
		
		//reverse string using method
		System.out.println(ss1.reverse());
		
		//reverse the string without method -string class
		String pl="Java";
		
		String rev="";
		
		System.out.println(pl);
		for(int i=pl.length()-1;i>=0;i--)
		{
			rev=rev+pl.charAt(i);
		}
		
		System.out.println(rev);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		


	}

}
