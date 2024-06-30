package listenersTest;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.Assert;
import org.testng.annotations.Test;

import generic.BrowserUtility;

import org.testng.annotations.Test;

public class ListenerFinalTest
{
	//WebDriver driver=BrowserUtility.setDriver("chrome");
	
	public WebDriver driver;
  @Test(priority=1)
  public void registerTest() 
  {
	  System.out.println("This is Register test");
	 driver=BrowserUtility.setDriver("chrome");
	  BrowserUtility.getDriver().get("https://www.google.com");
	  
	
  }
  
  
  
  @Test(priority=2)
  public void loginTest() 
  {
	  System.out.println("This is Login test");
	  driver=BrowserUtility.setDriver("chrome");
	  BrowserUtility.getDriver().get("https://www.facebook.com");
	  Assert.assertEquals(driver.getTitle(),"Fakebook");
  }
  
  public void captureScreenshot()
	{
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File dest=new File(System.getProperty("user.dir")+"//Screenshots//test.png");
		try {
			FileHandler.copy(src, dest);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("ScreenShot captured!");
	}




  
}
