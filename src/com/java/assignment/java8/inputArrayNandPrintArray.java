package com.java.assignment.java8;

import java.util.Scanner;

public class inputArrayNandPrintArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of how much numbers of array u want - ");
		int n = sc.nextInt();
		int[] intArray = new int[n];
		
		// input Array
		for(int i = 0 ; i < n ; i++) {
		   intArray[i] = sc.nextInt();
		}
		for (int i = 0; i < n; i++) {
//			intArray[i].index[0]==1;
		}
		
		
		// Print
		System.out.println("Enter Arrays elements - ");
		for (int i = 0; i < n; i++) {
			System.out.println(intArray[i]);
		}

	}

}
