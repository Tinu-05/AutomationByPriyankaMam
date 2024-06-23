package com.SwagLab.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.SwagLab.Utility.Utility;

public class CheckoutPage 
{

	private WebDriver driver;
	
	public CheckoutPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	//locator
	private By fname=By.id("first-name");
	private By lname=By.id("last-name");
	private By pcode=By.id("postal-code");
	private By cbtn=By.id("continue");
	
	
	
	//methods
	public void doCheckOut(String fn,String ln,String pc)
	{
		driver.findElement(fname).sendKeys(fn);
		driver.findElement(lname).sendKeys(ln);
		driver.findElement(pcode).sendKeys(pc);
		Utility.getScreenshot(driver,"UserDetails");
		System.out.println("User Details are: "+"fname is: "+fn+" last name is: "+ln+" postalcode is: "+pc);
		
		driver.findElement(cbtn).click();
		Assert.assertTrue(driver.getCurrentUrl().contains("checkout"),"Overiview Page is not open!");
		System.out.println("Overview Page Open!");
	}
	
}
