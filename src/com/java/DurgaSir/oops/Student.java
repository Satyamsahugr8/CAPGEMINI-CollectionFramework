package com.java.DurgaSir.oops;

public class Student {

	private static final int Null = 0;
	String name;
	int rollNumber;
	private int enroll;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}

	public int getEnroll() {
		return enroll;
	}

	public void setEnroll(int enroll) {
		this.enroll = enroll;
	}

	public static int getNull() {
		return Null;
	}

	public Student() {
		this.name = "Null";
		this.rollNumber = Null;
		this.enroll = Null;
	}

	public Student(String string) {
		this.name = string;
	}
	
	public Student(String n, int num) {
		this.name = n;
		this.rollNumber = num;
		this.enroll = 0;
	}
	
	public Student(String n, int num, int En) {
		this.name = n;
		this.rollNumber = num;
		this.enroll = En;
	}

	public void print() {
		System.out.println(name + " " + rollNumber + " " + enroll);
	}

}
