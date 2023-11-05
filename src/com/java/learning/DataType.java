package com.java.learning;

import java.util.Scanner;

public class DataType {

	public static void main(String[] args) {
		
		
		boolean b = true ;
		String s = new String("TrUE");
		
//		int i = new (12);
//		System.out.println(b+" "+s+" "+i);
		
		//linear search
		int[] arr = new int[10]; // array intilization
		Scanner sc = new Scanner(System.in); // input
		
		// entering value in array
		System.out.println("enter the value in array 10 numbers");
		for (int i = 0 ; i < 10 ; i++ ) {
			arr[i] = sc.nextInt();
		}
		
		// enter number which u have to find
		System.out.println("enter number which u have to find");
		int a = sc.nextInt(); 
		int j;
		// logic
		for (j = 0 ; j < 10 ; j++ ) {
			if (arr[j] == a) {
				break;
				}
			}
		int q = j;
		System.out.println(" Found number "+a+ " At index "+j);
		
		
	}
	
	}


