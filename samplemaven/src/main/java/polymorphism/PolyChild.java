package polymorphism;

public class PolyChild extends PolyParent{
	String name;
	public void display(String name)
	{
		this.name = name;
		System.out.println("The name of child is: "+name);
	}
	
	public void show()
	{
		display("Child");
		super.display("parent");
	}

	public static void main(String[] args) {
		PolyChild obj1 = new PolyChild();
		obj1.show();

	}

}
