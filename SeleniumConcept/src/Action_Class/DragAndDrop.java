package Action_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop 
{
	public static void main (String args []) throws InterruptedException
	  {
		  System.setProperty("webdriver.chrome.driver", "R:\\Selenium\\Application\\ChromeDriver\\chromedriver.exe");
		  
		  WebDriver driver = new ChromeDriver();
		  driver.manage().window().maximize();                                     // maximize window 		  
		  driver.manage().deleteAllCookies();
		  
		   // To open url of site
          driver.get("http://dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");                   
          Thread.sleep(3000);
          
          Actions act = new Actions(driver);
          
          WebElement oslo = driver.findElement(By.xpath("//div[@id=\"box1\"]"));
          WebElement Seoul = driver.findElement(By.xpath("//div[@id=\"box5\"]"));
          WebElement spain = driver.findElement(By.xpath("//div[@id=\"box107\"]"));
          WebElement sweden = driver.findElement(By.xpath("//div[@id=\"box102\"]"));
          Thread.sleep(3000);
          
          //Method 1
          act.dragAndDrop(oslo, spain).build().perform();
          Thread.sleep(5000);
          
          //Method 2
          act.clickAndHold(Seoul).moveToElement(sweden).release().build().perform();                
          Thread.sleep(3000);
          
          driver.close();
	  }	  
}
