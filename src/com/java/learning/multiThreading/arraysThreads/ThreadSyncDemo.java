package com.java.learning.multiThreading.arraysThreads;

class Counter {

	int count;

	public synchronized void increment() {
		count++;
	}
	
	
	
	
//	public void means(double sum, int length) {
//	this.mean = sum/length;
//}
//
//public void means(int[] arr, int length) {
//	double sum=0.0;
//	for(int ar : arr) {
//		sum += ar;
//	}
//	this.mean = sum/length;
//}	
	
	
}

public class ThreadSyncDemo {

	public static void main(String[] args) {

		long startTime = System.nanoTime();

		Counter c = new Counter();

		Thread t1 = new Thread(() -> {
			for (int i = 1; i <= 1000; i++) {
				c.increment();
			}
		});

		Thread t2 = new Thread(() -> {
			for (int i = 1; i <= 1000; i++) {
				c.increment();
			}
		});

		t1.start();
		t2.start();

		// join method to join it with main thread
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("count " + c.count);

		long endTime = System.nanoTime();
		long timeElapsed = endTime - startTime;
		System.out.println("Execution time in milliseconds: " + timeElapsed / 1000000);

	}

}
