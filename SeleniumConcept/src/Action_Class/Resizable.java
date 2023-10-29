package Action_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Resizable 
{
	public static void main(String args[]) throws InterruptedException
	{
		 System.setProperty("webdriver.chrome.driver", "R:\\Selenium\\Application\\ChromeDriver\\chromedriver.exe");
		 
		 WebDriver driver = new ChromeDriver();                      
              
		           driver.manage().window().maximize();
                   driver.manage().deleteAllCookies();
                   
                   // To open url of site
                   driver.get("https://jqueryui.com/resizable/");                   
                   Thread.sleep(3000);
                   
                   driver.switchTo().frame(0);
                   
                   WebElement Resize = driver.findElement(By.xpath("//body/div[@id='resizable']/div[3]"));
                   
                   Actions act = new Actions(driver);
                   
                   act.moveToElement(Resize).dragAndDropBy(Resize, 100, 150).build().perform();
                   Thread.sleep(3000);
                   
                   driver.close();
     }
}