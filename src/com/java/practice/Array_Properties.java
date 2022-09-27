package com.java.practice;

public class Array_Properties {

	public static void main(String[] args) {

		int Arr[] = { 1, 2, 3, 4, 5 };
		String Srr[] = {"Satyam","Mayank","Sonu"};

		int ArrClone[] = Arr.clone();

		// input array Arr
		for (int i = 0; i < Arr.length; i++) {
			System.out.println(Arr[i]);
		}

		System.out.println("____________");

//		reading ArrClone
		for (int i = 0; i < Arr.length; i++) {
			System.out.println(ArrClone[i]);
		}
		System.out.println("____________");
		
		
		System.out.println(Arr.equals(ArrClone));
	    
		System.out.println(Arr.length);
		
//		reading Srr
		for (int i = 0; i < Srr.length; i++) {
		System.out.println(Srr[i]);
		}
		
		System.out.println("______________");
		
//		String iw = Srr.toString();
//		System.out.println(iw);
		
		for (int i = 0; i < Srr.length; i++) {
			System.out.println(Srr[i]);
			}
		
		System.out.println(Srr.length);
		

	}
}
