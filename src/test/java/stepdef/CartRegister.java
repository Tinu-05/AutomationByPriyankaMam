package stepdef;

import java.time.Duration;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;

public class CartRegister {

	WebDriver driver;
	@Given("Open Register page")
	public void open_register_page() {
	    driver=new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    driver.get("https://tutorialsninja.com/demo/index.php?route=account/register");
	}

	@When("User enters all details")
	public void user_enters_all_details(DataTable table) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.

		List<Map<String,String>> map=table.asMaps();
		System.out.println(map.get(0).get("fname"));
		driver.findElement(By.name("firstname")).sendKeys(map.get(0).get("fname"));
		driver.findElement(By.name("lastname")).sendKeys(map.get(0).get("lname"));
		driver.findElement(By.name("email")).sendKeys(map.get(0).get("email"));
		driver.findElement(By.name("telephone")).sendKeys(map.get(0).get("telephone"));
		driver.findElement(By.name("password")).sendKeys(map.get(0).get("password"));
		driver.findElement(By.name("confirm")).sendKeys(map.get(0).get("cpassword"));
		
		
		
	}

	@When("User click on newsletter yes")
	public void user_click_on_newsletter_yes() {
	   driver.findElement(By.xpath("(//input[@type='radio'])[2]")).click();
	}

	@When("User check the privacyPolicy")
	public void user_check_the_privacy_policy() {
	 driver.findElement(By.name("agree")).click();
	}

	@When("Click on Continue button")
	public void click_on_continue_button() {

		driver.findElement(By.xpath("//input[@value='Continue']")).click();
	}

	@Then("User should resgister successfully")
	public void user_should_resgister_successfully() {

		System.out.println("User registartion is completed!");
		
	}


}
