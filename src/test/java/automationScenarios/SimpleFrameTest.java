package automationScenarios;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleFrameTest {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_iframe");
		
		//frame count
		System.out.println("Total Frames: "+driver.findElements(By.tagName("iframe")).size());
		
		//top frame
		driver.switchTo().frame("iframeResult");
		//switch to frame
		//indexing
		//driver.switchTo().frame(0);
		
		//inner frame
		WebElement fele=driver.findElement(By.xpath("//iframe[@title='W3Schools Free Online Web Tutorials']"));
		
		driver.switchTo().frame(fele);
		
		WebElement menu=driver.findElement(By.xpath("//a[@aria-label='Menu']"));
		System.out.println(menu.getText());
		menu.click();

	}

}
