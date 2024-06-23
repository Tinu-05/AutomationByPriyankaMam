package com.SwagLab.TestCases;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class LoginPageTest extends BaseClass
{
  @Test(priority=1)
  public void verifyUrl() 
  {
	lp.getUrl();  
  }
  @Test(priority=2)
  public void verifyTitle() 
  {
	  lp.getTitle();
  }
  @Test(priority=3)
  public void validateLogin() 
  {
	  lp.doLogin(pr.getData("un"),pr.getData("pwd"));
	  addWait();
  }
}
