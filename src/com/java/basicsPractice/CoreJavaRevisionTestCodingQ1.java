package com.java.basicsPractice;

import java.util.Scanner;

public class CoreJavaRevisionTestCodingQ1 {

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
		System.out.println("Enter element which u hv to find ");
		int f = sc.nextInt();
		for ( int i=0 ; i<n ; i++) {
			if ( f == intArray[i] ) {
				System.out.println(i);
			}
			else {
				System.out.println("Number is not present in the array");
			}
		}
		

	}

}
