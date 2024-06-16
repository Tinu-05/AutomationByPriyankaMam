package testNgDemo;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestDemo_PriorityAtribute
 {
	WebDriver driver;
  @Test(priority=1)
  public void signIn()
  {
	  System.out.println("Test case for open SignIn page ");
	  driver=new ChromeDriver();
	  driver.get("https://automationplayground.com/crm/");
	  driver.findElement(By.linkText("Sign In")).click();
  }
  
  @Test(priority=2)
  public void login()
  {
	  System.out.println("Test case for Login!");
	  
	  driver.findElement(By.id("email-id")).sendKeys("test@gmail.com");
	  driver.findElement(By.id("password")).sendKeys("test123");
	  driver.findElement(By.id("submit-id")).click();
	  
  }
}
