package Excel_Sheet;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadAllRowSelectedData 
{
	public static void main(String args[]) throws Exception
	{
		File path = new File(".\\Data_Files\\Employee1.xlsx");
		
		FileInputStream op = new FileInputStream(path);                            //opens excel file
		
        XSSFWorkbook wb = new XSSFWorkbook(op);                                    //opens Workbook
		
		XSSFSheet sheet1 = wb.getSheetAt(0);                                       //opens Sheet by index
		
		int rowcount = sheet1.getLastRowNum();                                     //counts total numbers of rows (Starts with 0)
		System.out.println("Total no. of rows : " +rowcount);
		
		for(int i=0;i<=rowcount;i++)
		{
			String data0 = sheet1.getRow(i).getCell(1).getStringCellValue();
			System.out.println("Data from row " +i +" c2 : " +data0);
		}
		
		wb.close();
	}
}
