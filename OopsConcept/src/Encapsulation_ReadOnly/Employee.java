package Encapsulation_ReadOnly;

public class Employee 
{
	private String name;
	private int id;
	private String company;
	
	Employee(String name, int id, String company)
	{
		this.name=name;
		this.id=id;
		this.company=company;
	}
	
	public String getName()
	{
		return name;		
	}
	
	public int getId()
	{
		return id;
	}
	
	public String getCompany()
	{
		return company;
	}
}
