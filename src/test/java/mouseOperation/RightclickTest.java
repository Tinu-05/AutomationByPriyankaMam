package mouseOperation;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightclickTest {

	public static void main(String[] args) 
	{

		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		
		//element
		WebElement ele=driver.findElement(By.xpath("//span[text()='right click me']"));

		//right click action
		Actions act=new Actions(driver);
		act.contextClick(ele).perform();
		
		//list
		List<WebElement> list=driver.findElements(By.xpath("(//ul)[3]//li//span"));
		System.out.println("Total options are: "+list.size());
		
		for(WebElement i:list)
		{
			System.out.println(i.getText());
			if(i.getText().contains("Copy"))
			{
				i.click();
				break;
			}
		}
		
		//alert will open
		Alert alt=driver.switchTo().alert();
		System.out.println("Text of alert: "+alt.getText());
		alt.accept();
		
		
		
		
		
		
		
		
		
	}

}
