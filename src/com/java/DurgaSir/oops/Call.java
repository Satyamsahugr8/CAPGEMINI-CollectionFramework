package com.java.DurgaSir.oops;

public class Call {

	public void A(int a) {
		System.out.println("int " +a);
	}
	
	public int A(float f) {
		System.out.println("Float "+f);
		return 0;
	}
	
	public void A(String s) {
		System.out.println("String "+ s);
	}
	
	// Polymorphism
	// Method OverLoading
	
	public static void main(String[] args) {
		Call c = new Call();
		
		c.A(0);
		c.A(0f);
		c.A("Null");

	}

}
