package Constructors;

public class CopnstructorCallAnother 
{
	public CopnstructorCallAnother(int m, int s, int e) 
	{
		System.out.println("three argument constructor");
	}

	public CopnstructorCallAnother(int m) 
	{
		this(10, true);
		System.out.println("one argument constructor");
	}

	public CopnstructorCallAnother(int m, boolean b) 
	{
		this(10, 20, 30);
		System.out.println("two argument constructor");
	}
	
	public CopnstructorCallAnother()
	{
		this(14);		
		System.out.println("zero argument constructor");		
	}

    public static int m5()
    {
    	return 66565656;
    }
	
    public static void main(String[] args) 
    {
    	CopnstructorCallAnother cb = new CopnstructorCallAnother();
    }
}
