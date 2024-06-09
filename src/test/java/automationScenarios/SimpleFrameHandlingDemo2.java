package automationScenarios;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleFrameHandlingDemo2 {

	public static void main(String[] args) 
	{

		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoqa.com/frames");
		
		//frame with id
		//driver.switchTo().frame("frame1");
		
		//frame with webelement
		
		WebElement fele=driver.findElement(By.id("frame1"));
		driver.switchTo().frame(fele);
		
		String text=driver.findElement(By.id("sampleHeading")).getText();
		System.out.println(text);

	}

}


