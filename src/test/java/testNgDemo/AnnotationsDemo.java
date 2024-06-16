package testNgDemo;

import org.testng.annotations.*;
import org.testng.annotations.Test;

public class AnnotationsDemo
{
  @Test(priority=1)
  public void RegisterTest() 
  {
	  System.out.println("This is Register Test");
  }
  
  @Test(priority=2)
  public void loginTest() 
  {
	  System.out.println("This is Login Test");
  }
  
  @Test(priority=3)
  public void logoutTest() 
  {
	  System.out.println("This is Logout Test");
  }
  
  
  //Annotation
  
  @BeforeMethod
  public void bmethod()
  {
	  System.out.println("BeforeMethod will run before every method");
  }
  
  @AfterMethod
  public void amethod()
  {
	  System.out.println("AfterMethod will run after every method");
  }
  
  @BeforeClass
  public void bclass()
  {
	  System.out.println("Beforeclass will run before first test case");
  }
  
  @AfterClass
  public void aclass()
  {
	  System.out.println("Afterclass will run after last test case");
  }
  
  @BeforeTest
  public void btest()
  {
	  System.out.println("BeforeTest will run before class");
	  
  }
  
  
  @AfterTest
  public void atest()
  {
	  System.out.println("AfterTest will run after class");
	  
  }
  
  @BeforeSuite
  public void bsuite()
  {
	  System.out.println("Before suite will run before test");
  }
  
  
  @AfterSuite
  public void asuite()
  {
	  System.out.println("After suite will run after test");
  }
  
  
}
