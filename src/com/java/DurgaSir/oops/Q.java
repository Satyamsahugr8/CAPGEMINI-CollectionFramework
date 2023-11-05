package com.java.DurgaSir.oops;

class Aa {
	void money() {
		System.out.println("A class money");
	}
}

class B extends Aa {

	void money() {
		System.out.println("B class money");
	}
}

class Q extends B {

	public static void main(String[] args) {
		Q c = new Q();
		c.money(); // which method executed A--->money() or B--->money()   // B

	}
}
