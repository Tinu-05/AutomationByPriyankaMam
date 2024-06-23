package pageObjectModel;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTest extends BaseClass
{
  @Test(priority=1)
  public void verifyUrl()
    {
	  
	  //LoginPage lp=new LoginPage();
	  String aurl=lp.getAppUrl();
	  Assert.assertTrue(aurl.contains("live"),"Test Fail!URL Not matched!");
	  System.out.println("Test Pass!Url Matched!");
	  
  }
  
  
  @Test(priority=2)
  public void verifyTitle()
  {
	  String atitle=lp.getAppTitle();
	  Assert.assertTrue(atitle.contains("HRM"),"Test Fail: Title not matched!");
	  System.out.println("Test Pass: Title is matched!");
	  
  
  }
  
  @Test(priority=3)
  public void verifyLogin()
  {
	  lp.doLogin("Admin","admin123");
	  Assert.assertTrue(lp.getAppUrl().contains("dashboard"),"Login Fail");
	  System.out.println("Login Completed!");
  }
}
