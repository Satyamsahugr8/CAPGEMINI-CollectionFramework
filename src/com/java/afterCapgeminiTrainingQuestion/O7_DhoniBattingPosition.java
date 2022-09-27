package com.java.afterCapgeminiTrainingQuestion;

import java.util.Scanner;

public class O7_DhoniBattingPosition {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("number of the Over when the last wicket fell.");
		int over = sc.nextInt();
		
		System.out.println("ball in the Over when the last wicket fell");
		int balls = sc.nextInt();
		
		System.out.println("Total overs in the innings");
		int totalOver = sc.nextInt();
		
		int calTotalBallsPlayed = (over*6)+balls ;
		int seventyFivePercentageOfToatalBalls = (totalOver*6*3)/4 ;
		
		if(calTotalBallsPlayed > seventyFivePercentageOfToatalBalls) {
			System.out.println("Yes");
		}
		else
			System.out.println("No");
	}

}
