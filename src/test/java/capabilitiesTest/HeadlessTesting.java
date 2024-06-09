package capabilitiesTest;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessTesting {

	public static void main(String[] args) 
	{
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--headless");

		WebDriver driver=new ChromeDriver(options);
		System.out.println("Browser launch!");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.google.com");
		System.out.println("Application Opens!");
		
		
		driver.findElement(By.id("APjFqb")).sendKeys("testng");
		System.out.println("Keyword search!");
		
		List<WebElement> list=driver.findElements(By.xpath("(//ul[@class='G43f7e'])[1]//li"));

		System.out.println("Total Options are: "+list.size());
		
		
		for(WebElement i:list)
		{
			System.out.println(i.getText());
		}
		
		
	}

}
