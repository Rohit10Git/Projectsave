package PrioritiesInTestNG;

import org.testng.annotations.Test;

public class PriorityEx3                            // Negative values
{
	@Test (priority=300)
	public void def()
	{
		System.out.println("DEF method");
	}
	
	@Test (priority=-10)
	public void abc()
	{
		System.out.println("ABC method");
	}
	
	@Test (priority=-5)
	public void mno()
	{
		System.out.println("MNO method");
	}
	
	@Test (priority=0)
	public void pqr()
	{
		System.out.println("PQR method");
	}
	
	@Test (priority=99)
	public void xyz()
	{
		System.out.println("XYZ method");
	}
}
