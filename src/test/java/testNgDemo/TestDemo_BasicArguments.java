package testNgDemo;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class TestDemo_BasicArguments
{
  @Test(priority=1,description="Test for New Registartion")
  public void registerTest()
  {
	  System.out.println("Test for Registartion Process!");
  }
  @Test(priority=2,description="Test for LoginInto Application")
  public void loginTest()
  {
	  System.out.println("Test for Login Process!");
  }
  
  @Test(priority=3,description="Test for search a product")
  public void searchTest()
  {
	  System.out.println("Test for Search Process!");
  }
  
  @Test(priority=4,description="Test for add products to cart")
  public void addToCartTest()
  {
	  System.out.println("Test for AddToCart Process!");
  }
  
  @Test(priority=5,description="Test for Logout")
  public void logoutTest()
  {
	  System.out.println("Test for Logout Process!");
  }
}
