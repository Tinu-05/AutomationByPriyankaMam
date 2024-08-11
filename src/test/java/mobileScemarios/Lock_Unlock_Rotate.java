package mobileScemarios;

import org.openqa.selenium.ScreenOrientation;
import org.testng.annotations.Test;

import generic.DriverSession;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class Lock_Unlock_Rotate {
  @Test
  public void testLock_Unlock_Rotate() throws InterruptedException
  {
	  //create a driver session
	  AppiumDriver driver=DriverSession.createAndroidSession();
	  
	  ((AndroidDriver)driver).lockDevice();
	  System.out.println("Device Locked!");
	  
	  Thread.sleep(2000);
	  
	  ((AndroidDriver)driver).unlockDevice();
	  System.out.println("Device UnLocked!");
	  
	  Thread.sleep(2000);
	  ((AndroidDriver)driver).rotate(ScreenOrientation.LANDSCAPE);
	  
	  
  }
}
