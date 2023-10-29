package Handling;

import java.io.IOException;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowDimension_Position 
{
	  public static void main (String args []) throws InterruptedException, IOException 
	  {
		  System.setProperty("webdriver.chrome.driver", "R:\\Selenium\\Application\\ChromeDriver\\chromedriver.exe");
		  
		  WebDriver driver = new ChromeDriver();
		  driver.manage().window().maximize();                                        // maximize window 		  
		  driver.manage().deleteAllCookies();
		  
          driver.get("https://www.flipkart.com/");                                   
          Thread.sleep(3000);
          
          Dimension D = new Dimension(800,900);
          driver.manage().window().setSize(D);                                          //To set dimension of window
          Thread.sleep(3000);
          
          Point P = new Point(100,100);
          driver.manage().window().setPosition(P);                                    //To set position of window
          Thread.sleep(3000);
          
          driver.close(); 
       }
}