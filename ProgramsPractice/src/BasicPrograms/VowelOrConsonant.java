package BasicPrograms;

public class VowelOrConsonant 
{
	public static void main(String args[])             // Main Method
	{
			char name = 'k';
			
			switch(name)
			{
			case 'a' : System.out.println(name+ " Is a vowel "); 
			case 'e' : System.out.println(name+ " Is a vowel ");
			case 'i' : System.out.println(name+ " Is a vowel ");
			case 'o' : System.out.println(name+ " Is a vowel ");
			case 'u' : System.out.println(name+ " Is a vowel ");
			  
			 break;
			   
			 default : System.out.println(name+ " Is a consonant ");
			}
	}
}
