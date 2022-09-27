package com.java.Exception.Handling;

public class EXP {

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		
//		System.out.println("Hello ");
//		System.out.println(10/0);
//		System.out.println("Satyam");
//
//	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Hello ");
		try {
		System.out.println(10/0);
		
		
		}
//		catch(ArithmeticException e) {
//			e.printStackTrace();
//			System.out.println("________");
//			System.out.println(e);
//			System.out.println("________");
//			System.out.println(e.getMessage());
//			System.out.println("________");
//			System.out.println(10/2);
//		}
		catch(NullPointerException e1) {
			e1.printStackTrace();
			}
//		catch(Exception e) {
//			System.out.println("ss");
//		}
		System.out.println("Satyam");

	}

}
