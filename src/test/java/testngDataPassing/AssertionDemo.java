package testngDataPassing;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionDemo {
  //@Test
  public void hardAssertionTest() 
  {
	  String act="Selenium WebDriver is WEBUI automation library!";
	  String exp="Selenium WebDriver is WEBUI automation library!";
	  /*
	   * When assertion fail you will get java.lang.AssertionError
	   */
	  //Assert.assertEquals(act,exp,"Assertion Fail....Strings are not equal");
	 // Assert.assertTrue(act.equals(exp),"Assertion Fail....Strings are not equal");
	  
	  //testng should not be part of actual string
	 
	  Assert.assertFalse(act.contains("testng"),"Assertion Fail...It string contains testng");
	
	  System.out.println("Assertion pass...String not contains testng");
	  
  }
  
  @Test
  public void softAssertionTest()
  {
	  
	  int a=100,b=300;
	  SoftAssert sf=new SoftAssert();
	  
	  //sf.assertEquals(a,b,"AssertionFail: ...Numbers are not equals");
	 // sf.assertTrue(a==b,"AssertionFail: ...Numbers are not equals");
	  
	  //numbers should not be same
	  sf.assertFalse(a==b,"AssertionFail: ...Numbers are  equals");
	  System.out.println("Assertion Pass:.....Numbers are not equals ");
	  
	  
	  sf.assertAll();
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
  
  
  
  
  
  
  
  
  
  
  
  
  
  
}
