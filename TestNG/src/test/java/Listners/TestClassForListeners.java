package Listners;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners (ITestListenerClass.class)                                     // in case 2 classes use array    @Listeners ({Class1, Class2})
public class TestClassForListeners 
{
		//Listeners accept the values in the form of class array
		@Test
	  public void testMethod1() 
	  {
		  System.out.println("i'm inside testMethod1"); 
	  }
		
		@Test
	  public void testMethod2() 
	  {
		  System.out.println("i'm inside testMethod2"); 
		  Assert.assertTrue(false);
	  }
		
		@Test(timeOut = 1000)
	  public void testMethod3() throws Exception 
	  {
		  Thread.sleep(2000);
		  System.out.println("i'm inside testMethod3"); 	  
	  }
		
		@Test (dependsOnMethods = "testMethod3")
	  public void testMethod4() 
	  {
		  System.out.println("i'm inside testMethod4"); 
	  }				
}
