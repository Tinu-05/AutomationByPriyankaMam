package mobileScemarios;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import generic.DriverSession;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class TestNotifications {
  @Test
  public void testNotifications() 
  {
	  //create driver session
	  AppiumDriver driver=DriverSession.createAndroidSession();
	  
	  
	  //open notifictaion
	  ((AndroidDriver)driver).openNotifications();
	  
	  System.out.println("Notifications Headings");
	 List<WebElement> ele=driver.findElements(AppiumBy.id("android:id/title"));
	  for(WebElement i:ele)
	  {
		  System.out.println(i.getText());
	  }
	  
	  System.out.println("*******************");
	  String text1=driver.findElement(AppiumBy.id("android:id/big_text")).getText();
	  System.out.println(text1);
	  
	  
	  
	  
	  
	  
	  
  }
}
