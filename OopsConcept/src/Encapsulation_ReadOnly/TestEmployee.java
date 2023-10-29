package Encapsulation_ReadOnly;

public class TestEmployee 
{
	  public static void main(String args[])
	  {
		  Employee em = new Employee("Deep",4561,"TCS");
		  
		  String name= em.getName();
		  int id= em.getId();
		  String company= em.getCompany();
		  
		  System.out.println("Employee name: " +name);
		  System.out.println("Employee id: " +id);
		  System.out.println("Employee company: " +company);
       }
}