package Inheritance_Constructor2;

/*     
          If Child class constructor type doesn’t matches with the parent then specifically 
         we have to call parent class constructor in the first line of child by using super().
*/

public class ChildConstructor extends ParentConstructor
{
	public ChildConstructor()
	{
		super(20);
		System.out.println("Zero arg of child class constructor");
	}

	public static void main(String[] args) 
    {
		ChildConstructor c = new ChildConstructor();
	}
}
