package interfacepackage;

public class InterfaceClass2 implements Interface1 {
	
	public void print()
	{
		System.out.println("print");
	}

	public static void main(String[] args) {
		InterfaceClass2 obj1 = new InterfaceClass2();
		obj1.print();
		obj1.show();
		obj1.display();
		//reference creation for interface
		Interface1 ref1 = new InterfaceClass2();
		ref1.display();
		ref1.show();
		
		

	}

	@Override
	public void show() {
		System.out.println("show");
		
	}

	@Override
	public void display() {
		
		System.out.println("display");
	}

}
