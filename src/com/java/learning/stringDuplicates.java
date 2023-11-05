package com.java.learning;

import java.util.Scanner;

public class stringDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string: ");  
		String s = sc.next();
//		String[] sArr = new String[];
//		System.out.print(sArr);  
		char[] sArray = s.toCharArray();
//		System.out.println(sArray);
		int counter = 0;
		
		for (int i = 0; i < (sArray.length) ; i ++ ) {
		for (int j = i+1; j < (sArray.length - 1) ; j ++ ) {
			if (sArray[i] == sArray[j]) {
				counter += 1;
			};
		
		}
		if (counter >= 1 ) {
			System.out.println(" String Have duplicate "+ sArray[i]);
			counter = 0; 
		}	 
		}
//        System.out.println("String : " + s);
//        System.out.print("String array : [ ");
// 
//        // Iterating over the string
//        for (int i = 0; i < strArray.length; i++) {
//            // Printing the elements of String array
//            System.out.print(strArray[i]);
//        }
// 
//        System.out.print("]");
		
	}
}
