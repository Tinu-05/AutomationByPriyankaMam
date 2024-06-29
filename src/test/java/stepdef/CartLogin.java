package stepdef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class CartLogin 
{

	WebDriver driver;
	
	@Given("Open CartLogin page")
	public void open_cart_login_page() {
	    driver=new ChromeDriver();
	    driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
	}

	@When("User enter {string} and password {string}")
	public void user_enter_and_password(String email, String psw) {
	    driver.findElement(By.name("email")).sendKeys(email);
	    driver.findElement(By.name("password")).sendKeys(psw);
	}

	@When("User click on Cart Login button")
	public void user_click_on_cart_login_button() {
	    driver.findElement(By.xpath("//input[@value='Login']")).click();
	}

	@Then("User should able to login into Cartapplication")
	public void user_should_able_to_login_into_cartapplication() {
	   System.out.println("User is loggedIn");
	}
}
