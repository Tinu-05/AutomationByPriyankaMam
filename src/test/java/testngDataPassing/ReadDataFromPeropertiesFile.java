package testngDataPassing;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class ReadDataFromPeropertiesFile
{
  @Test
  public void fileRead() throws IOException
  {
	 
	  //set the path of the file to read
	  File f1=new File(System.getProperty("user.dir")+"//Config.properties");
	  
	  //to read data in stream
	  FileInputStream fs=new FileInputStream(f1);
	  
	  //to read properties file --Java Class Properties
	  Properties p1=new Properties();
	  //load the file
	  p1.load(fs);
	  
	  System.out.println("Browser name is:"+p1.getProperty("bname"));
	System.out.println("Browser version is: "+p1.getProperty("bversion"));
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
