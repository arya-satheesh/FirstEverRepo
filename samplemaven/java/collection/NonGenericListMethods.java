package collection;

import java.util.ArrayList;
import java.util.List;

public class NonGenericListMethods {

	public static void main(String[] args) {
		List x = new ArrayList();
		x.add(0, null);
		x.add(1, "Apple");
		x.add(2,100);
		x.add(3,4.5f);
		x.add(4, null);
		x.add(5, "Apple");
		x.add(6, "Apple");
		x.add(7,"berries");
		
		System.out.println(x);
		System.out.println(x.size());
		System.out.println(x.get(7));
		x.set(4, "Arya");
		System.out.println(x);
		System.out.println(x.contains("Apple"));
		System.out.println(x.isEmpty());
		System.out.println(x.indexOf("Arya"));
		System.out.println(x.lastIndexOf("berries"));
		System.out.println("First occurence of berries is at the index: "+x.indexOf("berries"));
		x.remove(4);
		System.out.println(x.size());
		System.out.println(x);
		x.remove("Banana");
		System.out.println(x.size());
		System.out.println(x);
		System.out.println(x);
	}

}
