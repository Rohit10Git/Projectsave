package BasicPrograms;

public class Multiplication 
{
	  public static void multi(float h, float w)                 // Static Method
	 {
			float a;
			         a = h*w;
			      System.out.println("The multiplication of two float numbers is = " +a);        // Print Statement
	  }
	       public static void main(String args[])                        // Main Method
	       {
	    	  Multiplication.multi(25.5f,4.5f);                       // Calling Static Method
	       }
}
