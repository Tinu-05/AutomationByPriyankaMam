package stepdef;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.*;

public class HrmSteps 

{
	WebDriver driver;

	@Given("Open Hrm application")
	public void open_hrm_application() {
	   driver=new ChromeDriver();
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	   driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}

	@When("User enter {string} and {string}")
	public void user_enter_and(String un, String psw) {
	    
		driver.findElement(By.name("username")).sendKeys(un);
		driver.findElement(By.name("password")).sendKeys(psw);
	}

	@When("click on Hrm login button")
	public void click_on_hrm_login_button() {
	   driver.findElement(By.xpath("//button[@type='submit']")).click();
	}

	@Then("As per validation valid user should be login")
	public void as_per_validation_valid_user_should_be_login() {


		Assert.assertTrue(driver.getCurrentUrl().contains("dashboard"),"Login Fail");
		System.out.println("Login completed and Test Pass!");
	}



}
