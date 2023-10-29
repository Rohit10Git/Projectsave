package Cookies;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_cookies_Size_Name_Value 
{
	public static void main (String args []) throws InterruptedException
	  {
		  System.setProperty("webdriver.chrome.driver", "R:\\Selenium\\Application\\ChromeDriver\\chromedriver.exe");
		  
		  WebDriver driver = new ChromeDriver();
		  driver.manage().window().maximize();                                     // maximize window 		  
		  
        driver.get("https://www.flipkart.com/");                                   
        Thread.sleep(3000);
        
        Set<Cookie> cookies = driver.manage().getCookies();                     // return list of all cookies
        System.out.println("Size of cookie : "+ cookies.size());                // return size of cookies
        
        for(Cookie cookie : cookies)
        {
      	  System.out.println(cookie.getName()+ ":" +cookie.getValue());      //Prints name & value of each cookie
        }
        
        System.out.println(driver.manage().getCookieNamed("Network-Type"));    //return cookie by name include Path; Domain
        
        driver.close();
    }
}
