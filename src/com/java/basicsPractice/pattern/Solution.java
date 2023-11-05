package com.java.basicsPractice.pattern;

import java.util.Scanner;

public class Solution {
	
	public static void main(String args[]){
		int i, j, space, rows;
		
		int print = 1;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of rows : ");
		rows = sc.nextInt();
		
//		rows = 5;
		
		for(i=0; i<rows; i++) {
			
			for(space=1; space <= rows-i-1; space++) {
				System.out.print(" ") ;
			}
			
			for(j=0; j <= i; j++) {
				
				if (j==0 || i==0) {
					print = 1;
					}
				
				else {
					print = print*(i-j+1)/j;
					}
				System.out.print(print + " ");
				}
			System.out.println("");
			}
		}
}
