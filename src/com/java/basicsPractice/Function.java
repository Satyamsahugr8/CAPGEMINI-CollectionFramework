package com.java.basicsPractice;

import java.util.Scanner;

public class Function {

	static int func(int a) {
		Scanner sc= new Scanner(System.in);
		int q =sc.nextInt();
//		System.out.println(q);
		return q;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = func(a);
		System.out.println(b);
	}
	
}


