package realTimeAnnotationUse;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

public class BaseTest 
{
	public WebDriver driver;
	
	@BeforeClass
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://automationplayground.com/crm/");
	}

	@AfterMethod
	  public void getAppTitle()
	  {
		  System.out.println("Title is: "+driver.getTitle());
	  }
	  @AfterClass
	  public void tearDown()
	  {
		//close
		  driver.quit();
	  }
}
