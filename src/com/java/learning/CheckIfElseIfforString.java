package com.java.learning;

import java.util.Scanner;

public class CheckIfElseIfforString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String month = sc.next();
		System.out.println(month);
		String a = "december";
		if(!month.equals(a)) {
			System.out.println("Christmas Day!");
		}else
		{
			System.out.println("Not Christmas Day!");
		}
		System.out.println(month);
		
	}

}
