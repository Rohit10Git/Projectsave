package ExceptionHandling;

public class TryCatch 
{
	 public static void main(String[] args) 
	 {  
	        try  
	        {  
	          int data=50/0;                                       //may throw exception   
	        }  
	             
	        catch(ArithmeticException e)                           //handling the exception 
	        {  
	            System.out.println("Catch : " +e);  
	        }  
	            System.out.println("rest of the code");  
	  } 
}
