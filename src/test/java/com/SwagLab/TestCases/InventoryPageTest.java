package com.SwagLab.TestCases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class InventoryPageTest extends BaseClass
{
	
	@BeforeClass
	public void pageSetup()
	{
		lp.doLogin("standard_user","secret_sauce");
	}
	
  @Test(priority=1)
  public void verifyProductCount()
  {
	  ip.getProductCount();
  }
  
  @Test(priority=2)
  public void verifyProductList()
  {
	  ip.getProductNames();
  }
  
  
  @Test(priority=3)
  public void ValidateAddToCart()
  {
	  ip.addProductToCart("Test.allTheThings() T-Shirt (Red)");
	  addWait();
  }
  
  @Test(priority=4)
  public void verifyCartPage()
  {
	 ip.getCartPage();
	 addWait();
  }
}
