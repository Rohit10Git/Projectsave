package Operators;

public class OperatorArithmatic 
{
	 int g=80;
	 double m=25.5;
	     
	 //Non-Static Method
	    public void sum()                          //Addition of numbers
	 {
		System.out.println("Addition is : " +(g+m));    
	 }
	    
	    public void sub()                          //Subtraction of numbers
	 {
	    System.out.println("Subtraction is : " +(g-m)); 
	 }
	    
	    public void mul()                          //Multiplication of numbers
	 {
	    System.out.println("Multiplication is : " +g*m); 	 
	 }
	    
	    public void div()                          //Division of numbers
	 {
	    System.out.println("Division is : " +g/m);
	 }
	    
	    public void mod()                          //Modulus of numbers
	 {
	    System.out.println("Modulus is : " +g%m);
	 }  
	    
	    public static void main(String args[])                                      //Main Method
	 {
	    	OperatorArithmatic  rrr=new OperatorArithmatic ();                   //Object Creation
	    	                                rrr.sum();
	    	                                rrr.sub();
	    	                                rrr.mul();
	    	                                rrr.div();
	    	                                rrr.mod();
	 }
}
