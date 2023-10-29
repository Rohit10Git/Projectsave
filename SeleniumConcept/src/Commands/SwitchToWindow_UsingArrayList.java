package Commands;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToWindow_UsingArrayList 
{
	public static void main (String args []) throws InterruptedException
	  {
		  System.setProperty("webdriver.chrome.driver", "R:\\Selenium\\Application\\ChromeDriver\\chromedriver.exe");
		  
		  WebDriver driver = new ChromeDriver();
		  driver.manage().window().maximize();                                     // maximize window 
      
      driver.get("https://seleniumpractise.blogspot.com/2017/07/multiple-window-examples.html");                     
                
      Thread.sleep(3000);
      
      String parent = driver.getWindowHandle();                                  // To focus parent window
      System.out.println("Parent Window Id : " +parent);
      
   // select Link to open new window
      driver.findElement(By.xpath("(//a[@name=\"link1\"])[1]")).click();         // Google.com
      Thread.sleep(3000);
      
      driver.findElement(By.xpath("(//a[@name=\"link1\"])[2]")).click();         // Facebook.com
      Thread.sleep(3000);
      
      driver.findElement(By.xpath("(//a[@name=\"link1\"])[3]")).click();         // Yahoo.com
      Thread.sleep(3000);
      
      Set<String> allWindows = driver.getWindowHandles();                        // Set is Jawa.util class
      
      int count = allWindows.size();                                             // To count windows
      System.out.println("Total no. of Windows : " +count);
      Thread.sleep(3000);
   // converting set into ArrayList   
      ArrayList<String> tabs = new ArrayList<String>(allWindows);                      // ArrayList is Java.util class
   // But,You must know the tab no. of specific link
      
      driver.switchTo().window(tabs.get(1));
      System.out.println("Jumped to Yahoo");
      Thread.sleep(3000);
      driver.close();
      
      driver.switchTo().window(tabs.get(2));
      System.out.println("Jumped to Facebook");
      Thread.sleep(3000);
      driver.close();
      
      driver.switchTo().window(tabs.get(3));
      System.out.println("Jumped to Google");
      Thread.sleep(3000);
      driver.close();
      
      driver.switchTo().window(tabs.get(0));
      System.out.println("Jumped to parent");
      Thread.sleep(3000);
      driver.close();
}
}
