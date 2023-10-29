package BasicPrograms;

public class ReverseOfString 
{
	public static void main(String[] args) 
	{
         String name = "ROHIT";
		
	    	int leng = name.length();                   // 5
		   String rev= "";
		   for(int i= leng-1; i>=0; i--)                    // 4 3 2 1 0
		   {
			   rev = rev+name.charAt(i);      
		   }
		System.out.println("Reverse of "+name+" is "+rev);
	}
}
