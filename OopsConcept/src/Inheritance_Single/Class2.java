package Inheritance_Single;

public class Class2 extends Class1
{
	  public void m2()
	  {
		  System.out.println("Class number 2");
	   }

     public static void main(String args[])
     {		  
    	  Class2 b=new Class2();
	                 b.m1();
	                 b.m2();
      }
}
