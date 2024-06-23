package dataDrivenTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class CustomData {

	@DataProvider(name="mydata")
	public Object[][] testData()
	{
		Object data[][]= {{"Admin","admin123"},{"Rekha","test123"},{"Amit","test123"}};
		return data;
	}
	
	
public XSSFWorkbook wb;
	@DataProvider(name="Exceldata")
	public Object[][] ExcelRead()
	{
		
		//File path to read a file -File
		  File f1=new File(System.getProperty("user.dir")+"//TestData//Data.xlsx");
		  
		  //to read data in a stream -FileInputStream
		   FileInputStream fs;
		   
		   Object data[][]=null;
		try {
			fs = new FileInputStream(f1);
			  //Wb-->sheet-->row-->cell-->data
			   
			    wb=new XSSFWorkbook(fs);
			    
				   //Number of rows
				   int rows=wb.getSheet("userdata").getPhysicalNumberOfRows();
				   System.out.println("Number of Rows are: "+rows);
				   
				   //Number of cells
				   int cells=wb.getSheet("userdata").getRow(0).getPhysicalNumberOfCells();
				   System.out.println("Number of cells: "+cells);
				   
				   //create an array for same size of file
				  data=new Object[rows-1][cells];
				   
				   //iterate array and read data from file and save it inside array
				   
				   for(int i=1;i<rows;i++)//rows
				   {
					   for(int j=0;j<cells;j++)//cells
					   {
						   data[i-1][j]=wb.getSheet("userdata").getRow(i).getCell(j).getStringCellValue();
						   //System.out.print(data[i-1][j]+"  ");
					   }
					   System.out.println();
					   
				   }
				  
				   
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		   
		 return data;
		  
	}
}
