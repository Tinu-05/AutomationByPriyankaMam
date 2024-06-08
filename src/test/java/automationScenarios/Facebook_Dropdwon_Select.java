package automationScenarios;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import generic.Utility;
import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class Facebook_Dropdwon_Select
{
	
//	public static void selectOption(WebElement ele,String value)
//	{
//		Select dd=new Select(ele);
//		System.out.println("Is Dropdown Support multiple Selection?: "+dd.isMultiple());
//		 
//		List<WebElement> allOptions=dd.getOptions();
//		
//		System.out.println("Total Options are: "+allOptions.size());
//		
//		for(WebElement i:allOptions)
//		{
//			System.out.println(i.getText());
//			if(i.getText().contains(value))
//			{
//				i.click();
//				break;
//			}
//			
//		}
//	}

	public static void main(String[] args)
	{

		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.facebook.com/");
		
		//link
		driver.findElement(By.linkText("Create new account")).click();
		
		//day
		WebElement ele1=driver.findElement(By.id("day"));
		Utility.selectOption(ele1,"31");
				
		//month
		WebElement ele2=driver.findElement(By.id("month"));
		Utility.selectOption(ele2,"May");
		
		WebElement ele3=driver.findElement(By.id("year"));
		Utility.selectOption(ele3,"2020");
		
		
		
		
		
		
		
//		Select daydd=new Select(ele1);
//		System.out.println("Is Dropdown Support multiple Selection?: "+daydd.isMultiple());
//		 
//		List<WebElement> allOptions=daydd.getOptions();
//		
//		System.out.println("Total Options are: "+allOptions.size());
//		
//		for(WebElement i:allOptions)
//		{
//			System.out.println(i.getText());
//			if(i.getText().contains("31"))
//			{
//				i.click();
//				break;
//			}
//			
//		}
	
		
		
		//year
		
		
		
		
		
		
		
		

	}

}
