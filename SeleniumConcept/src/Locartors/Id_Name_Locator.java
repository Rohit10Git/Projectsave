package Locartors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Id_Name_Locator 
{
	public static void main (String args []) throws InterruptedException 
	  {
		  System.setProperty("webdriver.chrome.driver", "R:\\Selenium\\Application\\ChromeDriver\\chromedriver.exe");
		  
		  WebDriver driver = new ChromeDriver();
		  driver.manage().window().maximize();                                     // maximize window 
  
        driver.get("https://www.facebook.com/reg/"); 
        System.out.println("Facebook opened");
        Thread.sleep(3000);
        
        driver.findElement(By.name("firstname")).sendKeys("Rohit");
        System.out.println("Firstname entered");
        Thread.sleep(3000);
        
        driver.findElement(By.id("password_step_input")).sendKeys("abc123");
        System.out.println("Password entered");
        Thread.sleep(3000);
        
        driver.close();
    }
}
