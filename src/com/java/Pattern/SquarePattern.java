package com.java.Pattern;

public class SquarePattern {

	public static void main(String[] args) {
		
		System.out.println("Sqaure");

		for (int i = 0 ; i<4 ; i++)
		{
			for (int j = 0 ; j<4 ; j++)
			{
				System.out.print("Q");
			}
			System.out.println("");
	}
		System.out.println("      ");
		System.out.println("Right Triangle");
	
		for (int i = 0 ; i<4 ; i++)
		{
			for (int j = 0 ; j<i ; j++)
			{
				System.out.print("Q");
			}
			System.out.println("");
	}
		System.out.println("      ");
		System.out.println("Left Triangle");
		
		for (int i = 0 ; i<4 ; i++)
		{
			for (int j = 4 ; j>i ; j--)
			{
				System.out.print("Q");
			}
			System.out.println("");
	}
		
		
	}
}
