package BasicPrograms;

public class CountNoOfDigits 
{
    public static void main(String args[])                       // Main Method
    {	
		int A= 16839546;
		int count= 0;
		
		while(A!=0)
		{
			A= A/10;
			count++;
		}
		   System.out.println(" There are " +count+ " digits in a number ");
	}
}
