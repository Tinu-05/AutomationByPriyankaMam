package locatorsInSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorDemo2_Id_Name {

	public static void main(String[] args)
	{
		// create a driver session
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.saucedemo.com/");
		
		//un- id
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		
		//pass- validation with Action- name
		WebElement ele=driver.findElement(By.name("password"));
		
		if(ele.isDisplayed()&& ele.isEnabled())
		{
			ele.sendKeys("secret_sauce");
		}
		
		//login className
		//InvalidSelectorException: Compound class names not permitted
		//driver.findElement(By.className("submit-button btn_action")).click();
		
		driver.findElement(By.className("submit-button")).click();
		

	}

}
