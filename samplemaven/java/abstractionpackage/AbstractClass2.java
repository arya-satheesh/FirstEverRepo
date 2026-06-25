package abstractionpackage;

public class AbstractClass2 extends AbstractClass1 {

	public static void main(String[] args) {
		
		AbstractClass2 obj1 = new AbstractClass2();
		obj1.show();
		obj1.chidmethod();
		obj1.display();
		
		
	}

	@Override
	public void show() {
		System.out.println("Output from show method");
		
	}
	public void chidmethod() {
		System.out.println("Output from child method");
	}
}
