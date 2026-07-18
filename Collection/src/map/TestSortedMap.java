package map;

import java.util.SortedMap;
import java.util.TreeMap;

public class TestSortedMap {

	public static void main(String[] args) {
		
		
		SortedMap<String, Integer> m = new TreeMap<String, Integer>();
		
		m.put("one", 1);
		m.put("two", 2);
		m.put("three", 3);
		m.put("our", 4);
		
		
		System.out.println(m);
		
		
		

	}
}
