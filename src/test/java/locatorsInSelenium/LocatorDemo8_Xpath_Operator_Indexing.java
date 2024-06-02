package locatorsInSelenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorDemo8_Xpath_Operator_Indexing {

	public static void main(String[] args) 
	{
	//create driver session
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/register");
		
		//firstname- basic
		driver.findElement(By.xpath("//input[@class='form-control']")).sendKeys("Priyanka");
			
		
		//lastname- and 
		driver.findElement(By.xpath("//input[@name='lastname' and @class='form-control']")).sendKeys("Nigade");
		
		//email- or
		driver.findElement(By.xpath("//input[@name='email'or @class='form-contro']")).sendKeys("testjune2024@gmail.com");
		
		//telephone- indexing
		driver.findElement(By.xpath("(//input[@class='form-control'])[4]")).sendKeys("877655444");
		
		//password- position()
		driver.findElement(By.xpath("(//input[@class='form-control'])[position()=5]")).sendKeys("test123");
		
		//confirm password- indexing
		driver.findElement(By.xpath("(//input[@class='form-control'])[6]")).sendKeys("test123");
		
		/*
		 * check the radio button
		 * if radio button is not selected then select the same
		 */
		
		List<WebElement> list=driver.findElements(By.xpath("(//div[@class='col-sm-10'])[8]//input"));
		System.out.println("Total Radio buttons are: "+list.size());
		
		WebElement ele=driver.findElement(By.xpath("//label[@class='radio-inline']"));
		
		for(WebElement i:list)
		{
			if(!(i.isSelected()))
			{
				System.out.println("Selected: "+ele.getText());
				i.click();
				break;
			}
		}
		
		//checkbox
		driver.findElement(By.xpath("//input[@name='agree']")).click();
		
		//continue btn
		driver.findElement(By.xpath("//input[@value='Continue']")).click();
		
		//validation
		String actText=driver.findElement(By.xpath("(//h1)[2]")).getText();
		
		String exp="Created!";
		
		if(actText.contains(exp))
		{
			System.out.println(actText+" Test Pass!");
			
		}else
		{
			System.out.println("Account is not created! "+" Test Fail!");
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
