package com.java.basicsPractice.pooja;

public class Demo {

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 4, 5 };
		int n = arr.length;

		// reverse New Array
		int ARR[] = new int[n];

		for (int i = 0; i < n; i++) {
			ARR[n - (n - i)] = arr[n - (i + 1)];
		}

		for (int i = 0; i < ARR.length; i++) {
			System.out.print(ARR[i] + " ");
		}
	}
}
