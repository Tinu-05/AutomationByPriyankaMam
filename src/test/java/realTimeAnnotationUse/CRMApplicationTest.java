package realTimeAnnotationUse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import org.testng.annotations.Test;

public class CRMApplicationTest extends BaseTest 
{
	
  @Test(priority=1)
  public void signIn()
  { 
	 	  //signIn
	  driver.findElement(By.linkText("Sign In")).click();
	  
	 
  } 
  @Test(priority=2,dependsOnMethods = "signIn")
  public void loginTest()
  {
	//login
	  driver.findElement(By.id("email-id")).sendKeys("test@gmail.com");
	  driver.findElement(By.id("password")).sendKeys("test123");
	  driver.findElement(By.id("submit-id")).click();
	  
  }
  
  
}
