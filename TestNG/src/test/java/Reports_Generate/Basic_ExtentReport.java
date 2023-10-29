package Reports_Generate;

import java.awt.Desktop;
import java.io.File;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Basic_ExtentReport 
{
	public static void main(String args[]) throws Exception
	  {
		  ExtentReports er = new ExtentReports();
		  ExtentSparkReporter Spark = new ExtentSparkReporter("C:\\Users\\acer\\eclipse-workspace\\TestNG\\src\\test\\java\\Reports_Generate\\Report1.html");
		                er.attachReporter(Spark);            // reporter attach to engine
		               
	      ExtentTest test1 = er.createTest("Test 1");             // 1 create Test
	      test1.pass("This is Passed");                           // create status of test
	      
	      ExtentTest test2 = er.createTest("Test 2");             // 2 create Test
	      test2.log(Status.FAIL, "This is Failed");               // creating log of test
	      
	      er.createTest("Test 3").skip("this is Skipped");        //3 chaining type
		                er.flush();	
		                Desktop.getDesktop().browse(new File("C:\\Users\\acer\\eclipse-workspace\\TestNG\\src\\test\\java\\Reports_Generate\\Report1.html").toURI());
	  }
}
