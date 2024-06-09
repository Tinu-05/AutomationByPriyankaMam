package automationScenarios;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedFrameDemo {

	public static void main(String[] args)
	{
			WebDriver driver=new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("https://demoqa.com/nestedframes");
			
			//parent frame--->get the text
			driver.switchTo().frame("frame1");
			System.out.println("I am inside Parent frame");
			//System.out.println("Parent Frame Text is:"+driver.findElement(By.xpath("//body[text()='Parent frame']")).getText());
			
			//child frame---->get the text
			driver.switchTo().frame(0);
			System.out.println("I am inside child frame");
			System.out.println("Child Frame text is: "+driver.findElement(By.tagName("p")).getText());

			//go to the parent -->get the text
			driver.switchTo().defaultContent();
			System.out.println("I am inside Parent frame");
			
			//inside parent switch
			driver.switchTo().frame("frame1");
			System.out.println("Parent Frame Text is:"+driver.findElement(By.xpath("//body[text()='Parent frame']")).getText());
			
			
			
			
	}

}
