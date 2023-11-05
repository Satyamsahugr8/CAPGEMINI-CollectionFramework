package com.java.learning;

public class Exceptionhandle {

	public static void main(String[] args) {

		try {
			int divideByZero = 5 / 0;
			System.out.println(divideByZero);
			System.out.println("Rest of code in try block");
		}

		catch (ArithmeticException e) {
			System.out.println("ArithmeticException => " + e.getMessage());
//			System.out.println();
		}

		try {
//		System.out.println("Satyam");
//		Scanner sx = new Scanner(System.in);
//		System.out.println(10/0);
			String s = null;
			int n = s.length();
		} catch (NullPointerException e) { // e.printStackTrace();
//			System.out.println(e);
//			System.out.println(10/2);
		} catch (Exception e1) {
//			e1.printStackTrace();
		}
		System.out.println("rest of the app");
	}
}
