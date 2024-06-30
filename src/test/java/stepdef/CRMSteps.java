package stepdef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import appHooks.CrmHooks;
import io.cucumber.java.en.*;
import util.BrowserUtility;


public class CRMSteps 
{

	
	WebDriver driver;
	
	@Given("Open CRM application")
	public void open_crm_application() {
//	    driver=new ChromeDriver();
//	    driver.get("https://automationplayground.com/crm/");
		driver=BrowserUtility.getDriver();
		BrowserUtility.getDriver().get("https://automationplayground.com/crm/");
	}

	@When("User click on SignIn link")
	public void user_click_on_sign_in_link() {
	    driver.findElement(By.linkText("Sign In")).click();
	}

	@Then("User should navigate to SignIn page")
	public void user_should_navigate_to_sign_in_page() {

     Assert.assertTrue(driver.getCurrentUrl().contains("login"),"Test Fail as Login page not open");
     System.out.println("Test Pass...As Login page open!");
	}

	@Given("User should be navigated to SignIn page")
	public void user_should_be_navigated_to_sign_in_page() {
		 driver.findElement(By.linkText("Sign In")).click();
	}

	@When("User enter emailid and password")
	public void user_enter_emailid_and_password() {
	 driver.findElement(By.id("email-id")).sendKeys("test@gmail.com");
	 driver.findElement(By.id("password")).sendKeys("test123");
	 
	}

	@When("click on Submit button")
	public void click_on_submit_button() {
	   driver.findElement(By.id("submit-id")).click();
	}

	@Then("User should navigate to Customer page")
	public void user_should_navigate_to_customer_page() {

		Assert.assertTrue(driver.getCurrentUrl().contains("customers"),"Test Fail");
		System.out.println("Test Pass!");
	}



}
