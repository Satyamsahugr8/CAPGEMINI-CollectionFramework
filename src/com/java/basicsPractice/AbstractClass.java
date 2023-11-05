package com.java.basicsPractice;


// every adaptor classes highly recommeded use abstract 

abstract class A {
	
	abstract void c();
	//contructor
	A() {
		System.out.println("A cons");
	}
}

class B extends A {
	B() {
		System.out.println("B cons");
	}

	@Override
	void c() {
		// TODO Auto-generated method stub
		
	}
}

public class AbstractClass{

	public static void main(String[] args) {
		A a = new B();
//		A aa = new A();
		B b = new B();
	}

}
