package com.java.learning.multiThreading.arraysThreads;

public class ThreadDemoUsingLambdaExp {

	public static void main(String[] args) {

		Thread t1 = new Thread(() -> {
			for (int i = 1; i <= 5; i++) {
//				System.out.print("i = " + i + ",");
				System.out.println("Hi");
				try {Thread.sleep(1000);} catch (Exception e) {}
			}
		}, "Hi Thread");

		Thread t2 = new Thread(() -> {
			for (int i = 1; i <= 5; i++) {
//				System.out.print("j = " + i + ",");
				System.out.println("Hello");
				try {Thread.sleep(1000);} catch (Exception e) {}
			}
		}, "Hello Thread");

		
		// Call
		
//		System.out.println(t1.getName());
//		System.out.println(t2.getName());
		
		t1.setPriority(Thread.MIN_PRIORITY);
		t2.setPriority(Thread.MAX_PRIORITY);
		
		System.out.println(t1.getPriority());  // bydafault 5 for both now after setting 1 
		System.out.println(t2.getPriority()); // and 10
		
		t1.start();
		
		try {
			Thread.sleep(10);
			} 
		catch (Exception e) {	
		}
		
		t2.start();
		
		// join method to join it with main thread
		try {
			t1.join();
			t2.join();
			} 
		
		catch (InterruptedException e) {e.printStackTrace();}

		System.out.println("Bye"); // printed bye in between is because of main thread , using .join() we can ignore this
		
	}
}
