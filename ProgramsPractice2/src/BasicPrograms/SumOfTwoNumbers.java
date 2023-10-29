package BasicPrograms;

public class SumOfTwoNumbers 
{
	    public static void sum(int a, int b)                          //Static method
	   {
		    int c;
			c= a+b;
			
	        System.out.println("The Sum of two numbers is =" +c);
    	}
	
	public static void main(String args[])                                   //Main method
	{
		SumOfTwoNumbers.sum(74,36); 
	}
}
