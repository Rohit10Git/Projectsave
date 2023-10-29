package Operators;

public class ShiftRelnBitLogicArith 
{
	public static void main(String args [])
	{
		
	                   //shift operator
            	System.out.println("Left shift = ");             // Multiplication
	            System.out.println(40<<3);                       // 40*2^3 = 40*8 = 320
	            System.out.println(26<<3);                       // 26*2^3 = 26*8 = 208
	            System.out.println(48<<4);
	            System.out.println("right shift = ");            // Diversion
	            System.out.println(40>>2);                       // 40/2^2 = 40/4 = 10
	            System.out.println(40>>3);
	            System.out.println(40>>4);
	
	                 //bitwise operator
	            int k=55;
            	int g=69;
	            System.out.print("bit & = ");
	            System.out.println((k<g)&(k>g));                   // use of & and type
	            System.out.print("bit | = ");
	            System.out.println((k<g)|(k>g));                  // use of | or type
	
	                 //logical operator
	            int m=20;
	            int p=60;
	            System.out.print("logic && = ");                  //use of && and type
	            System.out.println((k<g)&&(m>p));               
	            System.out.print("logic || = ");                 //use of|| or type
	            System.out.println((g<k)||(p>m));             
	
	                 //relational operator
	            int v=98;
	            int s=65;
	            System.out.print("V is greater than S = ");                      // V > S
	            System.out.println(v>s);
	            System.out.print("V is less than S = ");                          // V < S
	            System.out.println(v<s);
	            System.out.print("V is not equals to S = ");                      // V != S
	            System.out.println(v!=s);
	            System.out.print("V is double equals to S = ");                   // V == S
	            System.out.println(v==s);
	            System.out.print("V is less than or equals to S = ");             // V <= S
	            System.out.println(v<=s);
	            System.out.print("V is greater than or equals to S = ");           // V >= S
	            System.out.println(v>=s);
	
	                 //assignment operator
	            int w=100;
	            int u=50;
	            System.out.print("Result of += assignment w = ");            // Addition
	            w+=30;
	            System.out.println(w);
	            System.out.print("Result of -= assignment u = ");            // Subtraction
	            u-=10;
	            System.out.println(u);
	            System.out.print("Result of /= assignment w = ");            // Division
	            w/=10;
	            System.out.println(w);
	            System.out.print("Result of *= assignment u = ");            // Multiplication
	            u*=6;
	            System.out.println(u);
	            System.out.print("Result of %= assignment w = ");            // Modulus
	            w%=2;
	            System.out.println(w);
      }
}
