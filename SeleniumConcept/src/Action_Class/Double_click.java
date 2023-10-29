package Action_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Double_click 
{
	public static void main (String args []) throws InterruptedException
	  {
		  System.setProperty("webdriver.chrome.driver", "R:\\Selenium\\Application\\ChromeDriver\\chromedriver.exe");
		  
		  WebDriver driver = new ChromeDriver();
		  driver.manage().window().maximize();                                     // maximize window 		  
		  driver.manage().deleteAllCookies();
		  
		  // To open url of site
       driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick3");                   
       Thread.sleep(3000);
       
       driver.switchTo().frame("iframeResult");
       
       WebElement button = driver.findElement(By.xpath("//button[text()='Copy Text']"));  
       
       Actions act = new Actions(driver);
       
       // using context click to perform Right click action
       act.doubleClick(button).build().perform();                     // build creacte act & perf. complete act
       
       driver.quit();
    }
}
