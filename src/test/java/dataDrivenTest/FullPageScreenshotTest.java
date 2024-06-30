package dataDrivenTest;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class FullPageScreenshotTest
{
	public static WebDriver driver;
	
	public static void getFullPageScreenshot(WebDriver driver)
	{
		Screenshot screen=new AShot()
		  .shootingStrategy(ShootingStrategies.viewportPasting(100))
		  .takeScreenshot(driver);
		
		//file
		File dest=new File(System.getProperty("user.dir")+"//Screenshots//FullPage.png");
		
		try {
			ImageIO.write(screen.getImage(),"PNG",dest);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
	
  @Test
  public void CompletePageScreenshotTest() 
  {
	  
	  WebDriver driver =new ChromeDriver();
	  driver.get("https://www.amazon.in");
	  
	  getFullPageScreenshot(driver);
  }
}
