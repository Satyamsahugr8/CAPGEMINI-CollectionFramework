package com.java.DurgaSir.oops;

public class MultiDimensionalArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("TwoDimentionArray ");
		int[] arr[] = new int[3][3];

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {

				System.out.print(arr[i][j]);
			}
			System.out.println("");

		}
		
		System.out.println(arr.length);
		
		System.out.println("ThreeDimentionArray ");

		int[] arr2[][] = new int[3][3][3];

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				for (int k = 0; k < 3; k++) {
					System.out.print(arr2[i][j][k]);
				}
				if (j != 2) {
					System.out.print(",");
				}
			}
			System.out.println("");
		}
		System.out.println(arr2.length);

	}
}