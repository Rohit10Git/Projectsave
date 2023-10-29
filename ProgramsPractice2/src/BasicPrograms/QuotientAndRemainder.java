package BasicPrograms;

public class QuotientAndRemainder 
{
	public static void methodName(int K, int E)              // Static Method
    {
	   int Q = K/E;
	   int R = K%E;
    
	   System.out.println("The Quotient is = " +Q);
	   System.out.println("The Remainder is = " +R);
    }
	
	public static void main(String args[])                     // Main Method
	 {
		QuotientAndRemainder.methodName(200,25);               // Calling Static Method
		QuotientAndRemainder.methodName(20,10);
	 }
}
