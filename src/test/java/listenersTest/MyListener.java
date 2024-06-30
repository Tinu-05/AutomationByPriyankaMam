package listenersTest;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.testng.ITestListener;
import org.testng.ITestResult;

import generic.Utility;

public class MyListener extends ListenerFinalTest implements ITestListener 
{

	
	public void onTestSuccess(ITestResult result)
	{
		System.out.println("Test Pass:"+ result.getMethod().getMethodName());
	}
	
	public void onTestFailure(ITestResult result)
	{
		System.out.println("Test Fail:"+ result.getMethod().getMethodName());
		Utility.getScreenshot(driver,"test");
	}
	public String timestamp()
	{
		return new SimpleDateFormat("yyyyMMdd").format(new Date());
	}
}

