package com.java.learning.multiThreading.arraysThreads;

class Array extends Thread {

	int[] arr = new int[]{ 1,2,3,4,5,6,7,8,9,10 }; 
	
//	// Declaring array literal
//	int [] arr = new int[]{
//			78,41,176,37,121,7,3,175,169,79,48,132,12,1,153,
//			90,171,164,17,13,87,100,45,122,99,109,87,54,93,89,
//			111,39,73,120,52,43,104,37,12,160,46,64,58,166,143,
//			68,30,9,156,121,169,26,121,141,7,153,99,52,59,110,
//			165,64,36,80,129,79,69,103,115,59,145,27,109,131,64,
//			3,49,144,115,176,33,36,17,31,90,118,75,174,70,150,
//			21,54,123,164,135,175,152,0,101,13 };
	
	public void run() {
		for(Integer ar:arr)
		{
			System.out.print(ar+",");
			}
		}
}

public class SdUsingMultipleThreading {

	public static void main(String[] args) {
		Array arr = new Array();
		Array arr2 = new Array();
		arr.start();
		arr2.start();
		
		

	}

}
