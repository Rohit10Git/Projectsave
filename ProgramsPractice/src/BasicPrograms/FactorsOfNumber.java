package BasicPrograms;

public class FactorsOfNumber 
{
     public static void main(String args[])                        // Main Method 
     {	
	    	int number= 100;
		
		for(int i=1;i<=number;++i)
		{
			if(number %i== 0)
			{
				System.out.println(i+ " is a factor of Number.");
			}
		}
	}
}
