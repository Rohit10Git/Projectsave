package Commands;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToWindowGetTitle 
{
	public static void main (String args []) throws InterruptedException
	  {
		  System.setProperty("webdriver.chrome.driver", "R:\\Selenium\\Application\\ChromeDriver\\chromedriver.exe");
		  
	      WebDriver driver = new ChromeDriver();                        		  
	                driver.manage().window().maximize();                                   // maximize window
	                
		            driver.get("http://omayo.blogspot.com/");                    // get method
		            
		            Thread.sleep(3000);
		            
		            // select Button to open new window
		            driver.findElement(By.xpath("//a[contains(text(),'Open a popup window')]")).click();
                  Thread.sleep(3000);
               
                  Set<String> windowsId = driver.getWindowHandles();
                  Iterator<String> iter = windowsId.iterator();                  
                  String parentWindow = iter.next();                      
                  String childWindow = iter.next();
                  
                  System.out.println("parent window title : " +driver.getTitle());       // always focused 1st on parent window             
                 
                  driver.switchTo().window(childWindow);                               // Switches to child window
                  System.out.println("child window title : " +driver.getTitle());    
                  Thread.sleep(3000);
                 
                  driver.switchTo().window(parentWindow);                              // Switches to parent window
                  System.out.println("parent window title : " +driver.getTitle()); 
                  
                  driver.quit();                                                         // To close both windows
}
}
