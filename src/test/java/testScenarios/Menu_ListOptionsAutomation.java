package testScenarios;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Menu_ListOptionsAutomation {

	public static void main(String[] args) {

		//create a driver session
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		
		//list--->parent ---->childs
		
		List<WebElement> list1=driver.findElements(By.xpath("//div[@class='list-group']//a"));
		System.out.println("Total options are: "+list1.size());
		
		
		for(WebElement i:list1)
		{
			System.out.println(i.getText());
		}
		
		
	}

}
