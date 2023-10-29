package Commands;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements 
{
	public static void main (String args []) throws InterruptedException
	  {
		  System.setProperty("webdriver.chrome.driver", "R:\\Selenium\\Application\\ChromeDriver\\chromedriver.exe");
		  
	      WebDriver driver = new ChromeDriver();                        		  
	                driver.manage().window().maximize();                                   // maximize window
	                
		            driver.get("http://omayo.blogspot.com/");                              // get method		            
		            Thread.sleep(3000);
		            
		            // List of buttons tagName available on web page 
		            List<WebElement> elements = driver.findElements(By.xpath("//button"));
		            
		            for (WebElement element : elements)
		            {
		            	System.out.println(element.getText());
		            }
		            
		            driver.close();
	  }
}
