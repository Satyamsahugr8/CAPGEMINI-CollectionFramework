package com.java.learning.multiThreading.arraysThreads;

import java.util.Random;

public class CreatingArrayUsingRandom {
	public static void main(String[] args) {
		
		int[] array;
		array = new int[5000];
		Random ran = new Random();
		for (int i = 0; i < array.length; i++) {
			array[i] = ran.nextInt(50);
			
			if(i==0)
				System.out.print("int[] a = {"+array[i]+",");
			else if(i==(array.length-1))
				System.out.print(array[i]+"};");
			else if(i!=0)
				System.out.print(array[i]+",");
			
		}

	}
}
