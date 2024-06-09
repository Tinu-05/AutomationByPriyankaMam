package automationScenarios;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandling {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		//un
		driver.findElement(By.id("login1")).sendKeys("Priyanka");
		
		
		//btn
		driver.findElement(By.name("proceed")).click();
		/*
		 * UnhandledAlertException:
		 *  unexpected alert open: {Alert text : Please enter your password}
		 */
		Thread.sleep(2000);
		
		//alert
		Alert alt=driver.switchTo().alert();
		System.out.println("Text of alert is: "+alt.getText());
		
		//ok
		alt.accept();
		
		
		
		//pas
		driver.findElement(By.id("password")).sendKeys("test123");
		
	
		
		
		
		
		

	}

}
