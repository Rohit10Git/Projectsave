package Commands;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToWindow_Get_Id_Count 
{
	public static void main (String args []) throws InterruptedException
	  {
		  System.setProperty("webdriver.chrome.driver", "R:\\Selenium\\Application\\ChromeDriver\\chromedriver.exe");
		  
		  WebDriver driver = new ChromeDriver();
		  driver.manage().window().maximize();                                   // maximize window
        
        driver.get("https://seleniumpractise.blogspot.com/2017/07/multiple-window-examples.html");                              // get method
                  
        Thread.sleep(3000);
        
        String parent = driver.getWindowHandle();                              // To focus parent window
        System.out.println("Parent Window Id : " +parent);
        
        // select Button to open new window
        driver.findElement(By.xpath("(//a[@name=\"link1\"])[1]")).click();         
        Thread.sleep(3000);
        
        driver.findElement(By.xpath("(//a[@name=\"link1\"])[2]")).click();
        Thread.sleep(3000);
        
        driver.findElement(By.xpath("(//a[@name=\"link1\"])[3]")).click();
        Thread.sleep(3000);
        
        Set<String> allWindows = driver.getWindowHandles();                    // Set is Jawa.util class
        
        int count = allWindows.size();                                         // To count windows
        System.out.println("Total no. of Windows : " +count);
        
        for(String child:allWindows)                                          // To get Id of child window
        {
      	  if(!parent.equalsIgnoreCase(child))                               // if parent not equals child
      	  {
      		driver.switchTo().window(child);                                // Then switch to child window
      		Thread.sleep(3000);
      	    System.out.println("child Window Id : " +child);
      	    
      	    driver.close();
      	  }
        }
        
              driver.switchTo().window(parent);
              System.out.println("Parent Window Title : " +driver.getTitle());
              Thread.sleep(3000);
              driver.close();
    }
}
