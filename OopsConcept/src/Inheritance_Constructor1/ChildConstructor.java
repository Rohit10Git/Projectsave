package Inheritance_Constructor1;

 /*     
         Child class Constructor will call automatically parent class constructor in all cases 
         (Whether constructor is present in parent class or not, if not present it will call default 
         constructor of parent class.) [Both constructors should have same arg. type]                     
 */

public class ChildConstructor extends ParentConstructor
{
	public ChildConstructor()
	{
		System.out.println("Zero arg of child class constructor");
	}

	public static void main(String[] args) 
    {
		ChildConstructor c = new ChildConstructor();
	}
}
