package Scrolling;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebPage 
{
	  public static void main (String args []) throws InterruptedException 
	  {
	          System.setProperty("webdriver.chrome.driver", "R:\\Selenium\\Application\\ChromeDriver\\chromedriver.exe");
	  
	         WebDriver driver = new ChromeDriver();
	         driver.manage().window().maximize();                                     // maximize window 		  
	         driver.manage().deleteAllCookies();
	  
	         driver.get("https://history.state.gov/countries/all");                                   
	          Thread.sleep(3000);
	      
	          JavascriptExecutor js = (JavascriptExecutor)driver;
	      
	          //1. Scrolling page by using pixel
	          js.executeScript("window.scrollBy(0,2000)", "");
	          System.out.println("Scrolled for value");
	          Thread.sleep(3000);
	          
	          //2. Scrolling page till we find element
	          WebElement Country = driver.findElement
	                         (By.xpath("//a[text()=\"Texas*\"]"));
	          System.out.println("Scrolled upto Texas");
	          js.executeScript("arguments[0].scrollIntoView();", Country);
	          Thread.sleep(3000);
	          
	          //3. Scrolling page till bottom
	          js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	          System.out.println("Scrolled to Bottom");
	          Thread.sleep(3000);
	          
	          driver.close();
	       }
}
