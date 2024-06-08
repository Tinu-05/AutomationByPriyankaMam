package generic;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Utility 
{
	
	//ExplicitWait
	public static WebElement waitForElementToClick(WebDriver driver,By loc)
	{
		WebDriverWait wait3=new WebDriverWait(driver,Duration.ofSeconds(10));
		return wait3.until(ExpectedConditions.elementToBeClickable(loc));
	}
	
	public static WebElement waitForElementToPresentToClick(WebDriver driver,By loc)
	{
		WebDriverWait wait3=new WebDriverWait(driver,Duration.ofSeconds(10));
		return wait3.until(ExpectedConditions.presenceOfElementLocated(loc));
	}
	public static WebElement waitForElementToVisible(WebDriver driver,By loc)
	{
		WebDriverWait wait3=new WebDriverWait(driver,Duration.ofSeconds(10));
		return wait3.until(ExpectedConditions.visibilityOfElementLocated(loc));
	}
	
	public static boolean waitForUrl(WebDriver driver,String url)
	{
		WebDriverWait wait3=new WebDriverWait(driver,Duration.ofSeconds(10));
		return wait3.until(ExpectedConditions.urlContains(url));
	}
	
	
	public static boolean waitForTitle(WebDriver driver,String url)
	{
		WebDriverWait wait3=new WebDriverWait(driver,Duration.ofSeconds(10));
		return wait3.until(ExpectedConditions.titleContains(url));
	}
	
	//drop down based on select
	public static void selectOption(WebElement ele,String value)
	{
		Select dd=new Select(ele);
		System.out.println("Is Dropdown Support multiple Selection?: "+dd.isMultiple());
		 
		List<WebElement> allOptions=dd.getOptions();
		
		System.out.println("Total Options are: "+allOptions.size());
		
		for(WebElement i:allOptions)
		{
			System.out.println(i.getText());
			if(i.getText().contains(value))
			{
				i.click();
				break;
			}
			
		}
	}


}
