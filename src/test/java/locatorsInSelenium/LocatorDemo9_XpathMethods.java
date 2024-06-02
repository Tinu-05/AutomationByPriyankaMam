package locatorsInSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorDemo9_XpathMethods {

	public static void main(String[] args) throws InterruptedException 
	{

		//create driver session
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.in");
		
		//bestseller
		driver.findElement(By.xpath("//a[text()='Best Sellers']")).click();
		
		//cart
		driver.findElement(By.xpath("//span[normalize-space()='Cart']")).click();
		
		
		//text
		String text=driver.findElement(By.xpath("//h2[normalize-space()='Your Amazon Cart is empty']")).getText();

		System.out.println("Cart status is: "+text);
		
		//contains()-search box
		driver.findElement(By.xpath("//input[contains(@id,'two')]")).sendKeys("Watch",Keys.ENTER);
		
		Thread.sleep(2000);
		
		//startswith()--clear text and search bags
		WebElement search=driver.findElement(By.xpath("//input[starts-with(@id,'two')]"));
		
		search.clear();
		search.sendKeys("bags",Keys.ENTER);
		
	}

}
