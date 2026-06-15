package AccessModifiers;

public class Access1 {
	
	public void display1()
	{
		System.out.println("This is public");
	}
	
	private void display2()
	{
		System.out.println("This is private");
		
	}

	protected void display3()
	{
		System.out.println("This is protected");
		
	}
	
	void display4()
	{
		System.out.println("This is default");
	}
	

	public static void main(String args[])
	{
		Access1 obj1 = new Access1();
		obj1.display1();
		obj1.display2();
		obj1.display3();
		obj1.display4();
	}
	
}
