package BasicPrograms;

public class CalculatorUsingSwitch 
{
	public static void main(String args[]) 
	{            
		char operator = '*';	
		double N1= 30.5;
		double N2=90.0;
		double result;
		
		switch(operator)
		{		  
		case '+' : result= (N1 + N2);
			       System.out.println(result+ " is the answer "); 
			       break;
		case '-' : result= (N1 - N2);
			       System.out.println(result+ " is the answer ");
			       break;
		case '*' : result= (N1 * N2);
			       System.out.println(result+ " is the answer ");
			       break;
		case '/' : result= (N1 / N2);
			       System.out.println(result+ " is the answer ");
			       break;
		case '%' : result= (N1 % N2);
		           System.out.println(result+ " is the answer ");
			       break;
			       
			       default : System.out.println(" Invalid data ");
			       break;
		}
	}
}
