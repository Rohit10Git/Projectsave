package ScreenshotsForFailed_Listen;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestClass extends BaseTest
{
	@Test(testName = "testYoutube")
	public void testYoutube() throws Exception 
	{
		driver.get("https://www.google.co.in/");
		driver.findElement(By.name("q")).sendKeys("Youtube", Keys.ENTER);
		System.out.println(driver.getTitle());	
		Thread.sleep(3000);
	}
	
	@Test(testName = "testFacebook")
	public void testFacebook() throws Exception 
	{
		driver.get("https://www.facebook.com/login/");	         	           
		System.out.println(driver.getTitle());	
		Thread.sleep(3000);
	}
	
	@Test(testName = "testLogin") 
	public void testLogin() throws Exception
	{		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		Thread.sleep(3000);
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin1234");
		driver.findElement(By.id("btnLogin")).click();
		Assert.assertTrue(driver.findElement(By.id("welcome")).isDisplayed());			
	}
}
