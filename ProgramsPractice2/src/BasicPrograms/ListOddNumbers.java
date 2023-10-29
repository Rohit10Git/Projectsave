package BasicPrograms;

public class ListOddNumbers 
{
	public static void main(String[] args) 
	{
		int limit = 50;
		
		System.out.println("Printing odd numbers between 1 and " +limit);
		
		for(int i=1; i<= limit; i++)
		{
			if(i % 2 != 0)                                   // If number is not divisible by 2 it is odd number
			{
				System.out.print(i + " ");
			}
		}
	}
}
