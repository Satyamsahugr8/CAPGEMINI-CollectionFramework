package com.java.basicsPractice.pattern;

import java.util.Scanner;

public class RitikPattern {

	public static void main(String[] args) {

//		__*__
//		_***_
//		*****

		Scanner scanner = new Scanner(System.in);
		System.out.println("enter Odd number to draw a pramid");
		int N = scanner.nextInt();
		
		if (N%2 == 0) {
			System.out.println("Entered number is even, Enter an Odd number");
		    N = scanner.nextInt();
		}
		
		int h = (N / 2) + 1;
//		int hn = h+1;
		int t = N + 1;
//		System.out.println(h);

		for (int i = 1; i <= N; i++) {
			if (i % 2 != 0) {
//			System.out.print(i);
				for (int j = 1; j <= N; j++) {
					if (j == h) {
						for (int k = 1; k <= i; k++) {
							System.out.print("*");
						}
						h--;
					} else if (j < t) {
						System.out.print(" ");
						
					}
					}
					t = t - 2;

				}
			else
				System.out.println("");
			}
		scanner.close();
		}

	}
