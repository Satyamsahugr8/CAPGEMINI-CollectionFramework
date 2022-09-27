package com.java.multiThread;

public class MultiThreading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MultithreadThing myThing = new MultithreadThing();
		MultithreadThing myThing2 = new MultithreadThing();
		
		myThing.start();
		myThing2.start();
		
		

	}

}
