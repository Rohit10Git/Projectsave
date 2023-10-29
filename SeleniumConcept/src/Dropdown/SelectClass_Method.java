package Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClass_Method 
{
	public static void main (String args []) throws InterruptedException
	  {
		  System.setProperty("webdriver.chrome.driver", "R:\\Selenium\\Application\\ChromeDriver\\chromedriver.exe");
		  
		  WebDriver driver = new ChromeDriver();
		  driver.manage().window().maximize();                                     // maximize window 		  
		  driver.manage().deleteAllCookies();
		  
		  driver.get("https://www.facebook.com/signup");                                   
          Thread.sleep(3000);
          
          WebElement dropDownMonth = driver.findElement(By.id("month"));
          
          Select Month = new Select(dropDownMonth);
          
          Month.selectByIndex(9);                                               //select Oct month index starts from 0 always
          System.out.println("Month selected : Oct");
          Thread.sleep(3000);
          
          Month.selectByValue("8");                                             //select Aug month
          System.out.println("Month selected : Aug");
          Thread.sleep(3000);
          
          Month.selectByVisibleText("Feb");                                     //select Feb month
          System.out.println("Month selected : Feb");
          Thread.sleep(3000);
          
          driver.close();
      }
}