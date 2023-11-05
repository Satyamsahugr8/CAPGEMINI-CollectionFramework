package com.java.learning.multiThreading.arraysThreads;

public class ThreadSyncDemo3 {

	public static void main(String[] args) {
		
		long startTime = System.nanoTime();

		Counter c = new Counter();

		for (int i = 1; i <= 2000; i++) {
			c.increment();
		}

		System.out.println("count " + c.count);
		
		
		
		long endTime = System.nanoTime();
		long timeElapsed = endTime - startTime;
		System.out.println("Execution time in milliseconds: " + timeElapsed / 1000000);

	}

}
