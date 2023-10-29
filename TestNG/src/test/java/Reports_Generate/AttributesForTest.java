package Reports_Generate;

import java.awt.Desktop;
import java.io.File;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class AttributesForTest 
{
	public static void main(String args[]) throws Exception
	  {
		  ExtentReports er = new ExtentReports();
		  ExtentSparkReporter Spark = new ExtentSparkReporter("C:\\Users\\acer\\eclipse-workspace\\TestNG\\src\\test\\java\\Reports_Generate\\Report5.html");
		                er.attachReporter(Spark);            // reporter attach to engine

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
		                .fail("This is a Failed Test");
		                
		                er
		                .createTest("Test5", "Test desc")       
		                .assignAuthor(new String[] {"Johny", "Rohit", "Loki"})
		                .assignCategory(new String[] {"Smoke", "Sanity", "Regression"})
		                .assignDevice(new String[] {"Edge", "ChromeBrowser", "FirefoxBrowser"})
		                .pass("This is a Passed Test");
		                
		                er.flush();			                
		                Desktop.getDesktop().browse(new File("C:\\Users\\acer\\eclipse-workspace\\TestNG\\src\\test\\java\\Reports_Generate\\Report5.html").toURI());
	  }
}
