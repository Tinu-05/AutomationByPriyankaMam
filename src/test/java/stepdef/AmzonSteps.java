package stepdef;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.*;

public class AmzonSteps {

	WebDriver driver;
	@Given("Open amazon application")
	public void open_amazon_application() {

		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
	}

	@When("User get the title of homepage")
	public void user_get_the_title_of_homepage() {
	    System.out.println("Title is: "+driver.getTitle());
	}

	@Then("Home page title should be matched")
	public void home_page_title_should_be_matched() {

		Assert.assertTrue(driver.getTitle().contains("India"),"Home page Title not matched");
		System.out.println("Home page title is matched");
	}

	@When("User open bestsessler page")
	public void user_open_bestsessler_page() {

		driver.findElement(By.xpath("//a[text()='Best Sellers']")).click();

	}

	@When("get the title of beste sessler")
	public void get_the_title_of_beste_sessler() {
	   System.out.println("Title is: "+driver.getTitle());
	}

	@Then("Best sesslers page title should match")
	public void best_sesslers_page_title_should_match() {
		Assert.assertTrue(driver.getTitle().contains("Bestsellers"),"Best sellers Title not matched");
		System.out.println("Best sellers title is matched");
	}

	@When("User open mobile page")
	public void user_open_mobile_page() {

driver.findElement(By.xpath("//a[text()='Mobiles']")).click();
	}

	@When("get the title of mobile")
	public void get_the_title_of_mobile() {

System.out.println(driver.getTitle());
	}

	@Then("mobile page title should match")
	public void mobile_page_title_should_match() {
		Assert.assertTrue(driver.getTitle().contains("Phones"),"Mobiles Title not matched");
		System.out.println("Mobiles title is matched");
	}

	@When("User open fashion page")
	public void user_open_fashion_page() {
	   driver.findElement(By.xpath("//a[text()='Fashion']")).click();
	   
	}

	@When("get the title of fashion")
	public void get_the_title_of_fashion() {
	   System.out.println(driver.getTitle());
	}

	@Then("fashion page title should match")
	public void fashion_page_title_should_match() {

		Assert.assertTrue(driver.getTitle().contains("Fashion"),"Fashion Title not matched");
		System.out.println("Fashion title is matched");
	}


}
