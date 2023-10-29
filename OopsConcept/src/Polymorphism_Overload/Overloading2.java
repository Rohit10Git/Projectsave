package Polymorphism_Overload;

public class Overloading2 
{
	  public static void sum(int a, int b)
	  {	 
		  int l=(a+b);
		  System.out.println("int-int type arg method : " +l);
	  }
	  
	  public static void sum(int a, int b, int c)
	  {
		  int l=(a+b+c);
		  System.out.println("int-int-int type arg method : " +l);
	  }
	  
	  public static void main(String[] args)
	  {
		  Overloading2.sum(22, 22);
		  Overloading2.sum(22, 22, 22);
	  }
}
