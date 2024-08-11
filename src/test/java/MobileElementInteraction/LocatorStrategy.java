package MobileElementInteraction;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import generic.DriverSession;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;

public class LocatorStrategy {
  @Test
  public void testElements() throws InterruptedException
  {
	  AppiumDriver driver=DriverSession.createAndroidSession();
	  
	  //ele1- accessibilityId
	  WebElement ele1=driver.findElement(AppiumBy.accessibilityId("Access'ibility"));
	  System.out.println("Element1 Text is: "+ele1.getText());
	  ele1.click();
	  
	  //back to previous
	  driver.navigate().back();  
	  Thread.sleep(1500);
	  
	
	  //ele2- xpath
	  WebElement ele2=driver.findElement(AppiumBy.xpath("//android.widget.TextView[@content-desc=\"Accessibility\"]"));
	  System.out.println("Exelement2 text is: "+ele2.getText());
	  ele2.click();
	  
	  Thread.sleep(1500);
	  driver.navigate().back();
	  
	  //ele3- class name
	  
	  //WebElement ele3=driver.findElement(AppiumBy.className("android.widget.TextView"));
	  
	  WebElement ele3=driver.findElements(AppiumBy.className("android.widget.TextView")).get(3);
	  System.out.println("Eelement3 text is: "+ele3.getText());
	  ele3.click();
	  

	  Thread.sleep(1500);
	  driver.navigate().back();
	  
	  
	  //resource-d/id
	 WebElement ele4= driver.findElements(AppiumBy.id("android:id/text1")).get(3);
	 System.out.println("Element 4 text is: "+ele4.getText());
	 ele4.click();
	 
	 Thread.sleep(1500);
	  driver.navigate().back();
	  
	  
	  //text
	  WebElement ele5=driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"Content\")"));
	  System.out.println("Element 5 text is: "+ele5.getText());
	  ele5.click();
	  
	 
	 
	  
	  
	  
	  
	  
  }
}
