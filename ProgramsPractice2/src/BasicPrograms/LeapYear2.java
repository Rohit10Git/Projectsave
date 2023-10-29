package BasicPrograms;

public class LeapYear2 
{
	public static void main(String[] args)
	{
		int year = 2004;
		
		if((year % 400 == 0) || ((year % 4 == 0) && (year % 100 !=0)))
			System.out.println("Year " + year + " is a leap year");
		else
			System.out.println("Year " + year + " is not a leap year");
	}
}
