package Polymorphism_Overload;

public class Overloading1 
{
	public void m1()
	{
		System.out.println("zero arg method");
	}

	public void m1(int x)
	{
		System.out.println("int type arg method");
		System.out.println("x= "+x);
	}
	
	public static void m1(String x)
	{		
		System.out.println("string type arg method");
		System.out.println("x= "+x);
	}
	
	public void m1(int x,float y)
	{
		System.out.println("int-float type arg method");
		System.out.println("x= "+x  + " y= "+y);	
	}
	
	public void m1(float y,int x)
	{
		System.out.println("float-int type arg method");
		System.out.println("y= "+y  + " x= "+x);
	}
	
		public static void main(String[] args){
			Overloading1  m0= new Overloading1 ();
		                           m0.m1();
			                       m0.m1(200);
			Overloading1 .m1("Rohit");
			                       m0.m1(100,50f);
			                       m0.m1(50f,100);
	}
}
