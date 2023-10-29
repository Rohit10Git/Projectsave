package Reports_Generate;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AddSysEnvToReport 
{
	public static void main(String args[])
	{
		WebDriverManager.chromedriver().setup();		
		WebDriver driver = new ChromeDriver();

		//		RemoteWebDriver rwd = (RemoteWebDriver)driver;
		//		Capabilities Capabilities = rwd.getCapabilities();
		
		Capabilities capabilities = ((RemoteWebDriver) driver).getCapabilities();
		System.out.println(capabilities.getBrowserName());     //get browser name
		System.out.println(capabilities.getVersion());         //get browser version
		
		System.getProperties().list(System.out);         //get all properties with OS/JAVA version
		
		System.out.println("OS" + System.getProperty("os.name"));   //get OS name
		System.out.println("Java" + System.getProperty("java.version"));  //get Java version
		
		driver.quit();
	}
}
