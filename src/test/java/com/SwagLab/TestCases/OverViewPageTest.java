package com.SwagLab.TestCases;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class OverViewPageTest extends BaseClass
{
	@BeforeClass
	public void pagesetup()
	{
		lp.doLogin("standard_user","secret_sauce");
		ip.addProductToCart("Sauce Labs Backpack");
		ip.getCartPage();
		 addWait();
		 cp.getCheckoutPage();
		 ch.doCheckOut("Jay","Nigade","411047");
	}
  @Test(priority=1)
  public void verifySummary()
  {
	  op.getSummary();
  }
  
  @Test(priority=2)
  public void validateFinish() 
  {
	  op.doFinish();
  }
}
