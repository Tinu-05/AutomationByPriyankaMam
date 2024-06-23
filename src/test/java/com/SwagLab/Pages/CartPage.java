package com.SwagLab.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.SwagLab.Utility.Utility;

public class CartPage
{
private WebDriver driver;


public CartPage(WebDriver driver)
{
this.driver=driver;	
}

//locators
private By details=By.xpath("//div[@class='cart_item_label']");
private By rbtn=By.xpath("//button[text()='Remove']");
private By cbtn=By.id("continue-shopping");
private By chkbtn=By.id("checkout");
private By pquantity=By.xpath("//div[@class='cart_quantity']");



//methods
public void getDescription()
{
	String pdetails=driver.findElement(details).getText();
	System.out.println("Product details atre: "+pdetails);
}

public void doRemove()
{
	int size=driver.findElements(pquantity).size();
	if(size==1)
	{
	driver.findElement(rbtn).click();	
	}
	
	Utility.getScreenshot(driver,"ProductRemoved");
	System.out.println("Product is removed!");
}

public void doContinueShopping()
{
	driver.findElement(cbtn).click();
	
	System.out.println("Inventory page open!");
	
}


public void getCheckoutPage()
{
	driver.findElement(chkbtn).click();
	Utility.getScreenshot(driver,"CheckoutPage");
	Assert.assertTrue(driver.getCurrentUrl().contains("checkout"),"CheckOut Page not open");
	System.out.println("Checkout page is open!");
}
}
