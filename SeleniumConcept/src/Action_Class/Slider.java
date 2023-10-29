package Action_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Slider 
{
	public static void main(String args[]) throws InterruptedException
	{
		 System.setProperty("webdriver.chrome.driver", "R:\\Selenium\\Application\\ChromeDriver\\chromedriver.exe");
		 
		 WebDriver driver = new ChromeDriver();                      
              
		           driver.manage().window().maximize();
                   driver.manage().deleteAllCookies();
                   
                   // To open url of site
                   driver.get("https://jqueryui.com/slider/");                   
                   Thread.sleep(3000);
                   
                   driver.switchTo().frame(0);
                   
                   WebElement Slider = driver.findElement(By.xpath("//body/div[@id='slider']/span[1]"));
                   Thread.sleep(3000);
                   
                   Actions act = new Actions(driver);
                   
                   //Move the slider based on value--> 300 right horizontally
                   act.moveToElement(Slider).dragAndDropBy(Slider, 300, 0).build().perform();
                   Thread.sleep(3000);
                   
                   driver.close();
  }
}
