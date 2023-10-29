package PrioritiesInTestNG;

import org.testng.annotations.Test;

public class InvocationCount 
{
	 @Test (priority = 1, invocationCount = 3)  
	  public void xyz()
	  {
	    System.out.println("XYZ method");
	  }
	  
	  @Test  
	  public void abc()
	  {
	    System.out.println("ABC method");
	  }
	  
	  @Test (priority = 0)  
	  public void mno()
	  {
	    System.out.println("MNO method");
	  }
	  
	  @Test (priority = 2)  
	  public void pqr()
	  {
	    System.out.println("PQR method");
	  }
}
