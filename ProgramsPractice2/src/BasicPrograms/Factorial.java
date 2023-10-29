package BasicPrograms;

public class Factorial 
{
	public static void main(String args[])                      // Main Method
	{	
		 int fact= 1;
		 int N=8;
		 
		 for(int i=1; i<=N; i++) 
		 {		 
	     	   fact= fact*i;
		 }
			System.out.println(" Factorial of " +N+ " is : " +fact);
	}
}
