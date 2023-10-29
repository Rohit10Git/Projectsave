package Handling;                    // NavinAuto Fox

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks 
{
	public static void main (String args []) throws InterruptedException, IOException 
	  {
		  System.setProperty("webdriver.chrome.driver", "R:\\Selenium\\Application\\ChromeDriver\\chromedriver.exe");
		  
		  WebDriver driver = new ChromeDriver();
		  driver.manage().window().maximize();                                     // maximize window 

		  //implicit wait for 10 seconds
		  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		  
        driver.get("https://tutorialsninja.com/demo/");                                   
        Thread.sleep(3000);        
        
        //Count links from a web-page
        List<WebElement> links = driver.findElements(By.tagName("a")); 
        System.out.println(links.size());
        
        for(int i=0;i<links.size();i++)
        {
      	  //by using href attribute we can get url of required link
      	  WebElement element = links.get(i);
      	  String url = element.getAttribute("href");
      	  
      	  if(url==null || url.isEmpty())
      	  {
      		  System.out.println("URL is empty.");
      		  
      		  continue;
      	  }
      	  URL link = new URL(url);
      	  
      	  //create connection using URL object 'link'
      	  HttpURLConnection httpConn = (HttpURLConnection) link.openConnection(); 
      	  Thread.sleep(3000);
      	  
      	  //establish connection
      	  httpConn.connect();
      	  
      	  int resCode = httpConn.getResponseCode();  //returns response code. if res code is above 400; broken link
      	  
      	  if(resCode>=400)
      	  {
      		  System.out.println(url +" - "+ "is broken link");
      	  }
      	  else
      	  {
      		  System.out.println(url +" - "+ "is valid link");
      	  }
        }
        
        driver.close();
    }
}
