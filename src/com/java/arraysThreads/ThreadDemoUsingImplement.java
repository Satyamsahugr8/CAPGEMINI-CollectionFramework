package com.java.arraysThreads;

class Threadi implements Runnable {

	@Override
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.print("i = " + i + ",");
		}
	}
}

class Threadj implements Runnable {

	@Override
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.print("j = " + i + ",");
		}
	}
}

public class ThreadDemoUsingImplement {

	public static void main(String[] args) {

		Threadi the3 = new Threadi();
		Threadj the4 = new Threadj();

		Thread thee3 = new Thread(the3);
		Thread thee4 = new Thread(the4);

		thee3.start();
		thee4.start();

	}
}