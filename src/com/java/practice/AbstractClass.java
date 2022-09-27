package com.java.practice;


// every adaptor classes highly recommeded use abstract 

abstract class A {
	A() {
		System.out.println("A cons");
	}
}

class B extends A {
	B() {
		System.out.println("B cons");
	}
}

public class AbstractClass{

	public static void main(String[] args) {
		A a = new B();
//		A aa = new A();
		B b = new B();
	}

}
