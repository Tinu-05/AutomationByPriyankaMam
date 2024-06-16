package testngDataPassing;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import generic.PropertiesRead;

public class ReadHRMDataFromProperties {
  @Test
  public void hrmTest()
  {
	  PropertiesRead p1=new  PropertiesRead("Config");
	  
	  WebDriver driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get(p1.getData("url"));
	  
	  
	  driver.findElement(By.name("username")).sendKeys(p1.getData("un"));
	  driver.findElement(By.name("password")).sendKeys(p1.getData("psw"));
	  driver.findElement(By.xpath("//button[@type='submit']")).click();
	
	  //validate
	  
	  Assert.assertTrue(driver.getCurrentUrl().contains("dashboard"),"LoginFail!");
	  System.out.println("LoginPass");
	  
	  
  }
}
