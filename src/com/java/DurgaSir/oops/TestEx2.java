package com.java.DurgaSir.oops;

abstract class TestEx {
	public int a = 10;
	public final int b = 20;
	public static final int c = 30;

	void disp1() {
		System.out.println("a value is=" + a);
	}
}

public class TestEx2 extends TestEx {
	void disp2() {
		System.out.println("b value is=" + b);
		System.out.println("c value is=" + c);
	}

	public static void main(String[] args) {
		TestEx2 t = new TestEx2();
		t.disp1();
		t.disp2();
	}
}
