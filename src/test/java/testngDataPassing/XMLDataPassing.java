package testngDataPassing;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class XMLDataPassing 
{
  @Parameters({"un","psw"})
  @Test
  public void loginTest(String un,String psw) 
  {
	  System.out.println("User Name: "+un);
	  System.out.println("Password: "+psw);
	  
  }
}
