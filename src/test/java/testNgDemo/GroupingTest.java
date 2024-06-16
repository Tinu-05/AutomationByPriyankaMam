package testNgDemo;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class GroupingTest {
	@Test(priority=1,groups = "SmokeTest")
	  public void registerTest()
	  {
		  System.out.println("Test for Registartion Process!");
	  }
	  @Test(priority=2,groups = "Functional")
	  public void loginTest()
	  {
		  System.out.println("Test for Login Process!");
	  }
	  
	  @Test(priority=3,groups = "Functional")
	  public void searchTest()
	  {
		  System.out.println("Test for Search Process!");
	  }
	  
	  @Test(priority=4,groups="Functional")
	  public void addToCartTest()
	  {
		  System.out.println("Test for AddToCart Process!");
	  }
	  
	 
	  @Test(priority=5,groups="SmokeTest")
	  public void logoutTest()
	  {
		  System.out.println("Test for Logout Process!");
		  //Assert.assertEquals(true, false);
	  }
}
