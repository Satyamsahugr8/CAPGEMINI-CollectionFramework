package com.java.assignment;

import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first number "); 
		int input1 = sc.nextInt();
		System.out.print("Enter the second number "); 
		int input2 = sc.nextInt();
		int count =0 ,i,j;
		for ( i = input1+1 ; i < input2 ; i++) 
		{
			for (j = 2 ; j < i ; j++) 
			{
				if( i % j == 0 )  
				{
					count = 0;
					break;
					}
				else 
				{
					count = 1;
				}
			}
		if(count == 1) 
		{
			System.out.println(i);
		}
		}
	}

}
