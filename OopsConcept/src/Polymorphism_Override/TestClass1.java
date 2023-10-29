package Polymorphism_Override;

public class TestClass1 extends Class1
{
	   String show()
	   {
		   super.show();
		   System.out.println("Class2 data");
		   return null;
	   }
	public static void main(String[] args) 
	{
		TestClass1 t = new TestClass1();
		                 t.show();
		      
		      Class1 l = new Class1();
		                 l.show();
		      
		      Class1 g = new TestClass1();
		                 g.show();
	}
}
