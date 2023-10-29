package Variables;

public class NonStatic 
{
	  int i = 50;
	     //or
	  int j;
	
	    public static void main(String[] args) 
	    {
	    	NonStatic t = new NonStatic();
		           System.out.println("Before changing the value of i from t variable is : " +t.i);
		           
		           t.i= 60;		
	           	   System.out.println("After changing the value of i from t variable is : " +t.i);	
		
	           	NonStatic u =  new NonStatic();
		           System.out.println("i value from u reference variable before change is : " +u.i);
		
		           u.i = 10;
		           System.out.println("i value from u reference variable after change is : " +u.i);		
	}
}
