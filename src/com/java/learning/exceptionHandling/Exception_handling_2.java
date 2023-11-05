package com.java.learning.exceptionHandling;

import java.util.Scanner;

// Creating Custom Exception extending to Main class Exception
class Nonegative extends Exception {
	
	String msg;
	
	public Nonegative(String msg) {
	super(msg);
//		System.out.println(msg);
	}
}

public class Exception_handling_2 {

	public static void main(String[] args) throws Nonegative {
		int s;
		Scanner sc = new Scanner(System.in);
		s = sc.nextInt();
		if (s < 0) {
			throw new Nonegative("Number cannot be less than 0");
		} else {
			System.out.println("Number is Positive and Number is:" + s);
		}
//		System.out.println(b);
		
		try {
			int d = 10/0;
		} finally {
			System.out.println("S");
		}

	}

}
