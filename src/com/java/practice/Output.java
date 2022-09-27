package com.java.practice;

class Output1 {
	int a;
	int b;
	
//	constructor
	Output1(int i, int j) {
		a = i;
		b = j;
		}
	
//	method
	void meth(Output1 obj) {
		obj.a *= 2;
		obj.b /= 2;
	}
	
}

public class Output {
	
	public static void main(String args[]) {
		Output1 obj = new Output1(10, 20);
		obj.meth(obj);
		System.out.println(obj.a + " " + obj.b);
	}
}