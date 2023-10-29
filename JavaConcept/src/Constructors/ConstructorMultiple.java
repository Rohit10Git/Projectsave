package Constructors;

public class ConstructorMultiple 
{
	public ConstructorMultiple (int m, int s, int e) 
	{  
		System.out.println("Three argument constructor");		
	}

	public ConstructorMultiple (int m) 
	{
		System.out.println("One argument constructor");
	}

	public ConstructorMultiple (int m, boolean b) 
	{
		System.out.println("Two argument constructor");
	}

	    public static void main(String[] args) 
        {	
	    	ConstructorMultiple  cb1 = new ConstructorMultiple (10);
	    	ConstructorMultiple  cb2 = new ConstructorMultiple (40, 50, 60);
	    	ConstructorMultiple  cb3 = new ConstructorMultiple (7, false);		   
	    }
}
