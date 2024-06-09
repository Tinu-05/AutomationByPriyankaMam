package waitScenario;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import generic.Utility;

public class InternetWaitScenario {

	public static void main(String[] args) 
	{

		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/dynamic_loading/2");
		//btn
		By startbtn=By.xpath("//button[text()='Start']");
		
		By text=By.xpath("(//h4)[2]");
		
		
		driver.findElement(startbtn).click();
		String te=Utility.waitForElementToPresentToClick(driver,text).getText();
		//String te=driver.findElement(text).getText();
		System.out.println("Text is: "+te);
		
		
		
		
		
		
		
		
	}

}
