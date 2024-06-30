package report;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportDemo {
  @Test
  public void testReport()
  {
	  //create a instance
	  
	  ExtentReports extent=new ExtentReports();
	  
	  //path of report
	  ExtentSparkReporter spark=new ExtentSparkReporter(System.getProperty("user.dir")+"//Reports//Automation.html");
	  
	  //configuration
	  spark.config().setDocumentTitle("Automation Testing Report");
	  spark.config().setReportName("Sprint 1 Report");
	  spark.config().setTheme(Theme.DARK);
	  
	  //attachment
	  extent.attachReporter(spark);
	  
	  //create test
	  ExtentTest test=extent.createTest("AutomationTestScript");
	  
	  //logs
	  test.log(Status.PASS,"Test 1 is pass");
	  test.log(Status.FAIL,"Test 2 is Fail");
	  test.log(Status.SKIP,"Test 3 is Skip");
	  test.log(Status.INFO,"Test 4 is Information");
	  
	  //flush
	  extent.flush();
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
