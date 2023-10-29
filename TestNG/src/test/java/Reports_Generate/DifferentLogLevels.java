package Reports_Generate;

import java.awt.Desktop;
import java.io.File;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class DifferentLogLevels 
{
	public static void main(String args[]) throws Exception
	  {
		  ExtentReports er = new ExtentReports();
		  ExtentSparkReporter Spark = new ExtentSparkReporter("C:\\Users\\acer\\eclipse-workspace\\TestNG\\src\\test\\java\\Reports_Generate\\Report2.html");
		                er.attachReporter(Spark);            // reporter attach to engine
    
		                er
		                .createTest("Test 1")       
		                .log(Status.INFO, "info1")   
		                .log(Status.INFO, "info2") 
		                .log(Status.PASS, "Passed1")
		                .log(Status.PASS, "Passed2")
		                .log(Status.WARNING,"Warneed1") 
		                .log(Status.WARNING, "Warneed2") 
		                .log(Status.SKIP, "Skipped1") 
		                .log(Status.SKIP, "Skipped2") 
		                .log(Status.FAIL, "Failed1") 
		                .log(Status.FAIL, "Failed2");
		                
		                // entire result will be Fail
		                
		                er.flush();	
		                Desktop.getDesktop().browse(new File("C:\\Users\\acer\\eclipse-workspace\\TestNGPractice\\test-output\\ExtentReport\\report2.html").toURI());
	  }
}
