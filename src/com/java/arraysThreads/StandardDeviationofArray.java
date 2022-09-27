package com.java.arraysThreads;

//import java.math.RoundingMode;
//import java.text.DecimalFormat;

public class StandardDeviationofArray {

	public static void main(String[] args) {
		
		// To find the standard deviation of any given set of data 
		// We should have some Pre-requisite 1st given SET(Array) of data , MEANS of the data , LENGTH of the data.
        // lets take arr as our Array
		
		int[] arr = new int[] { 78, 41, 176, 37, 121, 7, 3, 175, 169, 79, 48, 132, 12, 1, 153, 90, 171, 164, 17, 13, 87,
				100, 45, 122, 99, 109, 87, 54, 93, 89, 111, 39, 73, 120, 52, 43, 104, 37, 12, 160, 46, 64, 58, 166, 143,
				68, 30, 9, 156, 121, 169, 26, 121, 141, 7, 153, 99, 52, 59, 110, 165, 64, 36, 80, 129, 79, 69, 103, 115,
				59, 145, 27, 109, 131, 64, 3, 49, 144, 115, 176, 33, 36, 17, 31, 90, 118, 75, 174, 70, 150, 21, 54, 123,
				164, 135, 175, 152, 0, 101, 13 };

		System.out.println("Standard deviation = " + calculateStandardDeviation(arr)); // 52.755544732283816
		
//		DecimalFormat df = new DecimalFormat("#.####"); df.setRoundingMode(RoundingMode.CEILING);
//		System.out.println("Standard deviation = "+ df.format(calculateStandardDeviation(arr)));    //52.7556
		
	}

	
	
	
	public static double calculateStandardDeviation(int[] array) {

		double sum = 0.0;
		double standardDeviation = 0.0;
		int length = array.length;  // taking length of array

		// using this for loop adding all integer to sum
		for (double num : array) {
			sum = sum + num;
		}
		
		// after sum finding means of array = sum/length
		double mean = sum / length; 

		// this loop is for adding all StandardDeviation of array (NOTE: this is not the actual StandardDeviation) 		
		for (double num : array) {
			standardDeviation = standardDeviation + Math.pow(num - mean, 2); 
		}

		// this is after full adding of standardDeviation we will divide it with length and take sqrt to find the actual Standard Deviation (SD)
		double SD = Math.sqrt(standardDeviation / length); 

		return SD;
	}
}
