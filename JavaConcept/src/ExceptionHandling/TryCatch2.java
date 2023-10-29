package ExceptionHandling;

public class TryCatch2 
{
	  public static void main(String[] args)
      {  
	        try  
	        {  
	          int data=50/0;                                              //may throw exception   
	        }  
	             
	        catch(Exception e)                                            // handling the exception  
	        {  	                    
	           System.out.println("Can't divided by zero");               // displaying the custom message
	        }  
	  } 
}
