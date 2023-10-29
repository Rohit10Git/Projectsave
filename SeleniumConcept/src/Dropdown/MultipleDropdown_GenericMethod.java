package Dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleDropdown_GenericMethod 
{
	public static void main (String args []) throws InterruptedException
	  {
		  System.setProperty("webdriver.chrome.driver", "R:\\Selenium\\Application\\ChromeDriver\\chromedriver.exe");
		  
		  WebDriver driver = new ChromeDriver();
		  driver.manage().window().maximize();                                     // maximize window 		  
		  driver.manage().deleteAllCookies();
		  
		  driver.get("https://www.facebook.com/signup");                                   
          Thread.sleep(3000);
         
          //Approach-02
          
          WebElement days = driver.findElement(By.id("day"));
          selectOption(days, "10");
          Thread.sleep(3000);
          
          WebElement months = driver.findElement(By.id("month"));
           selectOption(months, "Oct");
           Thread.sleep(3000);
          
           WebElement years = driver.findElement(By.id("year"));
            selectOption(years, "1991");
          
            driver.close();
	  }
	
	public static void selectOption(WebElement element, String value) throws InterruptedException 
	{
		 Select drop = new Select(element);
         
         List<WebElement> allOptions = drop.getOptions();                        //gets all options from list & store in allOptions
         
         for(WebElement option : allOptions)                                     // Iterate one by one
         {
       	     if(option.getText().equals(value))                                     //Condition applied here
       	     {
       	       option.click();                                                      // if condition matches then it hits click
       	       Thread.sleep(3000);
       	       break;      	  
       	     }
	     }
      }
}