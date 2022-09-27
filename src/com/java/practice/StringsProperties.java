package com.java.practice;

import java.util.Scanner;

public class StringsProperties {

	public static void main(String[] args) {
		String s = new String("Satyam"); 
		String q = new String("satyam");
		String e = new String("eee");
		
		
        
        System.out.println("1");
		System.out.println(s.charAt(5)); // m
		System.out.println("2");System.out.println(s.compareTo(q)); // 0 -32
		System.out.println("3");System.out.println(s.concat("q")); // Satyamq
		System.out.println("4");System.out.println(s.concat(q)); // Satyamsatyam
		System.out.println("5");System.out.println(s.indent(3)); // (   Satyam)
		System.out.println("6");System.out.println(s.contentEquals(q)); // false
		System.out.println("7");System.out.println(s.contentEquals("Satyam")); // true
		System.out.println("8");System.out.println(s.contentEquals("satyam")); //false
		System.out.println("9");System.out.println(s.contentEquals("Mayank")); //false
		System.out.println("10");System.out.println(s.contentEquals("Saty")); // false
		System.out.println("11");System.out.println(s.endsWith(q)); //true
		System.out.println("12");System.out.println(s.endsWith("atyam")); //true
		System.out.println("13");System.out.println(s.equals(q)); //true
		System.out.println("14");System.out.println(s.trim()); // remove unwanted space
		System.out.println("15");System.out.println(s.equalsIgnoreCase(q)); //true
		System.out.println("16");System.out.println(s.formatted(e));
		
		String	str	=	"TESTstring";
		System.out.println("17");System.out.println("ConverttoLowerCase: "	+	str.toLowerCase());
		//Convert	to	UpperCase
		System.out.println("18");System.out.println("ConverttoUpperCase: "	+	str.toUpperCase());
		String str2 = "  ";
		String str3 = "";
		System.out.println("19");System.out.println(str2);
		System.out.println("20");System.out.println(str3.isEmpty()); // false::isEmpty is true when length is 0
		System.out.println("21");System.out.println(str2.isBlank()); // true
		System.out.println("22");System.out.println(str.replace("TEST", "FIRST"));
		System.out.println("23");System.out.println(str);
		
		String StringArr = new String("satyam");
		String StringArr1[] = {"Sa","At","Ty","Ya","Am","Ms"};
        
		System.out.println(StringArr);
        System.out.println(StringArr1[3]);
        int Q = StringArr1.length;
        System.out.println(Q);
        
        
        
        
       
        
	}

}
