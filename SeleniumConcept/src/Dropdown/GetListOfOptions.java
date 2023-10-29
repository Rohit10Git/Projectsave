package Dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetListOfOptions 
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
      
      List<WebElement> allOptions = Month.getOptions();                       //gets all options from list & store in allOptions
      
      for(int i=0; i<allOptions.size(); i++)
      	System.out.println(allOptions.get(i).getText());
      
      driver.close();
   }     
}
