package Polymorphism_Overload;

public class AutomaticPromotion 
{
	 void show(int a)                                       
	    {
	    	System.out.println("Int Method");
	    }
	    
	    void show(String a)
	    {
	    	System.out.println("String Method");
	    }
	    
	    public static void main(String[] args) 
	    {
	    	AutomaticPromotion  O = new AutomaticPromotion();
	    	                                   O.show('a');                                     // char promoted to integer
	    	                                   O. show("Hi");
		}
}
