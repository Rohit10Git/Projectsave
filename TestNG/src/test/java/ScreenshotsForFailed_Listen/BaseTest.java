package ScreenshotsForFailed_Listen;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest 
{
	public static WebDriver driver;
	public static String screenshotsSubFolderName;
	
	@BeforeTest
	public void setup() 
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@AfterTest
	public void teardown() 
	{
		driver.quit(); 
	}

	public void captureScreenshot(String fileName) 
	{
		if(screenshotsSubFolderName == null)
		{
			LocalDateTime myDateObj = LocalDateTime.now();	    
			DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("ddMMyyyy HHmmss");
			screenshotsSubFolderName = myDateObj.format(myFormatObj);	    
		}

		TakesScreenshot ts = (TakesScreenshot) driver;
		File sourceFile = ts.getScreenshotAs(OutputType.FILE);
		File destFile = new File("./Screenshots/"+ screenshotsSubFolderName+"/"+fileName);
		try 
		{
			FileUtils.copyFile(sourceFile, destFile);
		} 
		catch (IOException e) 
		{		
			e.printStackTrace();
		}
		System.out.println("Screenshot saved successfully");
	}
}
