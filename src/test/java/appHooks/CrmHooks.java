package appHooks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import util.BrowserUtility;

public class CrmHooks
{

	public WebDriver driver;
	@Before
	public void setup()
	{
		System.out.println("Browser setup is completed and application launch");
		//driver=new ChromeDriver();
		//driver.get("https://automationplayground.com/crm/");
		driver=BrowserUtility.setDriver("chrome");
	}
	
	
	@After
	public void tearDown()
	{
		System.out.println("Broswer closed");
		//driver.quit();
		BrowserUtility.getDriver().quit();
		
		
	}
}
