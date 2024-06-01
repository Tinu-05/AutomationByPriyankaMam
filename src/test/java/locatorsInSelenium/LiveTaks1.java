package locatorsInSelenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class LiveTaks1 {

	public static void main(String[] args)
	{
		// Create a driver session
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.naukri.com/");
		
		List<WebElement> allLinks=driver.findElements(By.tagName("a"));
		
		System.out.println("Total Links are: "+allLinks.size());
		
		String exp="https://www.naukri.com/hr-jobs?src=gnbjobs_homepage_srch";
		//iterate
		for(WebElement i:allLinks)
		{
			System.out.println(i.getAttribute("href"));
			System.out.println(i.getText());
			try {
			if(i.getAttribute("href").contains(exp))
				{
				System.out.println("Link found!...Test Pass!");
				break;
				}
			}catch(NullPointerException n)
			{
			System.out.println("Referance of link is Null!");	
			}
		}
		
		
		
	}

}
