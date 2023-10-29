package BasicPrograms;

// reverse of any number will be same example 121
public class PalindromeNumber 
{
	public static void main(String[] args)
	{
		int n = 121;
		int temp = n;                // Storing original number into temp
		int rev = 0,rem;
		while(temp != 0)
		{
			rem = temp % 10;
			rev = rev * 10 + rem;
			temp = temp / 10;
		}
		if(n == rev)
		{
			System.out.println(n +" is Palindrome number");
		}
		else
		{
			System.out.println(n +" is not Palindrome number");
		}
	}
}
