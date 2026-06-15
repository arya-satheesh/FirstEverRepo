package SuperKeyword;

public class Child extends SuperParent {
	String name = "child class";
	Child()
	{
		super();
		System.out.println("child class constructor");	
	}
	
	void show()
	{
		System.out.println("Child class method");
	}
	
	void display()
	{
		System.out.println("child variable: "+name);
		System.out.println("Parent variable: "+ super.name);
		show();
		super.display();
	}

	public static void main(String[] args) {
		Child c = new Child();
		c.display();

	}

}
