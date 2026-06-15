package Inheritance;

public class MultiLevelChild extends MultiLevelParent {
	
	public int diff(int a, int b)
	{
		int c = a-b;
		return c;
	}

	public static void main(String[] args) {
		MultiLevelChild obj1 = new MultiLevelChild();
		System.out.println(obj1.diff(10, 7));
		obj1.display();
		obj1.show();
		System.out.println(obj1.add(2, 3));
	}

}
