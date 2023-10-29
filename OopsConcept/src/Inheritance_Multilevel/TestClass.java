package Inheritance_Multilevel;

public class TestClass extends Class3
{
	  public static void main(String args[])
	  {
	         Class1 s=new Class1();                       // Class A
                        s.m1();
                   //   s.eat();                                                 it will show error
                   //   s.sleep();                                              it will show error
         
             Class2 c=new Class2();                          // Class B          
                        c.m1();		                                 
                        c.m2();
                    //  c.m3();                                                   it will show error
          
             Class3 d=new Class3();                         //  Class C
                        d.m1();                                                                                                      
                        d.m2();
                        d.m3();
             
		  TestClass t=new TestClass();                       
		                 t.m1();	                                       
		                 t.m2();
		                 t.m3();		   	         		          		  		          		
	  }
}
