package com.java.learning;

import java.util.Scanner;

public class CheckIFelseIF {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String month = sc.nextLine();
		int day = sc.nextInt();
		if(month == "December" && day == 25) {
		    System.out.println("Christmas Day!");
		}
		else if(day==25) {
			System.out.println("day "+day);
		}
		else {
			System.out.println("Normal Day");
		}
		
		
		

	}
}
