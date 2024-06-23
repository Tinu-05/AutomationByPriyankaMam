package com.SwagLab.TestCases;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class OverViewPageTest extends BaseClass
{
	@BeforeClass
	public void pagesetup()
	{

		lp.doLogin(pr.getData("un"),pr.getData("pwd"));
		ip.addProductToCart(pr.getData("pname2"));
		ip.getCartPage();
		 addWait();
		 cp.getCheckoutPage();
		 ch.doCheckOut(pr.getData("fn"),pr.getData("ln"),pr.getData("pc"));
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
