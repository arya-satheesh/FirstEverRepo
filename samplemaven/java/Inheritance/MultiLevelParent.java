package Inheritance;

public class MultiLevelParent extends MultiLevelGrandParent{
	public void show()
	{
		System.out.println("Method from MultilevelParent");
	}
	
	public int add(int a, int b)
	{
		int c = a+b;
		return c;
	}

}
