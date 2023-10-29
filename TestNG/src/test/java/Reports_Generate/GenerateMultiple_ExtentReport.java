package Reports_Generate;

import java.awt.Desktop;
import java.io.File;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class GenerateMultiple_ExtentReport 
{
	public static void main(String args[]) throws Exception
	  {
		  ExtentReports er = new ExtentReports();
		  ExtentSparkReporter Spark_all = new ExtentSparkReporter("C:\\Users\\acer\\eclipse-workspace\\TestNG\\src\\test\\java\\Reports_Generate\\AllTestsR6.html");	
		  ExtentSparkReporter Spark_failed = new ExtentSparkReporter("C:\\Users\\acer\\eclipse-workspace\\TestNG\\src\\test\\java\\Reports_Generate\\FailedTestsR6.html");
		  Spark_failed.filter().statusFilter().as(new Status[] {Status.FAIL}).apply();
		  ExtentSparkReporter Spark_skipAndWarn = new ExtentSparkReporter("C:\\Users\\acer\\eclipse-workspace\\TestNG\\src\\test\\java\\Reports_Generate\\SkipAndWarnTestsR6.html");
		  Spark_skipAndWarn.filter().statusFilter().as(new Status[] {
				  Status.SKIP,
				  Status.WARNING
				  }).apply();
		  
		  er.attachReporter(Spark_all, Spark_failed, Spark_skipAndWarn );            // reporter attach to engine

		                er
		                .createTest("Test1", "Test desc")       
		                .assignAuthor("Rohit")
		                .assignCategory("Sanity")
		                .assignDevice("ChromeBrowser")
		                .pass("This is a Passed Test");
		                
		                er
		                .createTest("Test2", "Test desc")       
		                .assignAuthor("Johny")
		                .assignCategory("Smoke")
		                .assignDevice("Edge")
		                .fail("This is a Failed Test");
		                
		                er
		                .createTest("Test3", "Test desc")       
		                .assignAuthor("Rohit")
		                .assignAuthor("Nkhil")
		                .assignCategory("Sanity")
		                .assignCategory("Regression")
		                .assignDevice("ChromeBrowser")
		                .assignDevice("FirefoxBrowser")
		                .pass("This is a Passed Test")
		                .pass("This is a Passed Test");
		                
		                er
		                .createTest("Test4", "Test desc")       
		                .assignAuthor("Johny", "Rohit", "Loki")
		                .assignCategory("Smoke", "Sanity", "Regression")
		                .assignDevice("Edge", "ChromeBrowser", "FirefoxBrowser")
		                .skip("This is a Skipped Test");
		                
		                er
		                .createTest("Test5", "Test desc")       
		                .assignAuthor(new String[] {"Johny", "Rohit", "Loki"})
		                .assignCategory(new String[] {"Smoke", "Sanity", "Regression"})
		                .assignDevice(new String[] {"Edge", "ChromeBrowser", "FirefoxBrowser"})
		                .warning("This is a Warning Test");
		                
		                er.flush();			                
		                Desktop.getDesktop().browse(new File("C:\\Users\\acer\\eclipse-workspace\\TestNG\\src\\test\\java\\Reports_Generate\\AllTestsR6.html").toURI());
		                Desktop.getDesktop().browse(new File("C:\\Users\\acer\\eclipse-workspace\\TestNG\\src\\test\\java\\Reports_Generate\\\\FailedTestsR6.html").toURI());
		                Desktop.getDesktop().browse(new File("C:\\Users\\acer\\eclipse-workspace\\TestNG\\src\\test\\java\\Reports_Generate\\\\SkipAndWarnTestsR6.html").toURI());
		                
	  }
}
