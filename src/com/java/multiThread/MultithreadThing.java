package com.java.multiThread;

public class MultithreadThing extends Thread{

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
