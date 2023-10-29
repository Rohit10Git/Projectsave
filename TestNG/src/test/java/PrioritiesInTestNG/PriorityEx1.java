package PrioritiesInTestNG;

import org.testng.annotations.Test;

public class PriorityEx1 
{
	@Test (priority=300)
	public void def()
	{
		System.out.println("DEF method");
	}
	
	@Test (priority=1)
	public void abc()
	{
		System.out.println("ABC method");
	}
	
	@Test (priority=1)
	public void mno()
	{
		System.out.println("MNO method");
	}
	
	@Test (priority=0)
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
