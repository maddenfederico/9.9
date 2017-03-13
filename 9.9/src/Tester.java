
public class Tester 
{
	public static void main(String[] args)
	{
		Employee employee1 = new Employee("Jason", 40000);
		Manager manager1 = new Manager("John", 100000, "Informatics");
		Executive exec1 = new Executive("Ben", 1000000, "HR");
		
		System.out.println(employee1);
		System.out.println(manager1);
		System.out.println(exec1);
		
		
	}
}
