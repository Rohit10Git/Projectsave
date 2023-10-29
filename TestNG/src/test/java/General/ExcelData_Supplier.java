package General;

import java.io.File;
import java.io.FileInputStream;
import java.util.Arrays;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class ExcelData_Supplier 
{
	@DataProvider(name = "loginData")
	 public String[][] getData() throws Exception 
	  {
		File excellFile = new File("./src/test/resources/Excel_DataProvider.xlsx");
		System.out.println(excellFile.exists());
		
		FileInputStream fis = new FileInputStream(excellFile);
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		
		int noOfRows = sheet.getPhysicalNumberOfRows();
		System.out.println(noOfRows);

		int noOfColumns = sheet.getRow(0).getLastCellNum();	
		System.out.println(noOfColumns);
		
		String[][] data = new String[noOfRows-1][noOfColumns];
		for(int i = 0; i < noOfRows-1; i++)
	    {	
		  for(int j=0; j < noOfColumns; j++)
		  {
			DataFormatter df  = new DataFormatter(); 
		    data[i][j] = df.formatCellValue(sheet.getRow(i+1).getCell(j));		    
		  }		  
		}
		
		workbook.close();
		fis.close();
		
		for(String[] dataArr : data)
		{
			System.out.println(Arrays.toString(dataArr));
		}
		return data;
	  }
}
