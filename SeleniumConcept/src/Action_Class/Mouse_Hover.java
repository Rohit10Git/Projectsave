package Action_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_Hover 
{
	public static void main (String args []) throws InterruptedException
	  {
		  System.setProperty("webdriver.chrome.driver", "R:\\Selenium\\Application\\ChromeDriver\\chromedriver.exe");
		  
		  WebDriver driver = new ChromeDriver();
		  driver.manage().window().maximize();                                     // maximize window 		  
		  driver.manage().deleteAllCookies();
		  
		  // To open url of site
        driver.get("https://testsigma.com/");                   
        Thread.sleep(3000);
        
        WebElement Resourse = driver.findElement(By.xpath("//li//*[text()='Resources']"));                  
        
                                      
                   //Admin--> user management--> Users
                   Actions act = new Actions(driver);
                              
                   act.moveToElement(Resourse).build().perform();          //shortcut
                                                   
                   Thread.sleep(3000);                  
                   driver.close();
      }
}