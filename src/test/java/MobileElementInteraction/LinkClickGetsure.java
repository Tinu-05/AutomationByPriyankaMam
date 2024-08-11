package MobileElementInteraction;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import generic.DriverSession;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;

public class LinkClickGetsure {
  @Test
  public void testLongClick()
  {
	  //create a driver session
	  AppiumDriver driver=DriverSession.createAndroidSession();
	  
	  
	  //views
	  driver.findElement(AppiumBy.accessibilityId("Views")).click();
	  
	  //drag
	  driver.findElement(AppiumBy.accessibilityId("Drag and Drop")).click();
	  
	  //ele
	  WebElement ele=driver.findElement(AppiumBy.id("io.appium.android.apis:id/drag_dot_1"));
	  
	  //longClick()
	  
	  driver.executeScript("mobile: longClickGesture",ImmutableMap.of(
			  "elementId",((RemoteWebElement)ele).getId(),
			  "duration",4000
			  ));
	  
	  System.out.println("Long click gesture is completed!");
	  
	  
	  
	  
	  
	  
	  
  }
}
