package com.SwagLab.TestCases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class InventoryPageTest extends BaseClass
{
	
	@BeforeClass
	public void pageSetup()
	{
		lp.doLogin(pr.getData("un"),pr.getData("pwd"));
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
	  ip.addProductToCart(pr.getData("pname1"));
	  addWait();
  }
  
  @Test(priority=4)
  public void verifyCartPage()
  {
	 ip.getCartPage();
	 addWait();
  }
}
