package webTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserCommands {

	public static void main(String[] args) {

		//create a driver session
		WebDriver driver=new ChromeDriver();
		
		//open application
		driver.get("https://automationplayground.com/crm/");
		
		//To get the title -getTitle()
		System.out.println("Application title is: "+driver.getTitle());
		
		//To get current page url -getCurrentUrl()
		System.out.println("Current page Url is: "+driver.getCurrentUrl());
		
		//to get the Source code of page-getPageSource()
		System.out.println(driver.getPageSource());
		
		//close the browser -close() quit()
		
		driver.quit();
		
		
		
		
		
		
		
		
		
	}

}
