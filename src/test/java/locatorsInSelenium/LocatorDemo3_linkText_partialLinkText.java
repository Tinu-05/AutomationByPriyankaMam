package locatorsInSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorDemo3_linkText_partialLinkText {

	public static void main(String[] args) 
	{
		//create a driver session
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://automationplayground.com/crm/");
		
		//NoSuchElementException:
		//driver.findElement(By.name("priyanka")).click();
		
		//link-using linkText
		//driver.findElement(By.linkText("Sign In")).click();-- pass
		
		//NoSuchElementException
		//driver.findElement(By.linkText("Sign")).click();// -- fail
		
		//partailLinkText
		driver.findElement(By.partialLinkText("In")).click();
		
		

	}

}
