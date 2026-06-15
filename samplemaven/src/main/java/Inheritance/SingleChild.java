package Inheritance;

public class SingleChild extends SingleParent {

	public static void main(String[] args) {
		System.out.println(st_variable);
		
		SingleParent obj1 = new SingleParent();
		System.out.println(obj1.name);
		obj1.display();

	}

}
