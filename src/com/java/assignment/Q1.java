package com.java.assignment;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {

		while (true) {
			Scanner sc = new Scanner(System.in);
			int n, Deposit, Balance = 0, WithDraw;
			System.out.println("Enter 1 : To Deposit amount \nEnter 2 To Withdraw \nEnter 3 To check your Balance");
			n = sc.nextInt();
			switch (n) {
			case 1: {
				System.out.println("Enter the amount u have to deposit - ");
				Deposit = sc.nextInt();
				Balance += Deposit;
			}
			case 2: {
				System.out.println("Enter the amount u have to withdraw - ");
				WithDraw = sc.nextInt();
				Balance -= WithDraw;
			}
			case 3: {
				System.out.println("Your current balance is - " + Balance);
			}
			default: {
				System.out.println("Invalid number entered");
			}
			}
			}
		}
	}
