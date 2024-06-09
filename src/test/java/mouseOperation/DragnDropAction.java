package mouseOperation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragnDropAction {

	public static void main(String[] args) throws InterruptedException
	{

		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://jqueryui.com/droppable/#default");
		driver.manage().window().maximize();
		
		
		Thread.sleep(2000);
		driver.switchTo().frame(0);
		
		//src
		WebElement src=driver.findElement(By.id("draggable"));
		//dest
		WebElement target=driver.findElement(By.id("droppable"));
		
		//actions
		Actions act=new Actions(driver);
		try {
		act.dragAndDrop(src,target).perform();
		
		}catch(StaleElementReferenceException e)
		{
			e.printStackTrace();
		}
		
		
		
		
	}

}
