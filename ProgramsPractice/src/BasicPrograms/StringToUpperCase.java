package BasicPrograms;

public class StringToUpperCase 
{
	public static void main(String[] args) 
	{
		String str = "string to uppercase example";
		String strUpper = str.toUpperCase();
		
		System.out.println("Original String: " +str);
		System.out.println("String changed to uppercase: " +strUpper);
	}
}
