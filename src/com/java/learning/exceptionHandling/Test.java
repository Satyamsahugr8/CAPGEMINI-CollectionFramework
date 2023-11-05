package com.java.learning.exceptionHandling;

import java.util.Scanner;

//public class Test {

//
//	public static void main(String[] args) {
//		doStuff();
//		System.out.println(10 / 0);
//	}
//
//	public static void doStuff() {
//		doMoreStuff();
////		System.out.println(10/0);
//		System.out.println("Hellooo2");
//	}
//
//	public static void doMoreStuff() { // Method is responsible to create exception object
////	try	{
////		System.out.println(10/0);
//		System.out.println("Hello");
//	}
////		} catch (Exception e) {
////			System.out.println("Exception e");
////	finally {
////		System.out.println("finally");
////	}
////	}
//}

public class Test {
	static void validate(int age) {
		if (age < 18) {
//creating Exception object by user & handover to Jvm
			throw new ArithmeticException("not eligible for vote");
		} else {
			System.out.println("welcome to the voting");
		}
	}

public static void main(String[] args) {
	
	Scanner s = new Scanner(System.in);
	System.out.println("please enter your age ");
	int n = s.nextInt();
	validate(n);
	System.out.println("rest of the code");
	}
}