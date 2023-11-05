package com.java.learning;

import java.util.Scanner;

public class inputArrayOutputMultipleofTen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of how much numbers of array u want - ");
		int n = sc.nextInt();
		int[] intArray = new int[n];
		System.out.println("Enter Arrays elements - ");
		for ( int i=0 ; i<n ; i++) {
			intArray[i] = sc.nextInt();
		}
		
		// Here we have a array intArray with input
		for ( int i=0 ; i<n ; i++) {
			if ( intArray[i] > 7 ) {
				intArray[i] = intArray[i]*10;
			}
		}
		for ( int i=0 ; i<n ; i++) {
		System.out.println(intArray[i]);

	}
	}
}
