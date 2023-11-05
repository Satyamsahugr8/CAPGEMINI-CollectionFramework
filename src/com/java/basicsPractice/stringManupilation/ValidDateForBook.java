package com.java.basicsPractice.stringManupilation;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidDateForBook {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
//			Scanner sc = new Scanner(System.in);
//			String input = sc.nextLine();
			String input = "AB2C02102018";
			String Regex = "[A-Z]{1}[A-Z]{1}[0-9]{1}[A-Z](0?[1-9]|[12][0-9]|3[0]{1})(0?[1-9]|1[012])20(18|19|20)";
			if (input== null &&  input.isEmpty() ) {
				System.out.println("Invalid input");
			}
			else {
			Pattern p = Pattern.compile(Regex);
			Matcher m = p.matcher(input);
			if(m.find() && m.group().equals(input)) {
				System.out.println("Valid");
			}
			else
				System.out.println("invalid");
		}
		
	}
	}