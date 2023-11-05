package com.java.learning.multiThreadingLearn;

class A implements Runnable {

	@Override
	public void run() {

		for (int i = 0; i < 5; i++) {

		}

	}

}

public class ThreadBasics {

	int[] i = new int[] { 1, 2, 3, 4, 5, 6 };

	public static void main(String[] args) {
		A a = new A();

	}

}
