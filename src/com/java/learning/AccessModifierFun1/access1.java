package com.java.learning.AccessModifierFun1;

public class access1 {

	// default, public, protected and private 
	
	// default
	int a = 12;
	int b = 22;
	
//	// static
	static int s = 10;
//	s = 22;
	
	// public
	public int c = 10;
	public int d = 10;
	
	//protected
	protected int e = 21;
	protected int f = 32;
	
	//private 
	private int g = 34;
	private int h = 35;
	
	public static void main(String[] args) {
		
		access1 a1 = new access1();
		
		System.out.println(a1.g);
		System.out.println(a1.h);
		
		System.out.println(a1.e);
		System.out.println(a1.f);
		System.out.println(access1.s);
		System.out.println();
		
		
	}
	
}
