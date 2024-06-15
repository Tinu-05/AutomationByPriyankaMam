package automationScenarios;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import generic.Utility;
import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class JavascriptExecutorDemo {

	
	public static void main(String[] args) throws InterruptedException 
	{

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		
		Utility.scrollDown(driver);
		System.out.println("Scroll Down!");
		Thread.sleep(2000);
		
		Utility.scrollUp(driver);
		
		Thread.sleep(2000);
		System.out.println("Scroll Up!");
		
		WebElement ele=driver.findElement(By.xpath("//div[contains(@class,'a-section')]//span[text()='Electric scooters & motorbikes']"));
		Utility.scrollToElement(driver,ele);
		System.out.println("Scroll upto Element!");
		
		//refresh the page
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("history.go(0)");
		
		Thread.sleep(2000);
		
		//to generate alert
		js.executeScript("alert('Hello I am Js alert')");
		Alert alt=driver.switchTo().alert();
		System.out.println("Alert text is: "+alt.getText());
		alt.accept();
		
		/*
		 * To get title in selenium two ways 
		 * 1.getTitle()
		 * 2.Using javascriotExecutor
		 * 
		 */
		
		String title=js.executeScript("return document.title").toString();
		System.out.println("title is: "+title);
		
		/*
		//scroll the page
		JavascriptExecutor js=(JavascriptExecutor) driver;
		
		//scroll to end of the page
		//js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		
		//Thread.sleep(2000);
		//scroll upto page starting point
		//js.executeScript("window.scrollTo(document.body.scrollHeight,0)");
		
		//scroll to any specific element
		WebElement ele=driver.findElement(By.xpath("//div[contains(@class,'a-section')]//span[text()='Electric scooters & motorbikes']"));
		js.executeScript("arguments[0].scrollIntoView(true);",ele);
		
		//scrolling to specific position
		//js.executeScript("window.scrollTo(0,2000)");
		
*/
	}

}
