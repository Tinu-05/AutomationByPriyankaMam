package pageObjectModel_PageFactory;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTest extends BaseClass
{
  @Test(priority=1)
  public void verifyUrl()
  {
//	  LoginPage lp=PageFactory.initElements(driver,LoginPage.class);
//	  lp.getUrl();
	  String actUrl=lp.getAppUrl();
	  Assert.assertTrue(actUrl.contains("live"),"Url is not matching!");
	  System.out.println("Url is matching!: "+actUrl);
  }
  
  @Test(priority=2)
  public void verifyTitle()
  {
	  String actTitle=lp.getAppTitle();
	  Assert.assertTrue(actTitle.contains("HRM"),"Title is not matching!");
	  System.out.println("Title is matching!: "+actTitle);
  }
  
  @Test(priority=3)
  public void validationLogin()
  {
	  lp.doLogin("Admin","admin123");
  }
}
