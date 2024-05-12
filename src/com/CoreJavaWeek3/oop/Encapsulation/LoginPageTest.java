package com.CoreJavaWeek3.oop.Encapsulation;

public class LoginPageTest {

	public static void main(String[] args) 
	{
		LoginPage u1=new LoginPage();
		u1.setUsername("Priyanka");
		u1.setPassword("test123");
		u1.doLogin(u1.getUsername(),u1.getPassword());
		
		System.out.println("*****************************");
		LoginPage u2=new LoginPage();
		u2.setUsername("Sarang");
		u2.setPassword("test123");
		u2.doLogin(u2.getUsername(),u2.getPassword());

	}

}
