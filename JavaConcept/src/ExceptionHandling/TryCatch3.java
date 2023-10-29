package ExceptionHandling;

public class TryCatch3 
{
	 public static void main(String[] args) 
	 {  
	        int i=50;  
	        int j=0;  
	        int data;  
	      
	        try  
	        {  
	            data=i/j;                                               //may throw exception   
	            System.out.println(data);  
	        }  
	            
	        catch(Exception e)                                      // handling the exception  
	        {  	                                                       
	            System.out.println(i/(j+2));                        // resolving the exception in catch block  
	        }  
	  }  
}
