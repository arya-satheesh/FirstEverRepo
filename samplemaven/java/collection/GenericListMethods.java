package collection;

import java.util.ArrayList;
import java.util.List;

public class GenericListMethods {

	public static void main(String[] args) {
		//declare a collection Interface for strings
		List <String> l = new ArrayList <String> ();
		
		l.add(0, "Apple");
		l.add(1, "Orange");
		l.add(2, "Banana");
		l.add(3, "berries");
		l.add(4, null);
		l.add(5, "Apple");
		l.add(6, "Apple");
		l.add(7,"berries");
		
		System.out.println(l);
		System.out.println(l.size());
		System.out.println(l.get(7));
		l.set(4, "Arya");
		System.out.println(l);
		System.out.println(l.contains("Apple"));
		System.out.println(l.isEmpty());
		System.out.println(l.indexOf("Arya"));
		System.out.println(l.lastIndexOf("berries"));
		System.out.println("First occurence of berries is at the index: "+l.indexOf("berries"));
		l.remove(4);
		System.out.println(l.size());
		System.out.println(l);
		l.remove("Banana");
		System.out.println(l.size());
		System.out.println(l);
		
		List <Integer> i = new ArrayList<Integer> ();
		List <Float> f = new ArrayList<Float> ();
		
	}

}
