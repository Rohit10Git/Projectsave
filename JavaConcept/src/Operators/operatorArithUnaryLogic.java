package Operators;

public class operatorArithUnaryLogic 
{
	 int m=8;
	 int n=5;
	 String sname="concat";
	 
	 public void m1()
	 {
		 // Arithmetic operator
		  int r1 = m+n;
          int r2 =m-n;
          int r3 = m*n;
   double r4 = m/n;
     String s2 = m+sname;
     String s3 = sname+n;
     
     System.out.println(r1);
	 System.out.println(r2);
	 System.out.println(r3);
	 System.out.println(r4);
	 System.out.println(s2);
	 System.out.println(s3);

	 System.out.println("---------------");
	 
	// prefix-----post-fix  (Unary Operator)
	 
		 System.out.println(m++);                          // 8(9) = 8
		 System.out.println(++m);                           // 1 + 9 = 10
		 System.out.println(n++);                             // 5(6) = 5
		 System.out.println(--n);                                 // 1 - 6 = 5
		 System.out.println(m++ + ++m);                     // 10(11) + 1+11 = 10 + 12 = 22
		 System.out.println(n++ + ++n);                         // 5(6) + 1+6 = 5 + 7 = 12

		 System.out.println("---------------");
		 
		// Relational Operator
		 
		 System.out.println(m<n);
		 System.out.println(m>n);
		 System.out.println(m<=n);
		 System.out.println(m>=n);
		 System.out.println(m==n);
		 System.out.println(m!=n);
	 }
	 
	 public static void main(String[] args) 
	 {	
               
		 operatorArithUnaryLogic  x=new operatorArithUnaryLogic(); 
	                                              x.m1();
     } 
}
