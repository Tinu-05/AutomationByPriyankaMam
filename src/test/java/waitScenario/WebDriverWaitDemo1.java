package waitScenario;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverWaitDemo1 {

	public static void main(String[] args) 
	{

		WebDriver driver=new ChromeDriver();
		
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		
		//By locator
		By email=By.name("email");
		By pass=By.name("password");
		By btn=By.xpath("//input[@value='Login']");
		
		//driver.findElement(email).sendKeys("test@gmail.com");
		/*
		 * TimeoutException: Expected condition failed: 
		 * waiting for visibility of element located by 
		 * By.name: email### 
		 * (tried for 5 second(s) with 500 milliseconds interval)
		 * interval time =Polling time
		 * Polling time means server check that element on browser(App)
		 * 
		 */
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOfElementLocated(email)).sendKeys("test@gmail.com");
		
		
		WebDriverWait wait2=new WebDriverWait(driver,Duration.ofSeconds(5));
		WebElement psa=wait2.until(ExpectedConditions.presenceOfElementLocated(pass));
		
		psa.sendKeys("test123");
		
		WebDriverWait wait3=new WebDriverWait(driver,Duration.ofSeconds(5));
		WebElement lbtn=wait3.until(ExpectedConditions.elementToBeClickable(btn));
		
		lbtn.click();
		
		
				

	}

}
