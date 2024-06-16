package parallelTest;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class EdgeTestCase {
  @Test
  public void f() 
  {
	  WebDriver driver=new EdgeDriver();
	  driver.get("https://www.amazon.com");
	  System.out.println("Title is: "+driver.getTitle());
	  
  }
}
