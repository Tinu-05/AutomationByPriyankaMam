package automationScenarios;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonFooterTest {

	public static void main(String[] args)
	{

		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.amazon.in/");
		
		List<WebElement> heading=driver.findElements(By.xpath("//div[contains(@class,'navAccessibility')]//div[contains(@class,'navFooterLinkCol')]"));
		
		System.out.println("Total Options are: "+heading.size());
		int count=driver.findElements(By.xpath("//div[contains(@class,'navAccessibility')]//div[contains(@class,'navFooterLinkCol')]//ul//li")).size();
		
		System.out.println("Total Footer links are: "+count);
		for(WebElement i:heading)
		{
			System.out.println(i.getText());
		}
		
		
		driver.quit();
		
		
		
		

	}

}
