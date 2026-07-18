package queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class TestPQueue {
	
@SuppressWarnings("rawtypes")
public static void main(String[] args) {
		
		Queue<Comparable> q = new PriorityQueue<Comparable>();
		
		q.add("Ram");
		q.add(5);//ClassCastException
		
		System.out.println(q);
		
	}

}
