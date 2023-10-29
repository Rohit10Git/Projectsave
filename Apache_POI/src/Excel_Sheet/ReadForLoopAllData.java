package Excel_Sheet;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadForLoopAllData 
{
	public static void main(String[] args) throws IOException  
	  {
			
		    File path = new File(".\\Data_Files\\Employee1.xlsx");
							
		    FileInputStream op = new FileInputStream(path);                            //opens excel file
			
		    XSSFWorkbook wb = new XSSFWorkbook(op);                                    //opens Workbook
			
		 // XSSFSheet sheet1 = wb.getSheet("Sheet1");                                  //opens Sheet by name
		    XSSFSheet sheet1 = wb.getSheetAt(0);                                       //opens Sheet by index
		    
		    int rowcount = sheet1.getLastRowNum();                                     //counts total numbers of rows (Starts with 0)
			System.out.println("Total no. of rows : " +rowcount);
			
			int cellcount = sheet1.getRow(0).getLastCellNum();                         //counts total numbers of columns (Starts with 1)
			System.out.println("Total no. of columns : " +cellcount);
			
			for(int r=0;r<=rowcount;r++) 
			{			
				XSSFRow row = sheet1.getRow(r);
				
				for(int c=0;c<cellcount;c++) 
				{				
				  XSSFCell cell = row.getCell(c);
					
					switch(cell.getCellType()) 
					{		
			  		  case STRING: System.out.print(cell.getStringCellValue());
					  break;
					  case NUMERIC: System.out.print(cell.getNumericCellValue());
					  break;				  
					  case BOOLEAN: System.out.print(cell.getBooleanCellValue());
					  break;				 
					}								
				  	  System.out.print(" | ");				
				}			
		 	  	  System.out.println();
			}				
			  wb.close();
		}
}
