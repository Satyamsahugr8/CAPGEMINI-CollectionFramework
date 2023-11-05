package com.java.DurgaSir.oops;


class A {
	int a;
	private int b;
	A aa;
	String s;
	float f;
	double d;
	long l;
	short ss;

	@Override
	public String toString() {
		return "A [a=" + a + ", b=" + b + ", aa=" + aa + ", s=" + s + ", f=" + f + ", d=" + d + ", l=" + l + ", ss="
				+ ss + "]";
	}	
}

public class TestConst {
	public static void main(String[] args) {
	
		A a = new A();
		
		System.out.println("a = "+a.a);
		
		System.out.println(a);
		
	}	
}
