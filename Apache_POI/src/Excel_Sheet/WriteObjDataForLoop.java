package Excel_Sheet;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteObjDataForLoop 
{
	public static void main(String[] args) throws IOException 
	{
		XSSFWorkbook wb = new XSSFWorkbook();                                           //create empty Workbook
		
		XSSFSheet sheet = wb.createSheet("Employee Info");                             //creates Sheet by name
		
		Object empdata[][]= {   {"EmpId","Name","Job"},                               //maintain data in 2 dimensional object Array
				                {101,"David","Engineer"},
				                {102,"Rahul","Analyst"},
				                {103,"Nilesh","Manager"},
				                {104,"Lalit","Assistant"}
		                    };
		
		//Using for loop logic to read data from 2 dimensional Array
		int rows = empdata.length;
		int cols = empdata[0].length;
		
		System.out.println(rows);      //4
		System.out.println(cols);      //3
		
		for(int r=0;r<rows;r++)
		{
			XSSFRow row = sheet.createRow(r);
			
			for(int c=0;c<cols;c++)
			{
				XSSFCell cell = row.createCell(c);     //0
				Object value = empdata[r][c];                                  // Sent data into excel sheet
				
				if(value instanceof String)
					cell.setCellValue((String)value);
				if(value instanceof Integer)
					cell.setCellValue((Integer)value);
				if(value instanceof Boolean)
					cell.setCellValue((Boolean)value);
			}
		}
		
		File path = new File(".\\Data_Files\\EmployeeInfo.xlsx");            //create path & name for new file
		FileOutputStream op = new FileOutputStream(path);                   //opens excel file
		wb.write(op);                                                       //write data in excel file
		
		op.close();                                                         //closes file
		
		System.out.println("file written successfully");
		wb.close();
	}
}
