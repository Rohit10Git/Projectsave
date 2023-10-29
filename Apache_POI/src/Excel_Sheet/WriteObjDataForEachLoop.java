package Excel_Sheet;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteObjDataForEachLoop 
{
	public static void main(String[] args) throws IOException 
	{
        XSSFWorkbook wb = new XSSFWorkbook();                                           //create empty Workbook
		
		XSSFSheet sheet = wb.createSheet("Employee 2");                                //creates Sheet by name
		
		Object empdata[][]= {   {"EmpId","Name","Job"},                               //maintain data in 2 dimensional object Array
				                {201,"Dravid","Engineer"},
				                {202,"Chetan","Analyst"},
				                {203,"Mahesh","Manager"},
				                {204,"Nilesh","Rana"}
		                    };
	
		//Using for each loop logic to read data from 2 dimensional Array
		int rowCount=0;
		
		for(Object emp[]:empdata)
		{
			XSSFRow row = sheet.createRow(rowCount++);
			
			int columnCount=0;
			for(Object value:emp)
			{
				XSSFCell cell = row.createCell(columnCount++);
				
				if(value instanceof String)
					cell.setCellValue((String)value);
				if(value instanceof Integer)
					cell.setCellValue((Integer)value);
				if(value instanceof Boolean)
					cell.setCellValue((Boolean)value);
			}
		}
		
	    File path = new File(".\\Data_Files\\Employee2.xlsx");            //create path & name for new file
	    FileOutputStream op = new FileOutputStream(path);                   //opens excel file
	    wb.write(op);                                                       //write data in excel file
	
	    op.close();                                                         //closes file
	
	    System.out.println("file written successfully");
	    wb.close();
     }
}
