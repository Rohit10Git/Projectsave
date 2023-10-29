package Locartors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkText_PartialLinkText 
{
	public static void main (String args []) throws InterruptedException
	  {
		  System.setProperty("webdriver.chrome.driver", "R:\\Selenium\\Application\\ChromeDriver\\chromedriver.exe");
		  
	      WebDriver driver = new ChromeDriver();                        		  
	                        driver.manage().window().maximize();                                   // maximize window
	                
	                        driver.get("https://www.facebook.com/reg/");                             // get method
		            
		                    Thread.sleep(3000);
		      
		                   String Text = driver.findElement(By.linkText("Sign Up")).getText();
		                   System.out.println("Text of element : " +Text);
		                    
		                   Thread.sleep(3000);  
		                   
		                   String Text2 = driver.findElement(By.partialLinkText("Already have")).getText();
		                   System.out.println("Text of element : " +Text2);
		                    
		                    driver.close();
       }
}