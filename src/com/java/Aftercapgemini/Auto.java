package com.java.Aftercapgemini;

public class Auto extends Vehicle{

	public static void main(String[] args) {
		
		Auto aa = new Auto();
		int a = aa.getNoOfWheel();
		int b = aa.getNoOfStiring();
		
		System.out.println("Auto no of wheel");
		System.out.println(a);
		System.out.println("Auto no of stirring");	
		System.out.println(b);

	}

	@Override
	public int getNoOfWheel() {
		return 3;
	}

	@Override
	public int getNoOfStiring() {
		// TODO Auto-generated method stub
		return 0;
	}

}
