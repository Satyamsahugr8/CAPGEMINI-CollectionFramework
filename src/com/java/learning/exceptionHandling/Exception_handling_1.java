package com.java.learning.exceptionHandling;

import java.util.Scanner;

// Creating Custom Exception extending to Main class Exception
class No_negative extends Exception {
	String msg;

	public No_negative(String msg) {
		super(msg);
	}
}

public class Exception_handling_1 {

	public static void main(String[] args) throws No_negative {
		int b;
		Scanner sc = new Scanner(System.in);
		b = sc.nextInt();
		check(b);
//		System.out.println(b);

	}

	public static void check(Integer s) throws No_negative {
		if (s < 0) {
			throw new No_negative("Number cannot be less than 0");
		} else {
			System.out.println("Number is Positive " + s);
		}
	}

}
