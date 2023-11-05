package com.java.basicsPractice.stringManupilation;

import java.util.Scanner;
import java.util.regex.*;

public class ValidateEmail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Number Of time you need to test validation");
		int number = scanner.nextInt();
		for(int i = 0 ; i<number ; i++) {
		String input = scanner.nextLine();
		String Regex = "[\\w][a-zA-Z0-9_.]*@gmail[.]com";
		if (input== null &&  input.isEmpty() ) 
		{
			System.out.println("Invalid input");
		}
		else {
			Pattern p = Pattern.compile(Regex);
			Matcher m = p.matcher(input);
		if(m.find() && m.group().equals(input)) 
		{
			System.out.println("Valid");
		}
		else
			{System.out.println("invalid");}
		}
	
}}}
