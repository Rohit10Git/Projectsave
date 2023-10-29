package Variables;

public class Local 
{
	 int i = 50;
     	//or
	int j;
	static int k = 20;
	
	public void m1()
	{
		int i;
		i =10;
		
/*             To access non static variable in non static area or method 
		        we can use this keyword. “this” keyword is not applicable to static area or method.
*/
		System.out.println("Global Variable : " +this.i);                                 // 50
		
		//for accessing local variable
		System.out.println("Local Variable : " +i);                                       //10		
	}
	  
        public static void main(String[] args) 
        {
        	Local  t = new Local ();
                       t.m1();
        }
}
