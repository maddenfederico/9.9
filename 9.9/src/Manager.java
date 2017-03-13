
public class Manager extends Employee 
{
	private String department;
	
	public Manager(String n, int s, String d) 
	{
		super(n, s);
		department = d;
	}
	
	public String toString()
	{
		return super.toString() + " and department: " + department;
	}

}
