package mobileScemarios;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import generic.DriverSession;
import generic.Utility;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class ToggleSetup {
  @Test
  public void testToggleWifi_Data_AirplaineMode() throws InterruptedException
  {
	  //create a driver session
	  AppiumDriver driver=DriverSession.createAndroidSession();
	  
	  /*
	   * toggleWifi()
	   * toggleData()
	   * toggleAirplaineMode()
	   * 
	   */
	  
	  System.out.println("Wifi is On");
	  ((AndroidDriver)driver).toggleWifi();
	  
	  System.out.println("Wifi is OFF");
	  ((AndroidDriver)driver).toggleWifi();
	  
	  System.out.println("Wifi is ON");
	  
	//mobile data
	  
	  WebElement area=driver.findElement(AppiumBy.id("com.android.systemui:id/tile_page"));
	  Utility.swipeLeft(driver,area);
	  
	  System.out.println("Mobiledata is ON");
	  ((AndroidDriver)driver).toggleData();
	  
	  System.out.println("Mobiledata is OFF");
	  Thread.sleep(2000);
	  ((AndroidDriver)driver).toggleData();
	  
	  System.out.println("Mobiledata is ON");
	  
	  
	  System.out.println("AirplaineMode is OFF");
	  	((AndroidDriver)driver).toggleAirplaneMode();
	  
	  System.out.println("AirplaineMode is ON");
	  ((AndroidDriver)driver).toggleAirplaneMode();
	  
	  System.out.println("AirplaineMode is OFF");
	  
  }
  
  
}
