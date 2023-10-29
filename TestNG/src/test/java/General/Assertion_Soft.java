package General;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assertion_Soft 
{
	@Test
	public void TestFacebook() throws Exception 
	{
		WebDriverManager.chromedriver().setup(); 

		WebDriver driver = new ChromeDriver();
		          driver.manage().window().maximize();
		          driver.get("https://www.facebook.com/login/");
		String expectedTitle = "Log in to Facebook";
		String actualTitle = driver.getTitle();
		assertEquals(actualTitle, expectedTitle, "Title is mismatched");   	                      //Hard Assertion          
		Thread.sleep(3000);
		          driver.close();		          		        
	}
	
	@Test
	public void TestYoutube() throws Exception 
	{
       WebDriver driver = new ChromeDriver();	
	             driver.manage().window().maximize();
                 driver.get("https://www.facebook.com/login/");
                 driver.findElement(By.id("email")).sendKeys("Youtube", Keys.ENTER);
                 Thread.sleep(5000);
                
                 SoftAssert sa = new SoftAssert(); 
                 
                 // Title assertion
                 String actualTitle = driver.getTitle(); 
                 String expectedTitle = "Log in to Facebook";                              
                 sa.assertEquals(actualTitle, expectedTitle, "Title is mismatched"); 
                 Thread.sleep(3000);	
             
                 // URL assertion
                 String actualUrl = driver.getCurrentUrl();
                 String expectedUrl = "https://www.facebook.com/login/";                      
                 sa.assertNotEquals(actualUrl  , expectedUrl , "Url is mismatched");  
                 Thread.sleep(3000);	
                
                 // Text assertion
                 String actualText= driver.findElement(By.id("email")).getAttribute("Value");
                 String expectedText= "";                
                 sa.assertEquals(actualText  , expectedText, "Text is mismatched"); 
                 Thread.sleep(3000);	
                 
                 // Border assertion
                 String actualBorder= driver.findElement(By.id("email")).getCssValue("border");
                 String expectedBorder= "1px solid rgb(204, 208, 213)";                                               // error line
                 sa.assertEquals(actualBorder , expectedBorder, "Border is mismatched"); 
                 Thread.sleep(3000);	
            
                 // ErrorMessage assertion
                 String actualerrorMessage= driver.findElement(By.xpath("//div[@id=\"email_container\"]//div[2]")).getText();
                 String expectederrorMessage= "The email address or mobile number you entered isn't connected to an account. Find your account and log in.";                
                 sa.assertEquals(actualerrorMessage , expectederrorMessage, "ErrorMessage is mismatched"); 
               
                 Thread.sleep(3000);	
                 driver.close();
                 sa.assertAll();
    }
}
