package com.java.learning.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LambdaExpressionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List <Integer> list = new ArrayList<>();
		//add(element)
		list.add(31);
		list.add(32);
		list.add(30);
		System.out.println(list);
		
		list.forEach((a)->{System.out.println(a);});
		
		//1
//		Collections.sort(list,new MySort());
		
		//2
		//Lambda Expression
		Collections.sort(list,(I1,I2)->(I1>I2)?-1:(I2>I1)?+1:0);
		
		System.out.println(list);
	}

}

//1
//class MySort implements Comparator<Integer>{
//
//	@Override
//	public int compare(Integer I1, Integer I2) {
//		// TODO Auto-generated method stub
//		
//		 return (I1>I2)?-1:(I2>I1)?+1:0;
//			 }
//}



 