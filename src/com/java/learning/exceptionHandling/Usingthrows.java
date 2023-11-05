package com.java.learning.exceptionHandling;

public class Usingthrows {

	public static void main(String[] args) throws InterruptedException {
		
		stuff();

	}

	private static void stuff() throws InterruptedException {
		// TODO Auto-generated method stub
		
		doMoreStuff();		
	}

	private static void doMoreStuff() throws InterruptedException {
		// TODO Auto-generated method stub
		Thread.sleep(3000);
		
	}

	
}
