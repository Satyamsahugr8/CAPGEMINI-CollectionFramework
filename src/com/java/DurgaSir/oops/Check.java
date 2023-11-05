package com.java.DurgaSir.oops;

//  case 1:-[abstract method to normal method]

abstract class Testq {
	abstract void m1();
};

class Test1q extends Testq {
	void m1() {
		System.out.println("m1 method");
	}
}

//  case 2:-[normal method to abstract method]

class Testqq {
	void m1() {
		System.out.println("Testqq");
	}
}

abstract class Test1qqq extends Testq {
	abstract void m1();
}

public class Check extends Test1qqq {

	@Override
	void m1() {
		System.out.println("Test1qqq");

	}

	void m2(int n, boolean g) {
		System.out.println(n + " " + g);
	}

	public static void main(String[] args) {
		Test1qqq c = new Check();
		c.m1();
		((Check) c).m2(0, false);

		System.out.println("::::::::::::::::::::::::::::");

		Testqq t = new Testqq();
		t.m1();

		System.out.println("::::::::::::::::::::::::::::");
		
		// NOT ALLOWED
//		Testqq t2 = new Check();

		
	}
}
