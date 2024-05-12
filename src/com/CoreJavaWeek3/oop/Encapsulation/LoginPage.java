package com.CoreJavaWeek3.oop.Encapsulation;

public class LoginPage 
{

	//Encapsulation= data + function
	
	private String username;
	private String password;
	
	//method
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	//business logic
	public void doLogin(String un,String pwd)
	{
		System.out.println("User name Entered : "+un);
		System.out.println("password Entered: "+pwd);
		System.out.println("On click() : User is able to login : "+un);
	}
	
	
	
	
	
	
}


