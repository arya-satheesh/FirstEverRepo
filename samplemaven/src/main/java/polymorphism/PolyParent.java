package polymorphism;

public class PolyParent {
	String name;	
	public void display(String name)
	{
		this.name = name;
		System.out.println("The name of parent is: "+name);
	}
}
