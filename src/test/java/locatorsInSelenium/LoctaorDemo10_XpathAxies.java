package locatorsInSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoctaorDemo10_XpathAxies {

	public static void main(String[] args)
	{
		// Create a driver session
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://automationplayground.com/crm/customers.html?");

		/*
		 * identify ancestor for Mark
	`=============================
		//td[text()='Mark']//ancestor::tbody
		 */
		
		String tag1=driver.findElement(By.xpath("//td[text()='Mark']//ancestor::tbody")).getTagName();
		System.out.println("Ancestor of Mark is: "+tag1);//tbody
		
		/*
		 * identify parent for Mark
	=============================
		//td[text()='Mark']//parent::tr
		 */
		String tag2=driver.findElement(By.xpath("//td[text()='Mark']//parent::tr")).getTagName();
		System.out.println("Parent of Marks is: "+tag2);//tr
		
		/*
		 * all child of first row
==========================
(//tbody//tr)[1]//child::td
		 */
		
		List<WebElement> allChilds=driver.findElements(By.xpath("(//tbody//tr)[1]//child::td"));
		System.out.println("Total childs are: "+allChilds.size());
		for(WebElement i:allChilds)
		{
			System.out.println(i.getText());
		}
		
		/*
		 * All rows after Mark
	=======================
	//td[text()='Mark']//following::tr
		 */
		
		int size=driver.findElements(By.xpath("//td[text()='Mark']//following::tr")).size();
		System.out.println("All following rows after Mark are: "+size);
		
		/*
		 * All rows before Mark
	==========================
	//td[text()='Mark']//preceding::tr 
		 */
		
		int rows=driver.findElements(By.xpath("//td[text()='Mark']//preceding::tr ")).size();
		System.out.println("All preceding rows for Mark is: "+rows);
		
		/*
		 * All following sibling of Mark
======================================

//td[text()='Mark']//following-sibling::td
		 */
		
		List<WebElement> list1=driver.findElements(By.xpath("//td[text()='Mark']//following-sibling::td"));		
		System.out.println("Following siblings are: "+list1.size());
		
		for(WebElement i:list1)
		{
			System.out.println(i.getText());
		}
		
		
		
		/*
		 * Preceding sibling of Mark
===========================
//td[text()='Mark']//preceding-sibling::td   1 match id
		 */
		
		
		List<WebElement> list2=driver.findElements(By.xpath("//td[text()='Mark']//preceding-sibling::td "));
		System.out.println("Preceding siblings are: "+list2.size());

	
		for(WebElement i:list2)
		{
			System.out.println(i.getText());
		}
	}
	
	
	
	
	
	
	
	

}
