package mouseOperation;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickAction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		
		
		//ele
		WebElement btn=driver.findElement(By.xpath("//button[contains(text(),'Double')]"));
		
		//double click
		Actions act=new Actions(driver);
		act.doubleClick(btn).perform();
		
		//alert
		Alert alt=driver.switchTo().alert();
		System.out.println("Text of Alert is: "+alt.getText());
		alt.accept();
		
		
		
		
		
		
		
		
		
	}

}
