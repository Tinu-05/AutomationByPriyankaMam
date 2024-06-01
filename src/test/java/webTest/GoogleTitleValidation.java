package webTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleTitleValidation {

	public static void main(String[] args) 
	{
		//Launch the browser
		WebDriver driver=new ChromeDriver();
		
		//open google application
		driver.get("https://www.google.com");
		
		//To get the title of current page
		String actTitle=driver.getTitle();
	
		//validate the title with expected result
		if(actTitle.equals("Google"))
		{
			System.out.println("Application title is: "+actTitle);
			System.out.println("Title matched!Test Pass!");
			
		}else
		{
			System.out.println("Title not matched!Test Fail!");
		}
		
		//close the browser
		/*
		 * close(): close current open/active window
		 * quit(): close all open windows by selenium
		 */
		
		//driver.close();
		driver.quit();
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
