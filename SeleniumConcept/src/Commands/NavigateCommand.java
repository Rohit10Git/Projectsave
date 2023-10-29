package Commands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateCommand 
{
	public static void main (String args []) throws InterruptedException
	  {
		  System.setProperty("webdriver.chrome.driver", "R:\\Selenium\\Application\\ChromeDriver\\chromedriver.exe");
		  
	      WebDriver driver = new ChromeDriver();                        
		  
	                driver.manage().window().maximize();                                   // maximize window
	                
		            driver.get("https://www.selenium.dev/");                               // get method -  selenium.dev opens
		            System.out.println(" get : " +driver.getTitle());
		            Thread.sleep(3000);
		            
		            driver.navigate().to("https://www.google.com/");                   // navigate().to() - google opens
		            System.out.println(" navigate To : " +driver.getTitle());
		            Thread.sleep(3000);
		            
		            driver.navigate().back();                                              // navigate().back() - selenium.dev opens
		            System.out.println(" navigate back : " +driver.getTitle());
		            Thread.sleep(3000);
		            
		            driver.navigate().refresh();                                           // navigate().refresh() - page refreshes
		            System.out.println(" Page is refreshed successfully ");
		            Thread.sleep(3000);
		            
		            driver.navigate().forward();                                           // navigate().forward() - google opens
		            System.out.println(" navigate forward : " +driver.getTitle());
		            Thread.sleep(3000);
		            
		            driver.close();
     }
}
