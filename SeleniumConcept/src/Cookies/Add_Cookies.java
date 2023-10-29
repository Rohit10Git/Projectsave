package Cookies;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Add_Cookies 
{
	public static void main (String args []) throws InterruptedException
	  {
		  System.setProperty("webdriver.chrome.driver", "R:\\Selenium\\Application\\ChromeDriver\\chromedriver.exe");
		  
		  WebDriver driver = new ChromeDriver();
		  driver.manage().window().maximize();                                     // maximize window 		  
		  
       driver.get("https://www.flipkart.com/");                                   
       Thread.sleep(3000);
       
       Set<Cookie> cookies = driver.manage().getCookies();                    
       System.out.println("Size of cookie : "+ cookies.size());                // return size of cookies
       
       Cookie cobj = new Cookie("My-New-Cookie","121212");                     // add cookie by name & value
       driver.manage().addCookie(cobj);
       
       cookies = driver.manage().getCookies();
       System.out.println("Size of cookie : "+ cookies.size());
       
       driver.manage().getCookieNamed("gpv_pn_t");                               //return cookie by name
       
       for(Cookie cookie : cookies)                                              // return list of all cookies
       {
     	  System.out.println(cookie.getName()+ ":" +cookie.getValue()); 
       }
                                        
       driver.close();
    }
}
