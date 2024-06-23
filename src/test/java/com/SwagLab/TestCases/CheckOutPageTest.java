package com.SwagLab.TestCases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CheckOutPageTest extends BaseClass
{
	@BeforeClass
	public void pagesetup()
	{
		lp.doLogin(pr.getData("un"),pr.getData("pwd"));
		ip.addProductToCart(pr.getData("pname2"));
		ip.getCartPage();
		 addWait();
		 cp.getCheckoutPage();
	}
  @Test(priority=1)
  public void validateCheckOut()
  {
	  ch.doCheckOut(pr.getData("fn"),pr.getData("ln"),pr.getData("pc"));
  }
}
