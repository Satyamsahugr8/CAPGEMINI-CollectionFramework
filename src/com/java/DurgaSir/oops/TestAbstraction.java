package com.java.DurgaSir.oops;


abstract class Test {
	
	abstract void m1();
	abstract void m2();
	abstract void m3();
	
	void m4() {
		System.out.println("m4 method");
		}
}

abstract class Test1 extends Test {
	
	void m1() {
		System.out.println("m1 method");
		}
	abstract void m5();
}

abstract class Test2 extends Test1 {
	
	void m2() {
		System.out.println("m2 method");
		}
}


class TestAbstraction extends Test2 { 
	void m3() {
		System.out.println("m3 method");
		}
	void m5() {
		System.out.println("m5 method");
	}
	
public static void main(String[] args) { 
	TestAbstraction t = new TestAbstraction();
	t.m1();
	t.m2();
	t.m3();
	t.m4();
	t.m5();
}


}