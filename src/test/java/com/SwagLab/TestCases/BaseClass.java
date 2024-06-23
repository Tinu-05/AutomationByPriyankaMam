package com.SwagLab.TestCases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import com.SwagLab.Pages.*;
import com.SwagLab.Utility.PropertiesRead;

public class BaseClass
{
	
	public WebDriver driver;
	public LoginPage lp;
	public InventoryPage ip;
	public CartPage cp;
	public CheckoutPage ch;
	public OverViewPage op;
	public PropertiesRead pr;
	
	@BeforeTest
	public void setUpBrowser()
	{
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.saucedemo.com/");
		pr=new PropertiesRead("config");
		lp=new LoginPage(driver);
		ip=new InventoryPage(driver);
		cp=new CartPage(driver);
		ch=new CheckoutPage(driver);
		op=new OverViewPage(driver);
		
	}
	
	//one time setup
//	@BeforeClass
//	public void pagesetup()
//	{
//		lp.doLogin("standard_user","secret_sauce");
//		ip.addProductToCart("Sauce Labs Backpack");
//		ip.getCartPage();
//		 addWait();
//		 cp.getCheckoutPage();
//		 ch.doCheckOut("Jay","Nigade","411047");
//	}
	
//	@BeforeClass
//	public void pageSetup()
//	{
//		System.out.println("*********LoginPage*************");
//		lp.getUrl();
//		lp.getTitle();
//		lp.doLogin("standard_user","secret_sauce");
//		
//		
//		
//		
//	}

	public static void addWait()
	{
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	@AfterTest
	public void tearDown()
	{
		driver.quit();
	}
}
