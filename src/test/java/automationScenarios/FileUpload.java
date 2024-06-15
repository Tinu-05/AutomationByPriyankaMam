package automationScenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {

	public static void main(String[] args)
	{

		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/upload");
		/*
		 * when element type=file then only this scenario works
		 */
		//select the file
		driver.findElement(By.id("file-upload")).sendKeys("C:\\Users\\Ganes\\OneDrive\\Desktop\\Roadmap_AutomationTesting.pdf");

		//upload
		driver.findElement(By.id("file-submit")).click();
	}

}
