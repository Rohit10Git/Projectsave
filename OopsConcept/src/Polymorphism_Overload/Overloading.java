package Polymorphism_Overload;

public class Overloading                       //Same Class, Same Method but Type of arg.different
{
	void show(int a)                                          
    {
    	System.out.println("First Method");
    }
    
    void show(int a, int b)
    {
    	System.out.println("Second Method");
    }
    
    public static void main(String[] args) 
    {
    	Overloading  O = new Overloading ();
    	                     O.show(10);
    	                     O. show(20,30);
	}
}
