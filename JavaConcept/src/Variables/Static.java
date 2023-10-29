package Variables;

public class Static 
{
	static int i = 50;
	
	public static void main(String args[])
	{
		     // accessing static variable 
		       System.out.println(i);
		       System.out.println(Static.i);
		
		       /* accessing variable by using object but it is not recommended
		            Test t =  new Test();
		           System.out.println(t.i);
		       */
		System.out.println("The value of i variable is : " +i);	
	}
}
