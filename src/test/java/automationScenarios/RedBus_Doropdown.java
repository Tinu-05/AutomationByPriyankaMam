package automationScenarios;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class RedBus_Doropdown {

	public static void main(String[] args)
	{
		// Create a driver session
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		
		WebDriver driver=new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.redbus.in/");
		
		//from drop down
		
		WebElement ele=driver.findElement(By.id("src"));
		ele.click();
		ele.sendKeys("pu");
		
		List<WebElement> list=driver.findElements(By.xpath("//ul[contains(@class,'eFEVtU')]//li//text[@class='placeHolderMainText']"));
		
		System.out.println("Total Options are: "+list.size());
		
		for(WebElement i:list)
		{
			System.out.println(i.getText());
			if(i.getText().contains("Viman Nagar"))
			{
				i.click();
				break;
			}
		}
		
		
		
		
		
		
		
		
		
		

	}

}
