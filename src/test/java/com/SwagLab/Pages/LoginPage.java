package com.SwagLab.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class LoginPage 
{
	private WebDriver driver;
	
	//initialize driver
	public LoginPage(WebDriver driver)//coming from base class
	{
	this.driver=driver;	
	}
	
	//locators
	private By username=By.id("user-name");
	private By pasword=By.id("password");
	private By btn=By.id("login-button");
	
	//methods
	
	public String getUrl()
	{
		Assert.assertTrue(driver.getCurrentUrl().contains("demo"),"Url is not matching");
		System.out.println("Url is Matched: "+driver.getCurrentUrl());
		return driver.getCurrentUrl();
	}
	
	public String getTitle()
	{
		Assert.assertTrue(driver.getTitle().contains("Labs"),"Title is not matching");
		System.out.println("Title is  Matched: "+driver.getTitle());	
		return driver.getTitle();
	}
	
	public void doLogin(String un,String pws)
	{
	driver.findElement(username).sendKeys(un);
	driver.findElement(pasword).sendKeys(pws);
	driver.findElement(btn).click();
	
	Assert.assertTrue(driver.getCurrentUrl().contains("inventory"),"Login Fail");
	System.out.println("Login Completed!");
	
	}
	
	
	

}
