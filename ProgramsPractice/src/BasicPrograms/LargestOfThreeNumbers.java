package BasicPrograms;

public class LargestOfThreeNumbers 
{
	public void methodName(int F,double G,int H)            // Non-Static Method    
	{
		 
	 if (F>=G && F>=H)                                                // If Condition
	 
		System.out.println(F+ " Is The Largest Number.");
	
	 else if (G>=F && G>=H)                                              // Else If Condition
	 
		System.out.println(G+ " Is The Largest number.");
	 
	 else                                                                    // Else Condition
	 
	    System.out.println(H+ " Is The Largest number.");	 
   }
	
	public static void main(String args[])                             // Main Method
	{
		LargestOfThreeNumbers ggg = new LargestOfThreeNumbers();
		ggg.methodName(32,82.5,44);                                        // Calling Non-Static Method
	}
}
