package com.java.collectionFramework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


class Student{
	String student_firstName;
	String Student_lastName;
	int Student_rollNo;
	public String getStudent_firstName() {
		return student_firstName;
	}
	public void setStudent_firstName(String student_firstName) {
		this.student_firstName = student_firstName;
	}
	public String getStudent_lastName() {
		return Student_lastName;
	}
	public void setStudent_lastName(String student_lastName) {
		Student_lastName = student_lastName;
	}
	public int getStudent_rollNo() {
		return Student_rollNo;
	}
	public void setStudent_rollNo(int student_rollNo) {
		Student_rollNo = student_rollNo;
	}
	public Student(String student_firstName, String student_lastName, int student_rollNo) {
		super();
		this.student_firstName = student_firstName;
		Student_lastName = student_lastName;
		Student_rollNo = student_rollNo;
	}
	
	
}

public class ArrayListOperationUsingStreamsAPI {

	public static void main(String[] args) {
		
		ArrayList <Integer> list = new ArrayList<>();
		
		//add(element)
		list.add(1);
		list.add(2);
		list.add(0);
		list.add(10);
		list.add(30);
		list.add(25);
		list.add(33);
		
		System.out.println(list);
		
		//filter
		List<Integer> evenList = list.stream().filter(i->i%2==0).collect(Collectors.toList());
		System.out.println(evenList);
		
		List<Integer> oddList = list.stream().filter(i->i%2!=0).collect(Collectors.toList());
		System.out.println(oddList);
		
		//map
		List<Integer> updateList = list.stream().map(i->i+5).collect(Collectors.toList());
		System.out.println(updateList);
		
		List<Integer> studentlist = Arrays.asList(12,23,34,45,56,76,87,98,90,100);
		
		
		List<Integer> studentlist1 = new ArrayList<Integer>();
		List<Student> studentlist2 = new ArrayList<>();
		boolean stu = studentlist2.add(new Student("Satyam","Sahu",64));
		System.out.println(stu);
		
		
		

	}

}
