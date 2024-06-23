package dataDrivenTest;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataDrivenDemo1_Array 
{
	
	//test data
//	@DataProvider(name="mydata")
//	public Object[][] testData()
//	{
//		Object data[][]= {{"Admin","admin123"},{"Rekha","test123"},{"Amit","test123"}};
//		return data;
//	}
//	
	
	
	
	
  @Test(dataProvider="mydata",dataProviderClass = CustomData.class)
  public void loginTest(String un,String pwd)
  {
	  System.out.println("UserName is: "+un);
	  System.out.println("Password is: "+pwd);
	  
  }
}
