package com.SwagLab.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OverViewPage
{

	private WebDriver driver;
	
	
	public OverViewPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	//locators 	
	private By summary=By.id("checkout_summary_container");
	
	private By fbtn=By.id("finish");
	
	private By msg=By.xpath("//h2[@class='complete-header']");
	
	
	//methods
	public void getSummary()
	{
		System.out.println("*******Product Summary*********");
		System.out.println(driver.findElement(summary).getText());
	}
	
	public void doFinish()
	{
		driver.findElement(fbtn).click();
		System.out.println("Success Message: "+driver.findElement(msg).getText());
	}
}
