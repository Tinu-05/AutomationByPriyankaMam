package locatorsInSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorDemo7_XpathTypes {

	public static void main(String[] args)
	{
		//create driver session
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		
		//email
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("testmay2024@gmail.com");
		
		//pass
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("test123");
		
		
		//login
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		
		//validation
		String exp="account";
		if(driver.getCurrentUrl().contains(exp))
		{
			System.out.println("Login Completed!.....Test Pass");
		}else
		{
			System.out.println("Login Fail.....Test Fail!");
		}
				


	}

}
