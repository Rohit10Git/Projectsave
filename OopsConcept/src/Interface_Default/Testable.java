package Interface_Default;

class Testable implements Showable
{
	public void print()
	  {
		  System.out.println("Printed Successfully");
	  }
	  
	  public void show()
	  {
		  System.out.println("Showed Successfully");
	  }

	  public static void main(String args[])
	  {
		  Testable t = new Testable();
		                t.print();
		                t.show();
	  }
}
