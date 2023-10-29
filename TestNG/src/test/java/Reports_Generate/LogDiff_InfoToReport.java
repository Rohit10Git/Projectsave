package Reports_Generate;

import java.awt.Desktop;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.CodeLanguage;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class LogDiff_InfoToReport 
{
	public static void main(String args[]) throws Exception
	  {
		  ExtentReports er = new ExtentReports();
		  ExtentSparkReporter Spark = new ExtentSparkReporter("C:\\Users\\acer\\eclipse-workspace\\TestNG\\src\\test\\java\\Reports_Generate\\Report3.html");
		                er.attachReporter(Spark);            // reporter attach to engine
                   
		   //  ----------   TEXT BASED TEST    ---------
		                
		                er
		                .createTest("Text based Test")       
		                .log(Status.INFO, "info1")   
		                .log(Status.INFO, "<b>info2</b>")           // Bold format
		                .log(Status.INFO, "<i>info3</i>")           // Italic format
		                .log(Status.INFO, "<b><i>info4</i></b>");   // Bold-Italic format
		              
	      // ----------- XML  JSON TYPE DATA TEST  --------------- 
		                
		                String xmlData = "<employees>  \r\n"
		                		+ "    <employee>  \r\n"
		                		+ "        <name>Shyam</name>   \r\n"
		                		+ "        <email>shyamjaiswal@gmail.com</email>  \r\n"
		                		+ "    </employee>  \r\n"
		                		+ "    <employee>  \r\n"
		                		+ "        <name>Bob</name>   \r\n"
		                		+ "        <email>bob32@gmail.com</email>  \r\n"
		                		+ "    </employee>  \r\n"
		                		+ "    <employee>  \r\n"
		                		+ "        <name>Jai</name>   \r\n"
		                		+ "        <email>jai87@gmail.com</email>  \r\n"
		                		+ "    </employee>  \r\n"
		                		+ "</employees>  ";
		                
		                String jsonData = "{\"employees\":[  \r\n"
		                		+ "    {\"name\":\"Shyam\", \"email\":\"shyamjaiswal@gmail.com\"},  \r\n"
		                		+ "    {\"name\":\"Bob\", \"email\":\"bob32@gmail.com\"},  \r\n"
		                		+ "    {\"name\":\"Jai\", \"email\":\"jai87@gmail.com\"}  \r\n"
		                		+ "]}  ";
		                		
		                er
		                .createTest("xml based Test")       
		                //.log(Status.INFO, "xmlData");
		                .log(Status.INFO, MarkupHelper.createCodeBlock(xmlData, CodeLanguage.XML));
		                
		                er
		                .createTest("json based Test")       
		                //.log(Status.INFO, "jsonData");
		                .log(Status.INFO, MarkupHelper.createCodeBlock(jsonData, CodeLanguage.JSON));
		               
       //  ------------ LIST SET  MAP TYPE DATA TEST ---------------
		                
		                List<String> listData = new ArrayList<String>();
		                listData.add("Rohit");
		                listData.add("Ankit");
		                listData.add("Nikhil");
		                
		                Map<Integer, String> mapData = new HashMap<Integer, String>();
		                mapData.put(101, "Rohit");
		                mapData.put(101, "Ankit");
		                mapData.put(101, "Nikhil");
		                
		                Set<Integer> setData = mapData.keySet();
		              
		                er
		                .createTest("List based Test")       		                
		                .log(Status.INFO, MarkupHelper.createOrderedList(listData))
		                .log(Status.INFO, MarkupHelper.createUnorderedList(listData));
		                
		                er
		                .createTest("Map based Test")       		                
		                .log(Status.INFO, MarkupHelper.createOrderedList(mapData))
		                .log(Status.INFO, MarkupHelper.createUnorderedList(mapData));
		                
		                er
		                .createTest("Set based Test")       		                
		                .log(Status.INFO, MarkupHelper.createOrderedList(setData))
		                .log(Status.INFO, MarkupHelper.createUnorderedList(setData));
		                
		      //  -----------------  Highlight Text Test  ------------------
		                
		                er
		                .createTest("Highlight Text Test")
		                .info("This is NOT Highlighted text")
		                .log(Status.INFO, MarkupHelper.createLabel("This is Highlighted text", ExtentColor.RED));
		              
		     //  -----------------  Exception Test  ------------------
		               
		               try
		               {
		            	   int i= 5/0;
		               }
		               catch (Exception e)
		               {
		            	   er
			                .createTest("Exception Test1")
			                .info(e);  
		               }
		               
		               Throwable t = new RuntimeException("This is a custom exception");
		               er
		                .createTest("Exception Test2")
		                .info(t);  
		                
		               er.flush();	
		                Desktop.getDesktop().browse(new File("C:\\Users\\acer\\eclipse-workspace\\TestNG\\src\\test\\java\\Reports_Generate\\Report3.html").toURI());
    }
}
