package Commands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitCommands 
{
	public static void main (String args []) 
	  {
		  System.setProperty("webdriver.chrome.driver", "R:\\Selenium\\Application\\ChromeDriver\\chromedriver.exe");
		  
	      WebDriver driver = new ChromeDriver();                        		  
	                driver.manage().window().maximize();                            // maximize window
	    
	                // driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
	                // driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	                
	                // ImplicitWait
	                // 1. is always applied globally
	                // 2. is available for all WebElements
	                // 3. is Dynamic in nature	                
	                // 4. it can be changed anywhere and at any time in your code
		            
	                driver.get("https://www.facebook.com/signup");                  // get method
		            
		            WebElement Firstname = driver.findElement(By.name("firstname"));		                      
		            WebElement Surname = driver.findElement(By.name("lastname"));
		            WebElement Mobilenum = driver.findElement(By.name("reg_email__"));                		                       
		            WebElement Password = driver.findElement(By.name("reg_passwd__"));
		          
		            sendKeys(driver, Firstname, 5, "Rohit");
		            sendKeys(driver, Surname, 5, "Ghorad");
		            sendKeys(driver, Mobilenum, 5, "8983895676");
		            sendKeys(driver, Password, 5, "asd123");
		            
		            WebElement Gender = driver.findElement(By.xpath("(//input[@type=\"radio\"])[2]"));	
		            clickOn(driver, Gender, 5);
   }
	   // ExplicitWait
	   // 1. no Explicit keyword or method
	   // 2. available with WebDriverWait with some ExpectedConditions (ie.. visibilityOf(element), ElementToBeClickable)
	   // 3. Specific to element
	   // 4. dynamic in nature
	   // 5. you should never use ImplicitWait & ExplicitWait together:
	   // ---because, Selenium WD will wait for the element first bcoz of ImplicitWait & then ExplicitWait will be applied
	   // hence, total sync wait will be increased for each element
	   public static void sendKeys(WebDriver driver, WebElement element, int timeout, String value)
	   {
   	   new WebDriverWait(driver,timeout)
   	   .until(ExpectedConditions.visibilityOf(element));
		   element.sendKeys(value);
	   }
	   
	   public static void clickOn(WebDriver driver, WebElement element, int timeout)
	   {
   	   new WebDriverWait(driver,timeout)
   	   .until(ExpectedConditions.elementToBeClickable(element));
		   element.click();
	   }
}
