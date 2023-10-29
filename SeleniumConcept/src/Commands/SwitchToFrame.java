package Commands;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToFrame 
{
	public static void main(String args[]) throws InterruptedException
	{
		 System.setProperty("webdriver.chrome.driver", "R:\\Selenium\\Application\\ChromeDriver\\chromedriver.exe");
		 
		 WebDriver driver = new ChromeDriver();                      
              
		           driver.manage().window().maximize();
                   driver.manage().deleteAllCookies();
                   
                   // To open url of site
                   driver.get("https://www.globalsqa.com/demo-site/frames-and-windows/");                   
                   Thread.sleep(3000);
                   
                   WebElement button = driver.findElement(By.xpath("//*[@aria-labelledby='tab_item-0']//a[text()='Click Here']"));               // use framexpath to find element
                   button.click();
                 
                   Thread.sleep(3000);
                   
                   WebElement tab2= driver.findElement(By.xpath(" //*[@class='newtabs horizontal']//ul//li[text()='Open New Window'] "));               // use framexpath to find element
                   tab2.click();

                   Thread.sleep(3000);

                   WebElement button1= driver.findElement(By.xpath("//*[@aria-labelledby='tab_item-1']//a[text()='Click Here']"));               // use framexpath to find element
                   button1.click();
                   
                   Thread.sleep(3000);    
                   
                   Set<String> windowsId = driver.getWindowHandles();
                   int a = windowsId.size();
                   String [] Id = new String [a]; 
                   
                   int i= 0;
                   
                   for(String s : windowsId)
                   {
                		   Id[i] =s;
                		   i++;
                		   System.out.println("window no "+i+"   "+s);
                   } 
                    
                   System.out.println("ParentWindow : " +driver.getTitle());
                   
                   driver.switchTo().window(Id[2]);                               // Switches to 2nd child window             
                   System.out.println(("Childwindow 3: " +Id[2]));
                   Thread.sleep(3000);
                  
                   driver.switchTo().window(Id[1]);                               // Switches to 2nd child window             
                   System.out.println(("Childwindow 2: " +Id[1]));
                   Thread.sleep(3000);
                   
                   WebElement frame = driver.findElement(By.xpath("//li[text()='iFrame']"));               // use frame_xpath to find element
                                       frame.click();                       
                    
                   Thread.sleep(3000);
                   
                   System.out.println("iframe is opened");
                                     
                   driver.switchTo().defaultContent();
                   System.out.println("Parent : " +driver.getTitle());
                   Thread.sleep(3000);
                  
                   driver.quit();        
              }    
}