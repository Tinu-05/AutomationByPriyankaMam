package automationScenarios;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class RedBusCalendarTest {

	public static void main(String[] args)
	{

		// Create a driver session
				ChromeOptions options=new ChromeOptions();
				options.addArguments("--disable-notifications");
				
				WebDriver driver=new ChromeDriver(options);
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				
				driver.get("https://www.redbus.in/");
				
				
				//open calendar
				driver.findElement(By.xpath("//span[text()='Date']")).click();
				
				//Exception
				String date="24";
				String month="Sep";
				String year="2024";
				
				//month selection
				
				while(true)
				{
				//current month
				String cdate=driver.findElement(By.xpath("(//div[contains(@class,'DayNavigator')])[3]")).getText();
				//System.out.println(cdate);
				String cmonth=cdate.split(" ")[0];
				String cyear=cdate.split(" ")[1];
				if(cmonth.contains(month) && cyear.contains(cyear))
				{
					break;
					
				}else
				{
					//click on >
					driver.findElement(By.xpath("(//div[contains(@class,'DayNavigator')])[4]")).click();
					
				}
				
				} 
				//date selection
				
				List<WebElement> alldates=driver.findElements(By.xpath("//div[contains(@class,'DayTilesWrapper')]//div[contains(@class,'DayTiles__CalendarDays')]"));
				
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
