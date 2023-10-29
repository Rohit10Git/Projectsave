package Locartors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Relative_Xpath 
{
	public static void main (String args []) throws InterruptedException
	{
		  System.setProperty("webdriver.chrome.driver", "R:\\Selenium\\Application\\ChromeDriver\\chromedriver.exe");
		  
	      WebDriver driver = new ChromeDriver();                        		  
	                        driver.manage().window().maximize();                                   // maximize window
	                
	                        driver.get("http://omayo.blogspot.com/");                              // get method
		            
		                    Thread.sleep(3000);
		                    
		                    driver.findElement(By.xpath("//option[3]"));
		                    System.out.println("Xpath by Index");
		                    
		                    Thread.sleep(3000);
		                    
		                    // Xpath select node on the basis of attributes like Id, Name, ClassName
		                    WebElement Username= driver.findElement(By.xpath("//input[@type=\"text\"][1]"));
		                                        Username.sendKeys("Rohit");
		                    System.out.println("Xpath by Attribute");
		                    
		                    Thread.sleep(3000);
		                    
		                    // Element to be located should be in string form
		                    driver.findElement(By.xpath("//a[text()=\"Page One\"]"));
		                    System.out.println("Xpath by Text Function");
		                    
		                    Thread.sleep(3000);
		                    
		                    // Used when the value of any attribute changes dynamically
		                    WebElement Password = driver.findElement(By.xpath("//input[contains(@name, 'pswrd')]"));
		                                        Password.sendKeys("Password");
		                    System.out.println("Xpath by Contains");
		                    
		                    Thread.sleep(3000);
		                    driver.close();
		                    
     }
}