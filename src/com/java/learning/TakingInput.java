package com.java.learning;

import java.util.Scanner;

public class TakingInput {

	public static void main(String[] args) {
		
//		int a,b;
		
		Scanner s = new Scanner(System.in);
		
//		a = s.nextInt();
//		b = s.nextInt();
//		int c = a + b ;
//		System.out.println(c);
		
		String S = s.next();// input abse sd fe  # output abse , but is possible using nextline();
//		String a = s.nextLine();
		char C = S.charAt(0);
		
		
		System.out.println(C); 
//		System.out.println(a); 
	}

}
