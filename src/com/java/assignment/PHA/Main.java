package com.java.assignment.PHA;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Mode1Impl m1 = new Mode1Impl();
		Mode2Impl m2 = new Mode2Impl();

		int i = 0;
		// just a loop which never end but using break keyword we can go out of our
		// loop.
		while (i == 0) {
			
			System.out.println("Enter '1' to display MODE \n" + "Enter '2' to edit MODE \n"
				+ "Enter '3' to TOGGLE MODE \n" + "Enter '0' to EXIT");

			int choose = sc.nextInt();

			switch (choose) {
			case 1:
				System.out.println("MODE 1");
				m1.display2();
				break;

			case 2:
				System.out.println("EDIT");
				m1.edit(m2,m1);
				break;
				
			case 3:
				System.out.println("MODE 2");
				m1.togglemode(m2,m1);
				break;
				
			case 0:
				System.out.println("\nBYE");
				i=1;
				break;

			default:
				break;

			} // switch ends

		} // for loop ends

	}

}
