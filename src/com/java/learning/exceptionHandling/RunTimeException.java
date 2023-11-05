package com.java.learning.exceptionHandling;

public class RunTimeException {
	
	public static void main(String[] args) {
		
		try {
		//arithematicException
		int a = 10/0;
		
		//NullPointerException
		String s = null;
		System.out.println(s.length());
		
		//NumberFormatException
		String s1 = "abc";
		int i = Integer.parseInt(s1);
		
		//ArrayIndexOutOfBoundsException
		int a1[] = new int[5];
		a1[10] = 50;
		
		} catch(Exception e) {
			System.out.println("exception handed");
		}
		
		
		
	}

}
