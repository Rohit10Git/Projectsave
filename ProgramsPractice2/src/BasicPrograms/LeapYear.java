package BasicPrograms;

public class LeapYear 
{
	public void main(int year)                                // Non-Static Method
	{
	  if(year%4== 0)                                        // If year is divisible by 4 is a leap year
	  {
		  System.out.println(year+ " is a Leap year ");
	  }
	  else
	  {
		  System.out.println(year+ " is not a Leap year ");
	  }
	}
	
	public static void main(String args[]) {                       // Main Method 
		
		LeapYear RRR= new LeapYear();
		RRR.main(2020);
		RRR.main(2021);		
	}
}
