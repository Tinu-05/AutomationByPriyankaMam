package MobileElementInteraction;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import generic.DriverSession;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;

public class LocatorStrategy {
  @Test
  public void testElements()
  {
	  AppiumDriver driver=DriverSession.createAndroidSession();
	  
	  //ele1
	  WebElement ele1=driver.findElement(AppiumBy.accessibilityId("Access'ibility"));
	  System.out.println("Element1 Text is: "+ele1.getText());
	  ele1.click();
  }
}
