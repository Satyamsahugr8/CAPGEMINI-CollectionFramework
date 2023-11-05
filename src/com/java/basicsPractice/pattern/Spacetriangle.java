package com.java.basicsPractice.pattern;

public class Spacetriangle {

	public static void main(String[] args) {
		int rows = 5;
		for (int i = 0; i < rows; i++) {
			// no. of space in columns
			for (int blankSpace = 1; blankSpace <= rows - i - 1; blankSpace++) {
				System.out.print("_");
			}
			// changing line after each column
			System.out.print("\n");
		}

	}

}
