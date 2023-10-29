package Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleDropdown_WithSelect 
{
	public static void main (String args []) throws InterruptedException
	  {
		  System.setProperty("webdriver.chrome.driver", "R:\\Selenium\\Application\\ChromeDriver\\chromedriver.exe");
		  
		  WebDriver driver = new ChromeDriver();
		  driver.manage().window().maximize();                                     // maximize window 		  
		  driver.manage().deleteAllCookies();
		  
		  driver.get("https://www.facebook.com/signup");                                   
          Thread.sleep(3000);
          
          //Approach-01
          
          Select days = new Select(driver.findElement(By.id("day")));
                 days.selectByValue("10");
                 
          Select months = new Select(driver.findElement(By.id("month")));
                 months.selectByIndex(9);
                 
          Select years = new Select(driver.findElement(By.id("year")));
                 years.selectByVisibleText("1991");
                 
                 driver.close();
      }
}