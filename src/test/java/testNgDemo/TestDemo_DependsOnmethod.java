package testNgDemo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestDemo_DependsOnmethod {
  @Test(priority=1)
  public void registerTest() 
  {
	  System.out.println("This is Register test");
  }
  
  @Test(priority=2,dependsOnMethods="registerTest")
  public void loginTest() 
  {
	  System.out.println("This is login test");
	  Assert.assertEquals(true,false);
  }
  
  @Test(priority=3,dependsOnMethods="loginTest")
  public void logoutTest() 
  {
	  System.out.println("This is logout test");
  }
  
}
