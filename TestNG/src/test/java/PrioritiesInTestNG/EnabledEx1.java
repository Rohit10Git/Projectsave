package PrioritiesInTestNG;

import org.testng.annotations.Test;
// Run through xml file name : EnabledTestNG
 
public class EnabledEx1 
{
	@Test 
	public void def()
	{
		System.out.println("DEF method");
	}
	
	@Test 
	public void abc()
	{
		System.out.println("ABC method");
	}
	
	@Test (priority = 1)
	public void mno()
	{
		System.out.println("MNO method");
	}
	
	@Test
	public void pqr()
	{
		System.out.println("PQR method");
	}
}
