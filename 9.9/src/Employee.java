
public class Employee 
{
	private String name;
	private int salary;
	
	public Employee(String n, int s)
	{
		name = n;
		salary = s;
	}
	
	public String toString()
	{
		return "Employee with name: " + name + " and salary: $" + salary;
	}
}
