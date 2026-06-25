package AccessNewPackage;

import AccessModifiers.Access1;

public class Access3 extends Access1{

	public static void main(String[] args) {
		Access3 obj3 = new Access3();
		obj3.display1();
		obj3.display3();
		
		Access1 obj1 = new Access1();
		obj1.display1();

	}

}
