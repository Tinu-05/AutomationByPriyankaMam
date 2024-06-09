package automationScenarios;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandlingDemo2 {

	
	
	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		WebElement resText=driver.findElement(By.id("result"));
		
		//alert1
		driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
		
		//alert window open
		Alert alt1=driver.switchTo().alert();
		
		System.out.println("Alert text: "+alt1.getText());
		//ok
		alt1.accept();
		System.out.println("Result is: "+resText.getText());
		
		
		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
		
		Alert alt2=driver.switchTo().alert();
		alt2.sendKeys("Hello All");
		alt2.accept();
		System.out.println("Result is: "+resText.getText());
		
		

	}

}
