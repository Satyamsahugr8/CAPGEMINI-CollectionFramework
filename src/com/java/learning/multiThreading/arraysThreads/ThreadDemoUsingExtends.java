package com.java.learning.multiThreading.arraysThreads;

class Thread1 extends Thread {

	@Override
	public void run() {
		for (int i = 1; i<=100; i++) {
			System.out.print("i = "+i+",");
		}	
	}
}

class Thread2 extends Thread {

	@Override
	public void run() {
		for (int j = 100; j<=200; j++) {
			System.out.print("j= "+j+",");
		}
	}
}

public class ThreadDemoUsingExtends {

	public static void main(String[] args) throws InterruptedException {
		
		Thread1 th1 = new Thread1();
		Thread2 th2 = new Thread2();
		
		th1.start();
		th2.start();
		
		th1.join();
		
	
	}
}