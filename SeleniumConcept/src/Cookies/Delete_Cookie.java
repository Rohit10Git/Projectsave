package Cookies;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Delete_Cookie 
{
	public static void main (String args []) throws InterruptedException
	  {
		  System.setProperty("webdriver.chrome.driver", "R:\\Selenium\\Application\\ChromeDriver\\chromedriver.exe");
		  
		  WebDriver driver = new ChromeDriver();
		  driver.manage().window().maximize();                                     // maximize window 		  
		  
       driver.get("https://www.flipkart.com/");                                   
       Thread.sleep(3000);
     
       Set<Cookie> cookies = driver.manage().getCookies(); 
       System.out.println("Size of cookie : "+ cookies.size());
       
       for(Cookie cookie : cookies)                                              // return list of all cookies
       {
     	  System.out.println(cookie.getName()+ ":" +cookie.getValue()); 
       }
       
       driver.manage().deleteAllCookies();                                      // delete all the cookies
       cookies = driver.manage().getCookies();
       System.out.println("Size of cookie : "+ cookies.size());
       
       Cookie cobj = new Cookie("My-New-Cookie","121212");                     // add cookie by name & value
       driver.manage().addCookie(cobj);
       
       cookies = driver.manage().getCookies();
       System.out.println("Size of cookie : "+ cookies.size());
       
       for(Cookie cookie : cookies)                                              // return list of all cookies
       {
     	  System.out.println(cookie.getName()+ ":" +cookie.getValue()); 
       }
       
  /*   driver.manage().deleteCookieNamed("My-New-Cookie");                      // delete cookie by name
       cookies = driver.manage().getCookies();
       System.out.println("Size of cookie : "+ cookies.size());   */
       
       driver.manage().deleteCookie(cobj);                                      // delete cookie by arg
       cookies = driver.manage().getCookies();
       System.out.println("Size of cookie : "+ cookies.size());
       
       driver.close();
    }
}
