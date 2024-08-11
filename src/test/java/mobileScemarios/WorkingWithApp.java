package mobileScemarios;

import java.time.Duration;

import org.testng.annotations.Test;

import generic.DriverSession;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class WorkingWithApp {
  @Test
  public void testApp() throws InterruptedException 
  {
	  //create  a driver session
	  AppiumDriver driver=DriverSession.createAndroidSession();
	  
	  System.out.println("Application status is: "+((AndroidDriver)driver).queryAppState("io.appium.android.apis"));
	  
	  //terminate app
	  ((AndroidDriver)driver).terminateApp("io.appium.android.apis");
	  System.out.println("After terminate status is: "+((AndroidDriver)driver).queryAppState("io.appium.android.apis"));

	  Thread.sleep(1500);
	  
	  //activate all
	  ((AndroidDriver)driver).activateApp("io.appium.android.apis");
	  System.out.println("After activate status is: "+((AndroidDriver)driver).queryAppState("io.appium.android.apis"));

	  //uninstall app
	  Thread.sleep(1500);
	  ((AndroidDriver)driver).removeApp("io.appium.android.apis");
	  System.out.println("After Uninstallation status is: "+((AndroidDriver)driver).queryAppState("io.appium.android.apis"));

	  //install
	  Thread.sleep(1500);
	  String path=System.getProperty("user.dir")+"//src//test//resources//ApiDemos-debug.apk";
	  ((AndroidDriver)driver).installApp(path);
	  System.out.println("After Install status is: "+((AndroidDriver)driver).queryAppState("io.appium.android.apis"));

	//activate app
	  ((AndroidDriver)driver).activateApp("io.appium.android.apis");
	  System.out.println("After activate status is: "+((AndroidDriver)driver).queryAppState("io.appium.android.apis"));

	  ((AndroidDriver)driver).runAppInBackground(Duration.ofMillis(5000));
	  System.out.println("After Background status is: "+((AndroidDriver)driver).queryAppState("io.appium.android.apis"));

	  
  }
}
