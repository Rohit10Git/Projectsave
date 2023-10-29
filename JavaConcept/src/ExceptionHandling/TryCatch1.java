package ExceptionHandling;

public class TryCatch1 
{
	 public static void main(String[] args) 
	 {  
	        try  
	        {  
	           int data=50/0;                                    //may throw exception   
	                        
	        // if exception occurs, the remaining statement will not execute  
	        
	        System.out.println("rest of the code");  
	        }  
	               
	        catch(ArithmeticException e)                        // handling the exception 
	        {  
	            System.out.println(e);  
	        }  
	          
	  }  
}
