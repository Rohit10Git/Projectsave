package Excel_Sheet;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadIteratorAllData
{
	public static void main(String[] args) throws IOException 
	  {
			
		    File path = new File(".\\Data_Files\\Employee1.xlsx");
							
		    FileInputStream op = new FileInputStream(path);                            //opens excel file
			
		    XSSFWorkbook wb = new XSSFWorkbook(op);                                    //opens Workbook
					 
		    XSSFSheet sheet1 = wb.getSheetAt(0);                                       //opens Sheet by index
		    
		    Iterator<Row> itr = sheet1.iterator();
		    
		    while(itr.hasNext())
		    {
		    	Row row = itr.next();
		    	
		    	Iterator<Cell> cellIterator = row.cellIterator();
		    	
		    	while(cellIterator.hasNext())
		    	{
		    		Cell cell = cellIterator.next();
		    		
		    		switch(cell.getCellType()) 
					{		
			  		  case STRING: System.out.print(cell.getStringCellValue());
					  break;
					  case NUMERIC: System.out.print(cell.getNumericCellValue());
					  break;				  
					  case BOOLEAN: System.out.print(cell.getBooleanCellValue());
					  break;
					  default:				 
					}								
				  	  System.out.print(" | ");	
		    	}
		    	 System.out.println();	
		    }
		      wb.close();
   }
}
