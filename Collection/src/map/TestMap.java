package map;

import java.util.HashMap;
import java.util.Map;

public class TestMap {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		
		Map<Comparable, Comparable> m = new HashMap<Comparable, Comparable>();
		
		m.put("one", 1);
		m.put("two", 2);
		m.put("three", 3);
		m.put("four", 4);
		m.put(5 , "five");
	
		System.out.println(m.get(5));
		System.out.println(m.entrySet());
		System.out.println(m.containsKey(5));
		System.out.println(m.containsValue(5));
		System.out.println(m.keySet());
		System.out.println(m.values());
	}
}
