package com.java.practice;


class static_use {
	
	static int x;
	static int y;

	static void add(int a, int b) {
		x = a + b;
		y = x + b;
		System.out.println(x);
		System.out.println(y);
	}
	public static void main(String args[]) {
		
		int a = 2;
		add(a, a + 1);
		add(5, a);
		
	}

	
}