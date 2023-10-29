package BasicPrograms;

public class SubString 
{
	public static void main(String[] args) 
	{
        String name = "Hello World";
		
		System.out.println(name.substring(6));               // Print string starting from index 6
		
		System.out.println(name.substring(0, 5));          // Print string starting from index 0 & ends at index 5
	}
}
