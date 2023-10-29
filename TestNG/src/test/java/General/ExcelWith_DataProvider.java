package General;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWith_DataProvider 
{
	public static void main(String[] args) throws Exception
	  {
		File excellFile = new File("./src/test/resources/Excel_DataProvider.xlsx");
		System.out.println(excellFile.exists());
		
		FileInputStream fis = new FileInputStream(excellFile);
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		
		int noOfRows = sheet.getPhysicalNumberOfRows();
		System.out.println("noOfRows : " +noOfRows);

		int noOfColumns = sheet.getRow(0).getLastCellNum();	
		System.out.println("noOfColumns : " +noOfColumns);
			
		for(int i = 1; i < noOfRows; i++)
	    {	
		  for(int j=0; j < noOfColumns; j++)
		  {
			  DataFormatter df =new DataFormatter();
			  System.out.println(df.formatCellValue(sheet.getRow(i).getCell(j)));
			  
			  // System.out.println(sheet.getRow(i).getCell(j).getStringCellValue());		    or use this
		  }
		  System.out.println();
		}
		
		workbook.close();
		fis.close();
	  }
}
