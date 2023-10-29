package Reports_Generate;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AttachScreenshotsTestAndLogLevel 
{
	static WebDriver driver;
	public static void main(String args[]) throws Exception
	  {
		  ExtentReports er = new ExtentReports();
		  ExtentSparkReporter Spark = new ExtentSparkReporter("C:\\Users\\acer\\eclipse-workspace\\TestNG\\src\\test\\java\\Reports_Generate\\Report4.html");
		                er.attachReporter(Spark);            // reporter attach to engine
    
		                WebDriverManager.chromedriver().setup();
		                driver = new ChromeDriver();
		                driver.get("https:/www.google.com/");
		                String base64Code = captureScreenshot();
		                String path = captureScreenshot("Google_R4.jpg");
		                
		                er
		                .createTest("Screenshot Test1", "This is a Test to attach screenshot to the report")       
		                .log(Status.INFO, "this is log info.")   
		                .addScreenCaptureFromBase64String(base64Code);       //without Title TEST LEVEL
		                
		                er
		                .createTest("Screenshot Test2", "This is a Test to attach screenshot to the report")       
		                .log(Status.INFO, "this is log info.")   
		                .addScreenCaptureFromBase64String(base64Code, "Google homepage");     //with Title TEST LEVEL
		                
		                er
		                .createTest("Screenshot Test3", "This is a Test to attach screenshot to the report")       
		                .log(Status.INFO, "this is log info.")   
		                .addScreenCaptureFromBase64String(base64Code, "Google homepage1")     //with Title TEST LEVEL
		                .addScreenCaptureFromBase64String(base64Code, "Google homepage2")     //with Title TEST LEVEL
		                .addScreenCaptureFromBase64String(base64Code, "Google homepage3")     //with Title TEST LEVEL
		                .addScreenCaptureFromBase64String(base64Code, "Google homepage4")     //with Title TEST LEVEL
		                .addScreenCaptureFromBase64String(base64Code, "Google homepage5");     //with Title	TEST LEVEL	                
		               
		                er
		                .createTest("Screenshot Test4", "This is a Test to attach screenshot to the report")       
		                .log(Status.INFO, "this is log info.")   
		                .addScreenCaptureFromPath(path, "Google homepage1")       //with Title TEST LEVEL
		                .addScreenCaptureFromPath(path, "Google homepage2")       //with Title TEST LEVEL
		                .addScreenCaptureFromPath(path, "Google homepage3")       //with Title TEST LEVEL
		                .addScreenCaptureFromPath(path, "Google homepage4");       //with Title TEST LEVEL
		                
		                er
		                .createTest("Screenshot Test5", "This is a Test to attach screenshot to the report")       
		                .log(Status.INFO, "this is log info.")   
		                .addScreenCaptureFromPath(path, "Google homepage");       //with Title TEST LEVEL
		                
		                er
		                .createTest("Screenshot Test6", "This is a Test to attach screenshot to the report")       
		                .log(Status.INFO, "this is log info.")   
		                .addScreenCaptureFromPath(path);         //without Title TEST LEVEL
		                
		                er
		                .createTest("Screenshot Test7", "This is a Test to attach screenshot to the report")     //Log Level  
		                .log(Status.INFO, "this is log info.")
		                .fail(MediaEntityBuilder.createScreenCaptureFromBase64String(base64Code).build())
		                .fail(MediaEntityBuilder.createScreenCaptureFromBase64String(base64Code, "Google homepage").build());
		                
		                er
		                .createTest("Screenshot Test8", "This is a Test to attach screenshot to the report")     //Log Level  
		                .log(Status.INFO, "this is log info.")
		                .fail(MediaEntityBuilder.createScreenCaptureFromPath(path).build())
		                .fail(MediaEntityBuilder.createScreenCaptureFromPath(path, "Google homepage").build());
		                
		                er
		                .createTest("Screenshot Test9", "This is a Test to attach screenshot to the report")     //Log Level  
		                .log(Status.INFO, "this is log info.")
		                .fail("Details are here",MediaEntityBuilder.createScreenCaptureFromBase64String(base64Code).build())      //details & image
		                .fail("Details are here",MediaEntityBuilder.createScreenCaptureFromBase64String(base64Code, "Google homepage").build());
		                
		                er
		                .createTest("Screenshot Test10", "This is a Test to attach screenshot to the report")     //Log Level  
		                .log(Status.INFO, "this is log info.")
		                .fail("Details are here",MediaEntityBuilder.createScreenCaptureFromPath(path).build())            //details & image
		                .fail("Details are here",MediaEntityBuilder.createScreenCaptureFromPath(path, "Google homepage").build());
		                
		                Throwable t = new Throwable("This is a Throwable Exception");
		                er
		                .createTest("Screenshot Test11", "This is a Test to attach screenshot to the report")     //Log Level  
		                .log(Status.INFO, "this is log info.")
		                .fail(t,MediaEntityBuilder.createScreenCaptureFromBase64String(base64Code).build())      //Exception details & image
		                .fail(t,MediaEntityBuilder.createScreenCaptureFromBase64String(base64Code, "Google homepage").build());
		                
		                er
		                .createTest("Screenshot Test12", "This is a Test to attach screenshot to the report")     //Log Level  
		                .log(Status.INFO, "this is log info.")
		                .fail(t,MediaEntityBuilder.createScreenCaptureFromPath(path).build())            //Exception details & image
		                .fail(t,MediaEntityBuilder.createScreenCaptureFromPath(path, "Google homepage").build());
		                
		                
		                er.flush();	
		                driver.quit();
		                Desktop.getDesktop().browse(new File("C:\\Users\\acer\\eclipse-workspace\\TestNG\\src\\test\\java\\Reports_Generate\\Report4.html").toURI());
	  }
	
	            public static String captureScreenshot()
	            {
		                TakesScreenshot ts = (TakesScreenshot) driver;
		        		String base64Code = ts.getScreenshotAs(OutputType.BASE64);		        
		        		System.out.println("Screenshot saved successfully");
		        		return base64Code;
	             }
	            
	            public static String captureScreenshot(String fileName)
	            {
		                TakesScreenshot ts = (TakesScreenshot) driver;
		        		File sourceFile = ts.getScreenshotAs(OutputType.FILE);
		        		File destFile = new File("./Screenshots/"+ fileName);
		        		try 
		        		{
		        			FileUtils.copyFile(sourceFile, destFile);
		        		} 
		        		catch (IOException e) 
		        		{		
		        			e.printStackTrace();
		        		}
		        		System.out.println("Screenshot saved successfully");
		        		return destFile.getAbsolutePath();
	             }
}
