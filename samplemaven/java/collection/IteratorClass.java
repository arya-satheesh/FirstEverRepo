package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class IteratorClass {

	public static void main(String[] args) {
		Set <String> x = new HashSet <String> ();
		x.add("Hello");
		x.add("Hi");
		x.add("Pen");
		x.add("Paper");
		x.add("book");
		//System.out.println(x);
		
		for(String a : x)
		{
			System.out.println(a);
		}
		//here Object: is an inbuilt java class. here, className is using 
		
		/*Iterator i = x.iterator();
		
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
		i.remove();
		System.out.println(x);
		}*/
		
		//generic set
		
		Set y = new HashSet ();
		y.add(null);
		y.add(200);
		y.add("Arya");
		y.add(4.5f);
		
		for(Object b : y)
		{
			System.out.println(b);
		}

}
}


