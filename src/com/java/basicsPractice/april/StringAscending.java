package com.java.basicsPractice.april;

public class StringAscending {

	public static void stringAscendingChar(String str) {

		char temp;
		char[] ch = new char[str.length()];

		for (int i = 0; i < ch.length; i++) {
			ch[i] = str.charAt(i);
		}
		
		System.out.println(ch);
		
		for (int i = 0; i < ch.length; i++) {

			for (int j = 0; j < ch.length; j++) {

				if (ch[i] < ch[j]) {

					temp = ch[i];
					ch[i] = ch[j];
					ch[j] = temp;
					
				}
			}	
		}
		
		System.out.println(ch);

		String string = new String(ch);
		System.out.println(string);
	}

	public static void main(String[] args) {
		String str = "hello";
		stringAscendingChar(str);
	}

}
