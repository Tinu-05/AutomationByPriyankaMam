package automationScenarios;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import generic.Utility;

public class AlertHandlingDemo3 {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
			
		List<WebElement> list=driver.findElements(By.xpath("//ul//li//button"));		
		
		WebElement resText=driver.findElement(By.id("result"));
		for(WebElement i:list)
		{
			if(i.getText().contains("Click for JS Alert"))
			{
				i.click();
				Utility.alertWithOK(driver);
			
				System.out.println("Result Text: "+resText.getText());
				
			}else if(i.getText().contains("Click for JS Confirm"))
			{
				i.click();
				Utility.alertWithCancel(driver);
				System.out.println("Result Text: "+resText.getText());
				
			}else if(i.getText().contains("Click for JS Prompt"))
			{
				i.click();
				Utility.alertWithPrompt(driver,"Hello All");
				System.out.println("Result Text: "+resText.getText());
			}
			
		}
		
		
		
		
	}

}
