package com.java.practice;

public class StringEqual {
	public static void main(String[] args) {
		String str1 = new String("hello");
		String str2 = "hello";
		String str3 = "satyam";
		String str4 = "satyam";
		
		// == this operator doesn't work here in string 
		if (str1==str2) { 
		System.out.println("Equals");
		}
//		else if(str3.equals(str4)){
//		System.out.println( "Equal satyam");
//		}
	else 
			System.out.println("hey else");
	}

}
