package BasicPrograms;

public class LcmOfTwoNumbers 
{
     public static void main(String args[])                 // Main Method
     {	
	    	int R= 45;
		    int S= 78;
	     	int gcd= 1;
		
		for(int i=1; i<=R&&i<=S; ++i)
		{
			if(R%i==0&&S%i==0)
				gcd=i;
		}
		
		int lcm= (R*S)/gcd;
		
		System.out.println("The LCM of R and S is : " +lcm);
	}
}
