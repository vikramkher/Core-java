package Basics;

import java.util.ArrayList;
import java.util.Collection;

public class TestCollection {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {

		Collection<Comparable> c = new ArrayList<Comparable>();

		c.add(40);
		c.add("Ram");
		c.add('a');
		c.add(3.7);
		c.add(true);

		System.out.println(c);
		System.out.println("size of c: " + c.size());

		System.out.println("---------");

		for (Object o : c) {
			System.out.println(o);
		}

		System.out.println("--------");
		System.out.println(c.contains(90)); 
		System.out.println(c.contains('a'));
		System.out.println("---------");
		System.out.println(c.remove(90));
		System.out.println(c.remove('a'));
		System.out.println(c);
		System.out.println("size of c: " + c.size());

	}
}
