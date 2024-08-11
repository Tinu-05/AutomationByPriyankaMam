package MobileElementInteraction;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import generic.DriverSession;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;

public class DragGesture {
  @Test
  public void testDrag() 
  {
	  //create a driver session: 
	  AppiumDriver driver=DriverSession.createAndroidSession();
	  
	  //view
	  driver.findElement(AppiumBy.accessibilityId("Views")).click();
	  
	  
	  //darg
	  driver.findElement(AppiumBy.accessibilityId("Drag and Drop")).click();
	  
	  //ele
	  WebElement ele=driver.findElement(AppiumBy.id("io.appium.android.apis:id/drag_dot_3"));
	  
	  driver.executeScript("mobile:dragGesture",ImmutableMap.of(
			  
			  "elementId",((RemoteWebElement)ele).getId(),
			  "endX",745,
			  "endY",1132
			  
			  ) );
	  
	  
String text=  driver.findElement(AppiumBy.id("io.appium.android.apis:id/drag_result_text")).getText();
	  
	  System.out.println("Message is: "+text);
	  
	  
	  
	  
	  
	  
	  
  }
}
