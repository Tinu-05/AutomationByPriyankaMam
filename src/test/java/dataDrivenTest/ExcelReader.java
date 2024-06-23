package dataDrivenTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.*;
import org.testng.annotations.Test;

public class ExcelReader {
  @Test
  public void fileRead() throws IOException
  {
	  //File path to read a file -File
	  File f1=new File(System.getProperty("user.dir")+"//TestData//Data.xlsx");
	  
	  //to read data in a srtream -FileInputStream
	   FileInputStream fs=new FileInputStream(f1);
	   
	   //Wb-->sheet-->row-->cell-->data
	   
	   XSSFWorkbook wb=new XSSFWorkbook(fs);
	   
	   //Number of rows
	   int rows=wb.getSheet("userdata").getPhysicalNumberOfRows();
	   System.out.println("Number of Rows are: "+rows);
	   
	   //Number of cells
	   int cells=wb.getSheet("userdata").getRow(0).getPhysicalNumberOfCells();
	   System.out.println("Number of cells: "+cells);
	   
	   //create an array for same size of file
	   Object data[][]=new Object[rows-1][cells];
	   
	   //iterate array and read data from file and save it inside array
	   
	   for(int i=1;i<rows;i++)//rows
	   {
		   for(int j=0;j<cells;j++)//cells
		   {
			   data[i-1][j]=wb.getSheet("userdata").getRow(i).getCell(j).getStringCellValue();
			   System.out.print(data[i-1][j]+"  ");
		   }
		   System.out.println();
		   
	   }
	   
	   //return array to data provider
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   /*
	   //Read single entry
	   
	   String data=wb.getSheet("userdata").getRow(2).getCell(0).getStringCellValue();
//	   XSSFSheet sheet1=wb.getSheet("userdata");
//	   
//	   XSSFRow row1=sheet1.getRow(2);
//	   
//	   XSSFCell cell1=row1.getCell(0);
//	   
//	   String data=cell1.getStringCellValue();
	   
	   System.out.println(data);
	   */
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
