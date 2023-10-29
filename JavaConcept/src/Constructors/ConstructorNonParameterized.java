package Constructors;

public class ConstructorNonParameterized 
{
	public ConstructorNonParameterized ()                                                  // non-parameterized
	{
		System.out.println("constructor is running");
	} 
     
	public static void main(String[] args) 
	{		
		ConstructorNonParameterized  cb = new ConstructorNonParameterized ();
     }
}
