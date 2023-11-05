package com.java.basicsPractice;

import java.util.Iterator;

public class ReverseString {
	
	public static void reverseString(String s) {
//		StringBuffer d;
		for (int i = 0; i < s.length()/2; i++) {
			
		}
	}
	
	public static void PalindromeCheck(String s) {
		boolean count = true;
		for (int i = 0; i < s.length()/2; i++) {
			if(s.charAt(i) == s.charAt(s.length()-(i+1))) {
				count = false;
			} else count = true;
		}
		
		if(count == false) {
			System.out.println("saaaaaas");
		} else System.out.println("NOoo");
	}
	
	public static void main(String[] args) {
		
		// TASK
		// SATYAM = MAYTAS
		// 012345 = 543210
		
		String str = "SATAYAM";
		
		String s = "SAAS";
		
		reverseString(s);
		
		int strlength = str.length();
		
		System.out.println(strlength);
		
		char [] ch = new char[strlength];
		
		for (int i = 0; i < ch.length; i++) {
			ch[i] = str.charAt(ch.length-(i+1));
		}
		
		
        //for printing char array items
//		for (char c : ch) {
//			System.out.print(c);
//		}
		
		
		
		
		// 1 way
		
//		StringBuilder sb = new StringBuilder();
//		for (int i = 0; i < ch.length; i++) {
//	            sb.append(ch[i]);
//	        }
//		String str2 = sb.toString();
//		System.out.println(str2);
		
		
		
		
		// 2 way
		
		String string = new String(ch);
		System.out.println(string);
 	
	}

}
