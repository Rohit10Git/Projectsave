package Methods;

public class NonStaticMethod 
{
    public void myMethod() 
    { 
         System.out.println("This is non static method"); 
    }
    
         public static void main(String[] args) 
        { 
        	 NonStaticMethod t = new NonStaticMethod();                                          // creating an object 
                                         t.myMethod();                                                     // to call a non static method 
        } 
}
