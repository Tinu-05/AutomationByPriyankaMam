package seleniumGrid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class GridSetUp
{
  @Test
  public void testOnChrome() throws MalformedURLException, InterruptedException
    {
	  System.out.println("Remote Connectivity Started....");
	  ChromeOptions options=new ChromeOptions();
	  
	  URL url=new URL("http://localhost:4444/");
	  
	  WebDriver driver=new RemoteWebDriver(url,options);
	  
	  System.out.println("Remote Connectivity is completed!");
	  	  Thread.sleep(10000);
	  driver.get("https://www.google.com");
	  
	  System.out.println("Application is open!");
	  
	  Thread.sleep(5000);
	  
	  System.out.println("Application title is: "+driver.getTitle());
	  
	  driver.quit();
	  
  }
}
