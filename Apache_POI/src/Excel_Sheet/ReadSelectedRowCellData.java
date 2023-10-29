package Excel_Sheet;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadSelectedRowCellData 
{
	public static void main(String args[]) throws Exception
	{
		File path = new File(".\\Data_Files\\Employee1.xlsx");
		
		FileInputStream op = new FileInputStream(path);                            //opens excell file
		
		XSSFWorkbook wb = new XSSFWorkbook(op);                                    //opens Workbook
		
		XSSFSheet sheet1 = wb.getSheetAt(0);                                       //opens Sheet by index
		
		String data0 = sheet1.getRow(1).getCell(1).getStringCellValue();           //opens row & column & gets data from it
		
		System.out.println("Data from excell is : " +data0);                       //prints data
						
		wb.close();
	}
}
