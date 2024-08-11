package MobileElementInteraction;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import generic.DriverSession;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;

public class ClickGesture
{
  @Test
  public void testClick()
  {
	  //create a driver session
	  
	  AppiumDriver driver=DriverSession.createAndroidSession();
	  
	  //view
	  WebElement ele=driver.findElement(AppiumBy.accessibilityId("Views"));
	  
	  //click gesture
	  driver.executeScript("mobile:clickGesture",ImmutableMap.of(
			  
			  "elementId",((RemoteWebElement)ele).getId()
			  
			  ));
	  
	  
	  System.out.println("Click gesture is completed!");
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
