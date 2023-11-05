package com.java.basicsPractice;

public class CoreJavaRevisionTestCodingQ3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int arr1[] = new int[4];
		int[] arr1={2,-5,3,9};
		int[] arr2={4,6,8,2};
		
		int[] arr3 = new int[4];
		
		for (int i = 0 ; i<arr3.length ; i++) {
			arr3[i] = arr1[i]*arr2[i];
		}
		
		System.out.print("[");
		for (int i = 0 ; i<arr3.length ; i++) { 
		System.out.print(arr3[i]);
		if (i != (arr3.length-1)) {
		System.out.print(",");}
		}
		System.out.print("]");
	}

}
