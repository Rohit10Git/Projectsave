package Excel_Sheet;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteArrayListData 
{
	public static void main(String[] args) throws IOException 
	{
        XSSFWorkbook wb = new XSSFWorkbook();                                           //create empty Workbook
		
		XSSFSheet sheet = wb.createSheet("Employee 3");                                 //creates Sheet by name
		
		ArrayList<Object[]> empdata = new ArrayList<Object[]>();                        //Array list contains Object array
		
		   empdata.add(new Object[]{"EmpId","Name","Job"});                             //every object is single dimensional array
		   empdata.add(new Object[]{301,"Karan","Engineer"});                           //object used to store multiple data
		   empdata.add(new Object[]{302,"Niraj","Analyst"});
		   empdata.add(new Object[]{303,"Durgesh","Manager"});
		   empdata.add(new Object[]{303,"Dhanush","More"});
		   empdata.add(new Object[]{303,"Raka","Yeole"});
		   
		//Using for each loop logic to read data from ArrayList		 
		 int rowCount=0;
			
			for(Object[] emp:empdata)
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
				
			    File path = new File(".\\Data_Files\\Employee3.xlsx");               //create path & name for new file
				FileOutputStream op = new FileOutputStream(path);                   //opens excel file
				wb.write(op);                                                       //write data in excel file
				
				op.close();                                                         //closes file
				
				System.out.println("file written successfully");
				wb.close();
    }
}
