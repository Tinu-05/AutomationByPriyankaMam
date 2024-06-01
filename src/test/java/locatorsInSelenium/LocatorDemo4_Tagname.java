package locatorsInSelenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorDemo4_Tagname {

	public static void main(String[] args)
	{
		//Create driver session
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			
//		List<WebElement> list=driver.findElements(By.tagName("selenium"));
//		System.out.println("Total input boxes are: "+list.size());//0
//		System.out.println(list);//[]
		
		List<WebElement> textBoxes=driver.findElements(By.tagName("input"));
		System.out.println("Total input boxes are: "+textBoxes.size());//3
		
		//Number of links
		List<WebElement> allLinks=driver.findElements(By.tagName("a"));		
		
		System.out.println("Total Links are: "+allLinks.size());
		
		for(WebElement i:allLinks)
		{
			System.out.println(i.getAttribute("href"));
			System.out.println(i.getText());
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
