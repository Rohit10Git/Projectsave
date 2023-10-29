package Variables;

public class Variables 
{
	//method with argument and no return
			public void m1(int a, int b)                                     // argument
			{			
				int c = a+b;
				System.out.println("The value of c: " +c);
			}
			
			//method without argument and no return		
			public void m2()
			{			
				int c = 0;
				System.out.println("The value of c: " +c);
			}
			
			//method without argument with return
			public boolean m3() 
		              {			 
				return false;
			}
			
			//method with return type and no argument 
			public int m4()
			{
				int a = 1;
				int b = 2;
				int c = a+b;
				
				return c;						
			}
			
			//method with return type and argument 		
			public int m5(boolean b, int c, double d)
			{
				
				b = true;
				c= 63;
				
				return 50;			
			}
			
			public static void main(String[] args) 
		              {
				Variables t = new Variables();
				
				               t.m1(10, 20);
				
				               t.m2();
				
				boolean r = t.m3();			 
				System.out.println("r value is : "+r);
				
				int l = t.m4();
				System.out.println("l value is : "+l);
				
				int u = t.m5(false, 10, 10.5);
				System.out.println("u value is : "+u);
			}
}
