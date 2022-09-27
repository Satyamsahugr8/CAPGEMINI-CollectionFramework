package com.java.StringManupilation;

public class TestParsingStringToInt {

	public static void main(String[] args) {
		
        // s1<s2 +ve
		// s1==s2 0
		// s1>s2 -ve

		String name1 = "cony";
		String name2 = "conye";
		System.out.println(name1.compareTo(name2));
		
		//parsing
	    String str = "121";
	    int number = Integer.parseInt(str);
	    System.out.println(number);

}

}
