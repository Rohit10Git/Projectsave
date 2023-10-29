package Action_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Right_Click 
{
	public static void main (String args []) throws InterruptedException
	  {
		  System.setProperty("webdriver.chrome.driver", "R:\\Selenium\\Application\\ChromeDriver\\chromedriver.exe");
		  
		  WebDriver driver = new ChromeDriver();
		  driver.manage().window().maximize();                                     // maximize window 		  
		  driver.manage().deleteAllCookies();
		  
		  // To open url of site
         driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");                   
         Thread.sleep(3000);
         
         WebElement button = driver.findElement(By.xpath("//span[text()='right click me']"));  
         
         Actions act = new Actions(driver);
         
         // using context click to perform Right click action
         act.contextClick(button).build().perform();                     // build creacte act & perf. complete act
      }
}