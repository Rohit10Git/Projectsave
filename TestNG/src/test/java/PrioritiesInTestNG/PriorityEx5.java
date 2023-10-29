package PrioritiesInTestNG;

import org.testng.annotations.Test;

public class PriorityEx5                            // Without Priority
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
	
	@Test 
	public void mno()
	{
		System.out.println("MNO method");
	}
	
	@Test 
	public void pqr()
	{
		System.out.println("PQR method");
	}
	
	@Test 
	public void xyz()
	{
		System.out.println("XYZ method");
	}
}
