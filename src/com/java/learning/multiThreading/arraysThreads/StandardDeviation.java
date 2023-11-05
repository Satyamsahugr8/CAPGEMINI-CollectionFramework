package com.java.learning.multiThreading.arraysThreads;

class StandardDeviation {
	
	double Sd;
	double standardDeviationAdd = 0.0;

	//used synchronized because ( at a time only one thread works )
	public synchronized void calSd(int num, double mean, int length) {
		standardDeviationAdd = standardDeviationAdd + Math.pow(num - mean, 2);
		Sd = Math.sqrt(standardDeviationAdd / length);
	}
}