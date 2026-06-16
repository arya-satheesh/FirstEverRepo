package aggregation;

public class Department {
	String dept_name;
	Employee emp_ref;
	
	Department(String dept_name, Employee emp_ref)
	{
		this.dept_name = dept_name;
		this.emp_ref = emp_ref;
	}
	
	public void show()
	{
		System.out.println("name: "+emp_ref.name+" department: "+dept_name+" age: "+emp_ref.age);
	}

	public static void main(String[] args) {
		Employee e1 = new Employee("Arya", 12, "hsdvhsd");
		Department d1 = new Department("CSE", e1);
		d1.show();

	}

}
