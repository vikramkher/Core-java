package com.rays.thread.join;

public class TestJoinWithThread {

	public static void main(String[] args) {

		JoinThreads t1 = new JoinThreads("Ram");

		JoinThreads t2 = new JoinThreads("Shyam");

		t1.start(); // Start t1 first

		try {
			t1.join(); // Other thread including main thread Wait for t1 to complete
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		t2.start(); // Start t2 after t1 completes

		for (int i = 1; i <= 10; i++) {
			System.out.println(i + " main: thread..");
		}

	}
}
