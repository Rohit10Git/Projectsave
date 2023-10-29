package Commands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCommands 
{
	 public static void main (String args []) throws InterruptedException
	  {
		  System.setProperty("webdriver.chrome.driver", "R:\\Selenium\\Application\\ChromeDriver\\chromedriver.exe");
		  
	      WebDriver driver = new ChromeDriver();                        
		  
	                driver.manage().window().maximize();                                         // maximize browser window
	                
		            driver.get("https://www.selenium.dev/");                                     // get method to launch browser
		            
		            Thread.sleep(3000);
		            
		  String Title = driver.getTitle();                                                        // getTitle method
		  System.out.println("Actual title of page : " +Title);                                    // Printing current page title on console
		  
		  String CurrentUrl = driver.getCurrentUrl();                                              // getCurrentUrl method
		  System.out.println("Current page URL : " +CurrentUrl);                                   // Printing current page url on console
		  
		  String Text = driver.findElement
				               (By.id("Layer_1"))
				               .getText();                                                          // getText method
		  System.out.println("Current page text : " +Text);                                         // Printing page text on console
		  
	      String pageSource = driver.getPageSource();                                               // Store page source in String variable
	      System.out.println("Current Page source : " +pageSource);                                 // Printing page source on console
	      
	      int pageSourceLength = pageSource.length();                                             // Storing page source length in Int variable            
	      System.out.println("Length of pagesource : " +pageSourceLength);                        // Printing length of page source on console
		  
		             driver.close();                                                              // close method
	  }
}
