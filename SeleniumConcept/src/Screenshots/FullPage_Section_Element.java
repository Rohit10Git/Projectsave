package Screenshots;                  // SDFET QA

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class FullPage_Section_Element 
{
	  public static void main (String args []) throws InterruptedException, IOException 
	  {
		  System.setProperty("webdriver.chrome.driver", "R:\\Selenium\\Application\\ChromeDriver\\chromedriver.exe");
		  
		  WebDriver driver = new ChromeDriver();
		  driver.manage().window().maximize();                                     // maximize window 		  
		  driver.manage().deleteAllCookies();
		  
          driver.get("https://www.amazon.in/");                                   
          Thread.sleep(3000);
          
            // Full page screenshot
          TakesScreenshot ts = (TakesScreenshot) driver;                     // Type_cast (TakesScreenshot)
          File src = ts.getScreenshotAs(OutputType.FILE);                                        //capture screenshot & store in src
          File trg = new File(".\\Screenshots\\Homepage.png");   //Specify the location to store
          FileHandler.copy(src, trg);                                                            //copy src file to trg      
          Thread.sleep(3000);
          
          // Screenshot of section/portion of the page
          WebElement Section = driver.findElement(By.xpath("//div[@id=\"desktop-1\"]"));
          // **** getScreenshot() already available in WebElement so not using TakesScreenshot ***
                    
          File sec = Section.getScreenshotAs(OutputType.FILE);                                   //capture screenshot & store in src
          File tar = new File(".\\Screenshots\\Section_shot.png");            //Specify the location to store
          FileHandler.copy(sec, tar);                                                            //copy src file to trg       
          Thread.sleep(3000);
          
          // Screenshot of single Element of the page
          WebElement element = driver.findElement(By.xpath("//a[@id=\"nav-logo-sprites\"]"));
    // **** getScreenshot() already available in WebElement so not using TakesScreenshot ***
          
          File ele = element.getScreenshotAs(OutputType.FILE);                                   //capture screenshot & store in src
          File log = new File(".\\Screenshots\\Logo.png");                    //Specify the location to store
          FileHandler.copy(ele, log);                                                            //copy src file to trg       
          Thread.sleep(3000);
          
          driver.close();
      }	 	
}
