package Interface_Static;

public class Solution implements Cube
{
	 public void answer()
	  {
		  System.out.println("The cube of number is : ");
	  }
	  
	  public static void main(String args[])
	  {
		  Solution d = new Solution();
		                d.answer();
		  System.out.println(Cube.cubes(3));
	  }
}
