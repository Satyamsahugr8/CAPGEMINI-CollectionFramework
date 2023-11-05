package com.java.assignment.java8;

public class BasicQuestion {

	public static void main(String[] args) {
		  String s = "Hello";
		  String[] ss = {"Hello","World"};
		  modify(s,ss);
		  System.out.println(s +" "+ ss[1]);
		 }
		 
		 public static void modify(String s,String[] ss)
		 {
		  s="Hey";
		  ss[1]="Universe";
		 }
		

	}
	


