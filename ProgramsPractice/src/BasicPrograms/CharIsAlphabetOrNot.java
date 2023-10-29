package BasicPrograms;

public class CharIsAlphabetOrNot
{
     public static void main(String args[])                                // Main Method 
     {	
		     char R= '5';
		
		if ((R >= 'A' && R <= 'Z')||(R >= 'a' && R <= 'z'))
		{
			System.out.println(" The char R is an alphabet.");
		}
		else
		{
			System.out.println(" The char R is not an alphabet.");
		}
	}
}
