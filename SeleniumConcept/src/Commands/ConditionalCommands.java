package Commands;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConditionalCommands 
{
	public static void main (String args []) throws InterruptedException
	  {
		  System.setProperty("webdriver.chrome.driver", "R:\\Selenium\\Application\\ChromeDriver\\chromedriver.exe");
		  
	      WebDriver driver = new ChromeDriver();                        
		  
	                driver.manage().window().maximize();                            // maximize window
	                driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	                
		            driver.get("https://www.facebook.com/signup");                  // get method
		            
		            WebElement Firstname = driver.findElement(By.xpath("(//input[@class=\"inputtext _58mg _5dba _2ph-\"])[1]"));
		            		            	            
		            if (Firstname.isDisplayed() && Firstname.isEnabled())
		            {
		            	Firstname.sendKeys("Rohit");
		            }
		            Thread.sleep(3000);
		            
		            WebElement Surname = driver.findElement(By.xpath("(//input[@class=\"inputtext _58mg _5dba _2ph-\"])[2]"));
		            				            
		            if (Surname.isDisplayed() && Surname.isEnabled())
		            {
		            	Surname.sendKeys("Ghorad");
		            }
		            Thread.sleep(3000);
		            
		            System.out.println(driver.findElement(By.xpath("(//input[@class=\"_8esa\"])[1]")).isSelected());            // Female
		            				            			            
		            System.out.println(driver.findElement(By.xpath("(//input[@class=\"_8esa\"])[2]")).isSelected()==false);     // Male
		            				            				            
		            driver.findElement(By.xpath("(//input[@class=\"_8esa\"])[2]")).click();
		                   		                   
		            Thread.sleep(3000);
		            
		            driver.close();
}
}
