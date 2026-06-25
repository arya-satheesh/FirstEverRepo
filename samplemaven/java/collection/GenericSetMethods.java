package collection;

import java.util.HashSet;
import java.util.Set;

public class GenericSetMethods {
	
	public static void main(String[] args) {
		Set <String> s = new HashSet <String> ();
		
		s.add("apple");
		s.add("orange");
		
		Set <String> y = new HashSet <String> ();
		
		y.add("pen");
		y.add("paper");
		
		s.addAll(y);
		System.out.println(s);
		System.out.println(s.contains(null));
		System.out.println(s.containsAll(y));
		
		System.out.println(s.size());
		System.out.println(y.isEmpty());
		//y.clear();
		//System.out.println(y);
		s.remove("orange");
		System.out.println(s);
		s.removeAll(y);
		System.out.println(s);
		
		
	}

}
