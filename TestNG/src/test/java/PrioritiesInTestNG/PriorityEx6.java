package PrioritiesInTestNG;

import org.testng.annotations.Test;

public class PriorityEx6                                 // With Priority
{
	@Test (priority=3)
	public void def()
	{
		System.out.println("DEF method");
	}
	
	@Test (priority=4)
	public void abc()
	{
		System.out.println("ABC method");
	}
	
	@Test (priority=2)
	public void mno()
	{
		System.out.println("MNO method");
	}
	
	@Test (priority=1)
	public void pqr()
	{
		System.out.println("PQR method");
	}
	
	@Test (priority=0)
	public void xyz()
	{
		System.out.println("XYZ method");
	}
}
