package com.java.assignment.afterCapgeminiTrainingQuestion;

import java.util.Scanner;

public class O6_BattingKeeping {

	public static void main(String[] args) {
		
		System.out.println("Enter Status of the coach (Yes/No)");
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		
		if(str.equalsIgnoreCase("Yes")) {
			System.out.println("Keeping");
		}
		else if(str.equalsIgnoreCase("No")) {
			System.out.println("Batting");			
		}
		else
			System.out.println("Invalid Input");    
	}

}
