package seleniumGrid;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class CrossBrowserTest
{
	WebDriver driver;
	@Parameters({"bname"})
  @Test
  public void crossBorwserTesting(String bname) throws MalformedURLException, InterruptedException 
  {
	  if(bname.equals("chrome"))
	  {
		  ChromeOptions opt=new ChromeOptions();
		  driver=new RemoteWebDriver(new URL("http://localhost:4444/"),opt);
		  System.out.println("Remote Session connected to Chrome!");
	  }else if(bname.equals("firefox"))
	  {
		  FirefoxOptions opt=new FirefoxOptions();
		  driver=new RemoteWebDriver(new URL("http://localhost:4444/"),opt);
		  System.out.println("Remote Session connected to Firefox!");
		  
	  }else if(bname.equals("edge"))
	  {
		  EdgeOptions opt=new EdgeOptions();
		  driver=new RemoteWebDriver(new URL("http://localhost:4444/"),opt);
		  System.out.println("Remote Session connected to Edge!");
	  }
	  
	  Thread.sleep(15000);
	  driver.get("https://www.amazon.in");
	  Thread.sleep(5000);
	  
	  System.out.println("Title is: "+driver.getTitle());
	  
	  driver.quit();
	  
	  
  }
}
