package com.java.assignment;

import java.util.Scanner;

import com.java.assignment.NegativeSizeException;

class NegativeSizeException extends Exception {
	String msg;

	public NegativeSizeException(String msg) {
		super(msg);

	}
}

public class Q3 {
	public static void main(String[] args) throws NegativeSizeException {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the Array - ");
		int n = sc.nextInt();
		check(n);
		int[] intArray = new int[n];
		System.out.println("Enter Array elements - ");
		for (int i = 0; i < n; i++) {
			intArray[i] = sc.nextInt();
//				check(intArray[i]);
		}
//		System.out.println();
		for (int i = 0; i < n; i++) {
			if (i == 0)
				System.out.print("[" + intArray[i]+",");
			else if (i != (n - 1))
				System.out.print(intArray[i] + ",");
			else
				System.out.println(intArray[i] + "]");
//				check(intArray[i]);
		}
	}

	public static void check(int number) throws NegativeSizeException {
		if (number < 0)
			throw new NegativeSizeException("Number cannot be less than 0");
		else
			System.out.println("You Have entered a Correct number.");

	}

}
