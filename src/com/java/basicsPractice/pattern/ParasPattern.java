package com.java.basicsPractice.pattern;

import java.util.Scanner;

public class ParasPattern {

	
//     1
//    1 1
//   1 2 1
//  1 3 3 1
// 1 4 6 4 1

	

//	public static void main(String[] args) {
//		
//         1
//        1 1
//       1 2 1
//      1 3 3 1
//     1 4 6 4 1
//		
//		Scanner scanner = new Scanner(System.in);
////		System.out.println("Enter Rows :");
////		int n = scanner.nextInt();
//		
//		int n=5;
//		
//		//first line
//
//		for (int i = 1; i < 2; i++) {
//		for (int j = 1; j <= n+4; j++) {
//					if (j == n) {
//						System.out.print("1");
//					}else {
//						System.out.print("_");
//					}
//					}
//		}
//		
//		System.out.println("");
//		
//		// second to n 
//		
//		for (int h = 2; h <= n; h++) {
//		for (int g = 1; g <= n+4; g++) {
//			
//			if (g == n-h+1 || g==n+h-1 ) {
//				System.out.print("1");
//			}
//			else if( h == 3 ){
//				if(g == 5) {
//					System.out.println("2");
//				}else {
//					System.out.print("_");
//				}
//			}else {
//				System.out.print("_");
//			}
//		}
//		System.out.println("");
//		}
//		
//	}
//	
	
	
	
	
	
	public static void main(String args[]){
		
		int i, j, blankSpace, rows;
		int printNum = 1;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of rows : ");
		rows = sc.nextInt();
		
//		rows = 5;
		
		// no. of rows
		for(i=0; i<rows; i++) {
			
			// no. of space in columns
			for(blankSpace=1; blankSpace <= rows-i-1; blankSpace++) {
				System.out.print(" ") ;
			}
			
			// no. to be printed after spaces
			for(j=0; j <= i; j++) {
				
				// condition to print 1 at first position after spaces
				if ( j==0 || i==0 ) {
					printNum = 1;
					}
				
				// condition to print middle number and last number
				else {
					printNum = printNum*(i-j+1)/j;
					}
				
				System.out.print(printNum + " ");
				}
			
			// changing line after each column
			System.out.print("\n");
			}
		
		
		
	
	}
}

