package locatorsInSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorDemo5_CssSelectors {

	public static void main(String[] args)
	{
		//create a driver session
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		
		//email- contains *
		driver.findElement(By.cssSelector("input[placeholder *='Address']")).sendKeys("testmay2024@gmail.com");
		
		//pss- starts with ^
		driver.findElement(By.cssSelector("input[placeholder^='Pas']")).sendKeys("test123");
		
		
		//button- tagname with classname
		//driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		
		//button -  $ ends with
		driver.findElement(By.cssSelector("input[value$='Login']")).click();
		
		
		//java
		String exp="account";
		if(driver.getCurrentUrl().contains(exp))
		{
			System.out.println("Login completed!....Test pass!");
		}else
		{
			System.out.println("Login Fail!....Test Fail!");

		}
		

	}

}
