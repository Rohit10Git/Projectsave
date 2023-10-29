package Operators;

public class OperatorUnary 
{
	public static void main(String args[])             //Main Method
	{
		int r=50;
		int v=20;
		System.out.println(r++);                       //50(51)        Post-fix
		System.out.println(++r);                       //51+1=52       Prefix
		System.out.println(--r);                       //52-1=51       Prefix
		
		System.out.println(v++);                       //20(21)        Post-fix
		System.out.println(++v);                       //21+1=22       Prefix
		System.out.println(--v);                       //22-1=21       Prefix
	
		System.out.println(++v);                       //1+21=22       Prefix
		System.out.println(v);                         //22
	}
}
