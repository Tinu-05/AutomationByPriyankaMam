package locatorsInSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorDemo1 {

	public static void main(String[] args) 
	{

		//create a driver session
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com");
		
			
		//identify + action
		driver.findElement(By.id("APjFqb")).sendKeys("testng");
		
		
		
		
		
		/*
		//way2: Indentify+ validate WebElement +Action
		WebElement ele1=driver.findElement(By.id("APjFqb"));
		//validation
		System.out.println("Is Element displayed?: "+ele1.isDisplayed());
		System.out.println("Is Element enabled?: "+ele1.isEnabled());
		
		//action
		ele1.sendKeys("selenium");
		*/
		
		/*
		//way1: By locator+ identify + perform action(framework)
		
		//to get the address
		By searchAdd=By.id("APjFqb");
		
		driver.findElement(searchAdd).sendKeys("testing");
*/
	}

}
