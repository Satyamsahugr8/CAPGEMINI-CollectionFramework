package com.java.arraysThreads;

import java.util.Random;

public class Main {
	
	public double calculateSD(int[] array) {
		double sum = 0.0, standardDeviation = 0.0;
		int length = array.length;

		for (double num : array) {
			sum += num;
		}

		double mean = sum / length;

		for (double num : array) {
			standardDeviation += Math.pow(num - mean, 2);
		}

		return Math.sqrt(standardDeviation / length);
	}

	public static void main(String[] args) {
		
		Main mn = new Main();

		int[] array;
		array = new int[100];
		Random ran = new Random();
		for (int i = 0; i < array.length; i++) {
			array[i] = ran.nextInt(177);
		}
		System.out.print("[");
		for (int num : array) {
			System.out.print(num+",");
		}
		System.out.print("]");
		
		System.out.println("");
		double SD = mn.calculateSD(array);
		System.out.format("Standard Deviation = %.6f", SD);
		

	}

	
}
