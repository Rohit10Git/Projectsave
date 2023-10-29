package PrioritiesInTestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DependsOnMethod 
{
	@Test (timeOut = 3000)
    public void aChrome()
    {
		String k1 = "webdriver.chrome.driver";
		String path = "R:\\Selenium\\Application\\ChromeDriver\\chromedriver.exe";
   
		System.setProperty(k1,path);
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/signup");
		driver.close();
    }
	
	@Test
	public void abc()
	{
		System.out.println("ABC Method");
	}
	
	@Test (dependsOnMethods = {"aChrome"})
	public void mno()
	{
		System.out.println("MNO Method");
	}
}
