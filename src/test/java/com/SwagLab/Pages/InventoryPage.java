package com.SwagLab.Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.SwagLab.Utility.Utility;

public class InventoryPage
{

	private WebDriver driver;
	
	//initialization of driver
	public InventoryPage(WebDriver driver)//baseclass
	{
		this.driver=driver;
		
	}
	
	//locators
	private By pcount=By.xpath("//div[@class='inventory_list']//div[@class='inventory_item_name ']");
	private By aabtn=By.id("add-to-cart");
	private By cartPage=By.xpath("//a[@class='shopping_cart_link']");
	

	//methods
	public void getProductCount()
	{
		int count=driver.findElements(pcount).size();
		Assert.assertEquals(count,6,"Count not matching!");
		System.out.println("Product count matched!..Found total "+count+" product");
	}
	
	public void getProductNames()
	{
		List<WebElement> list=driver.findElements(pcount);
		System.out.println("********Product Names are**********");
		
		for(WebElement i:list)
		{
			System.out.println(i.getText());
		}
		Utility.getScreenshot(driver,"InventoryProducts");
		
	}
	
	public void addProductToCart(String pname)
	{
		List<WebElement> list=driver.findElements(pcount);
		for(WebElement i:list)
		{
			if(i.getText().contains(pname))
			{
				i.click();
				break;
			}
			
		}
		//add to cart btn
		driver.findElement(aabtn).click();
		Utility.getScreenshot(driver,"ProductAdded");
		System.out.println("Product added To the Cart...."+pname);
		
	}
	
	public void getCartPage()
	{
		driver.findElement(cartPage).click();
		Utility.getScreenshot(driver,"CartPage");
		System.out.println("Cart Page Open!");
	}
}
