package MobileElementInteraction;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import generic.DriverSession;
import generic.Utility;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;

public class ScrollGesture {
  @Test
  public void testScroll() throws InterruptedException
  {
	  
	  //create driver session
	  AppiumDriver driver=DriverSession.createAndroidSession();
	  
	  
	  //views
	  driver.findElement(AppiumBy.accessibilityId("Views")).click();
	  
	  
	  //ele
	  
	  WebElement ele=driver.findElement(AppiumBy.id("android:id/list"));
	  
	  
	  Utility.scrollDown(driver, ele);
	  
	  Thread.sleep(2000);
	  Utility.scrollUp(driver,ele);
	  
	  
//	  //scrollGesture
//	  driver.executeScript("mobile:scrollGesture",ImmutableMap.of(
//			  
//			  "elementId",((RemoteWebElement)ele).getId(),
//			  "direction","down",
//			  "percent",0.75
//			  
//			  ));
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
