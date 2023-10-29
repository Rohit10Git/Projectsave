package ScreenshotsForFailed_Listen;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class ITestListenerClass extends BaseTest implements ITestListener                                              // using listeners
{
	public void onTestFailure(ITestResult result) 
	{
		captureScreenshot(result.getTestContext().getName()+ "_" +result.getName()+".jpg");
	}
  
}

 

