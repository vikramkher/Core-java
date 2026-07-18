package set;

import java.util.SortedSet;
import java.util.TreeSet;

public class TestSortedSet {

	public static void main(String[] args) {

		SortedSet s = new TreeSet();

		s.add('c');
		s.add('b');
		s.add('a');
		s.add('b');

		System.out.println(s);

	}


}
