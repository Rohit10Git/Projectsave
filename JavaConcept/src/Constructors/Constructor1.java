package Constructors;

public class Constructor1 
{
	int m;
	int s;
	int e;
	
	public Constructor1 (int m, int s, int e)
	{
		this.m = m;                               // Global & Local have same variable name so using "This"
		this.s = s;
		this.e = e;
	}
	
	    public static void main(String[] args) 
	    {		
	    	Constructor1  cb1 = new Constructor1 (10, 20, 30);
	    	Constructor1  cb2 = new Constructor1 (40, 50, 60);
		
	    	Constructor1  cb3 = new Constructor1 (7, 2, 0);
	    	Constructor1  cb4 = new Constructor1 (4, 5, 6);
		
	    	Constructor1  cb5 = new Constructor1 (10, 20, 30);
	    	Constructor1  cb6 = new Constructor1 (40, 50, 60);
		
	    	Constructor1  cb7 = new Constructor1 (10, 20, 30);
	    	Constructor1  cb8 = new Constructor1 (40, 50, 60);
		
		    Constructor1  cb9 = new Constructor1 (10, 20, 30);
		    Constructor1  cb10 = new Constructor1 (40, 50, 60);
		
		            System.out.println("Value of m from cb7: " +cb7.m);		
		            System.out.println("Value of m : " +cb5.m+ ",Value of s : " +cb5.s+ ",Value of e : " +cb5.e);
	    }
}
