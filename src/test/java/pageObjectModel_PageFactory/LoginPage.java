package pageObjectModel_PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class LoginPage 
{
	
	private WebDriver driver;
	
	public LoginPage (WebDriver driver)//base class
	{
		this.driver=driver;
	}
	
	//Locator-@FindBy
	
	@FindBy(name="username")
	private WebElement username;
	
	@FindBy(name="password")
	private WebElement password;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement btn;
	
	//methods
	public String getUrl()
	{
		return driver.getCurrentUrl();
	}
	
	public String getAppTitle()
	{
		return driver.getTitle();
	}
	
	
	public void doLogin(String un,String pwd)
	{
		username.sendKeys(un);
		password.sendKeys(pwd);
		btn.click();
		Assert.assertTrue(driver.getCurrentUrl().contains("dashboard"),"Login Fail");
		System.out.println("Login Pass!");
		
	}
	
	
	
	
	
	
	
	
	
	
	

}
