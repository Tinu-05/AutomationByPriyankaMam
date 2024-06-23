package com.SwagLab.TestCases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CartPageTest extends BaseClass

{
	@BeforeClass
	public void pageSetup()
	{
		lp.doLogin(pr.getData("un"),pr.getData("pwd"));
		ip.addProductToCart(pr.getData("pname2"));
		ip.getCartPage();
		 addWait();
	}
	
	
  @Test(priority=1)
  public void verifyDescription()
   {
	  cp.getDescription();
	  addWait();
	  
  }
  
  @Test(priority=2)
  public void validateRemove()
   {
	  cp.doRemove();
	  addWait();
  }
  
  
  @Test(priority=3)
  public void validateContinueShopping()
   {
	  cp.doContinueShopping();
	  addWait();
	  ip.addProductToCart(pr.getData("pname1"));
	  addWait();
	  ip.getCartPage();
  }
  
  @Test(priority=4)
  public void verifyCheckOutPage()
   {
	  cp.getCheckoutPage();
	  addWait();
  }
}
