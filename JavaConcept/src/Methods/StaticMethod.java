package Methods;

/*
           Ways to call static method: 
           1. By direct name of method provided method is in the same class 
           2. By Classname.method name 
           3. By object reference variable but it is not recommended.
 */

public class StaticMethod 
{
    public static void myFirstMethod()
   { 
        System.out.println("one"); 
        System.out.println("two");
        System.out.println("three");
        System.out.println("four");
        System.out.println("five"); 
   }
   
    public static void main(String[] args) 
     { 
           myFirstMethod();                                     //calling of a method 
     }
}
