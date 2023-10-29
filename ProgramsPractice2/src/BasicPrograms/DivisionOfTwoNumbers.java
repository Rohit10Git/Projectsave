package BasicPrograms;

public class DivisionOfTwoNumbers 
{
	public void division(int a, int b)            //Non-Static method
	{
		int c;
		      c= a/b;
		    
		    System.out.println("The Division of two numbers is = " +c);
	}
	
	public static void main(String args[])                                      //Main method
	{
		DivisionOfTwoNumbers RRR= new DivisionOfTwoNumbers();                      //Calling Non-Static method
		RRR.division(50,3);
	}
}
