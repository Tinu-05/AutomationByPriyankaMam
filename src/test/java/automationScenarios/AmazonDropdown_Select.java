package automationScenarios;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import generic.Utility;

public class AmazonDropdown_Select {

	public static void main(String[] args) throws InterruptedException
	{

		//create driver session
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.amazon.in");
		
		//identify dropdown element
		WebElement dd= driver.findElement(By.id("searchDropdownBox"));
		
		//Select class
		Select s1=new Select(dd);
		
		
		System.out.println("Is dropdown support multiple selection?: "+s1.isMultiple());
		
		
		//single selection
		s1.selectByIndex(5);
		Thread.sleep(1000);
		s1.selectByValue("search-alias=pets");
		Thread.sleep(1000);
		s1.selectByVisibleText("Video Games");
		
		
		Utility.selectOption(dd,"Books");
		
		//all options
//		List<WebElement> allOptions=s1.getOptions();
//		System.out.println("Total Options are: "+allOptions.size());
//		
//		
//		for(WebElement i:allOptions)
//		{
//			System.out.println(i.getText());
//			if(i.getText().contains("Prime Video"))
//			{
//				
//				i.click();
//				System.out.println("Option Found...Test Pass!");
//				break;
//			}
//			
//		}
		
		Thread.sleep(2000);
		
		driver.quit();
		
		
		
		
		
		
		
		
		
		

	}

}
