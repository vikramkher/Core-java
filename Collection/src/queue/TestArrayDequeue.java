package queue;

import java.util.ArrayDeque;
import java.util.Queue;


public class TestArrayDequeue {
	public static void main(String[] args) {

		Queue<Character> q = new ArrayDeque<Character>();

		for (char c = 'a'; c <= 'z'; c++) {
			q.offer(c);
		}

		System.out.println("q: " + q);
	System.out.println("this is first element: " + q.peek());
	System.out.println("q: " + q);
	System.out.println("first element to be remove: " + q.poll());
	System.out.println("q: " + q);

		while (!q.isEmpty()) {
			System.out.println(q.poll());
		}

		System.out.println("q: " + q);

	}
}
