package com.java.DurgaSir.oops;

import java.util.Scanner;

public class StudentData {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Student s1 = new Student();
		Student s2 = new Student("Satyam");
	    Student s3 = new Student("Satyam",64);
		Student s4 = new Student("Sahuji",64,64);
		
		s1.print();
		s2.print();
		s3.print();
		s4.print();
//		s5.print();
		
		
//		s1.name = "Satyam";
//		s1.rollNumber = 64 ;
//		s1.setEn(1);
		
		
//		System.out.println(s1.name +" "+ s1.rollNumber +" "+ s1.getEn());
		
//		s2.name = "Sahuji";
//		s2.rollNumber = 66 ;
//		s2.setEn(2);
		
//		System.out.println(s2.name +" "+ s2.rollNumber +" "+s2.getEn());
		
//		System.out.println("______________________");
		
		
	}

}
