package com.SwagLab.TestCases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CheckOutPageTest extends BaseClass
{
	@BeforeClass
	public void pagesetup()
	{
		lp.doLogin("standard_user","secret_sauce");
		ip.addProductToCart("Sauce Labs Backpack");
		ip.getCartPage();
		 addWait();
		 cp.getCheckoutPage();
	}
  @Test(priority=1)
  public void validateCheckOut()
  {
	  ch.doCheckOut("Priyanka","Nigade","411047");
  }
}
