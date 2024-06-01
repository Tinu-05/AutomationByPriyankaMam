package locatorsInSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoctorDemo6_CssSelector_characters {

	public static void main(String[] args) {
		
		//create a driver session
				WebDriver driver=new ChromeDriver();
				
				driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
				
				//email- * contains
				driver.findElement(By.cssSelector("input#input-email")).sendKeys("testmay2024@gmail.com");
				
				//pss- tagname with attribute
				driver.findElement(By.cssSelector("input[type='password']")).sendKeys("test123");
				
				
				//button- tagname with classname
				//driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
				
	}

}
