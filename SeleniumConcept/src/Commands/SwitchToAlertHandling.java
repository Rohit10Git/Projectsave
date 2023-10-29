package Commands;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToAlertHandling 
{
	public static void main (String args []) throws InterruptedException
	  {
		  System.setProperty("webdriver.chrome.driver", "R:\\Selenium\\Application\\ChromeDriver\\chromedriver.exe");
		  
	      WebDriver driver = new ChromeDriver();                        		  
	                driver.manage().window().maximize();                                   // maximize window
	                
		            driver.get("http://omayo.blogspot.com/");                              // get method
		            
		            Thread.sleep(3000);
		            
		            // Select button to open Alert Pop up
		            driver.findElement(By.xpath("(//input[@type=\"button\"])[4]")).click();
		                     
    Alert alertbox = driver.switchTo().alert();              // Created local variable of alert box by mouse over (switchTo.alert())
    Thread.sleep(3000);
    System.out.println(alertbox.getText());
    alertbox.accept();                                       // To click "OK" button on Alert 
 // alert.dismiss();                                            To click "Cancel" button on alert
 // alert.sendKeys("Text");                                     To send value on alert box
    Thread.sleep(3000);
    
                 driver.close();
}
}
