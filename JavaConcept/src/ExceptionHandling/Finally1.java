package ExceptionHandling;

public class Finally1 
{
	 public static void main(String args[])
	 {   		  
	      try 
	      {    	  
	           System.out.println("Inside the try block");  
	          
	        //below code throws divide by zero exception  
	        int data=25/0;    
	        System.out.println(data);    
	      }    
	     
	      //cannot handle Arithmetic type exception  
	      //can only accept Null Pointer type exception  
	      catch(NullPointerException e)
	      {  
	        System.out.println("Catch : " +e);  
	      }   
	  
	      //executes regardless of exception occurred or not   
	      finally 
	      {  
	        System.out.println("finally block is always executed");  
	      }    
	  
	        System.out.println("rest of the code...");    
	      } 
}
