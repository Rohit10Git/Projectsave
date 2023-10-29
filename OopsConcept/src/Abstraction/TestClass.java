package Abstraction;

public class TestClass 
{
	  public static void main(String args[])
	   {
	         Class1 C = new Class2();
	                    C.start();
	             
	         Class1 S = new Class3();
	                    S.start();   
	             
	             Class2 c = new Class2();
	                        c.start();      
	         
	             Class3 s = new Class3();
	                        s.start();    
	   }
}
