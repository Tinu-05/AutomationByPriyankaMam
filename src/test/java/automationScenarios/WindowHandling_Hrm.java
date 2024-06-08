package automationScenarios;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling_Hrm {

	public static void main(String[] args)
	{

		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//home page
		String parentId=driver.getWindowHandle();
		System.out.println(parentId);
		
		//link
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		//new window
		
		Set<String> allWindow=driver.getWindowHandles();
		System.out.println(allWindow);
		
		//switch to child
		for(String childId:allWindow)
		{
			if(!parentId.equals(childId))//if parent id is not matching with child then switch
			{
				driver.switchTo().window(childId);
				//email
				driver.findElement(By.name("EmailHomePage")).sendKeys("test@gmail.com");
				
				//driver.quit();
				
			}
		}
		
		//switch to parent
		driver.switchTo().window(parentId);
		
		driver.findElement(By.name("username")).sendKeys("Priyanka");
		
		
		
		
		
		
		
		
		
	}

}
