package com.java.learning.multiThreading;


class MultithreadThing extends Thread{

	@Override
	public void run() {
		for(int i = 1 ; i<=5 ; i++) {
			System.out.println(i);
		}
		
		try {
			Thread.sleep(1000);
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
	
	}
	
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//	}

}



public class MultiThreading {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MultithreadThing myThing = new MultithreadThing();
		MultithreadThing myThing2 = new MultithreadThing();
		
		myThing.start();
		myThing2.start();
		
		

	}

}
