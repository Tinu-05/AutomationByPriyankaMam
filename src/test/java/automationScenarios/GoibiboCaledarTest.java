package automationScenarios;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoibiboCaledarTest {

	/*
	 * ElementClickInterceptedException
	 * maximize the browser
	 * 
	 */
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.goibibo.com/");
		
		driver.manage().window().maximize();
		
		//close the popup
		driver.findElement(By.xpath("//span[contains(@class,'icClose')]")).click();
		
		//open
		driver.findElement(By.xpath("(//span[contains(@class,'fswDownArrow')])[1]")).click();
		
		//Exception
		String date="24";
		String month="November";
		String year="2024";
		
		//month selection
		
		while(true)
		{
		//current month
		String cdate=driver.findElement(By.xpath("(//div[@class='DayPicker-Caption'])[1]")).getText();
		//System.out.println(cdate);
		String cmonth=cdate.split(" ")[0];
		String cyear=cdate.split(" ")[1];
		if(cmonth.contains(month) && cyear.contains(cyear))
		{
			break;
			
		}else
		{
			//click on >
			driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
			
		}
		
		} 
		
		//date selection
		
		List<WebElement> alldates=driver.findElements(By.xpath("(//div[@class='DayPicker-Body'])[1]//div[contains(@class,'DayPicker-Day')]"));
		
		for(WebElement i:alldates)
		{
			if(i.getText().contains(date))
			{
				i.click();
				break;
			}
		}
		
		
		
		
		
		
		
		
		
		

		

	}

}
