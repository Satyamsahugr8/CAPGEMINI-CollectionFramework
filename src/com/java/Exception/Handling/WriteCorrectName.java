package com.java.Exception.Handling;

import java.util.Scanner;

public class WriteCorrectName {

	public static void main(String[] args) throws WriteCorrectNameSatyamException {
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		if (!name.equals("Satyam Sahu")) {
			throw new WriteCorrectNameSatyamException("name is not equal to Satyam Sahu");
		}
		else
			System.out.println("Satyam Sahu = "+name);

	}

}

class WriteCorrectNameSatyamException extends Exception {
	int msg;

	public WriteCorrectNameSatyamException(String msg) {
		super(msg);
	}
}