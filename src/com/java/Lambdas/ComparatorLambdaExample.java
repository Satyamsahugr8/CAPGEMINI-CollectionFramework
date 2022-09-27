package com.java.Lambdas;

import java.util.Comparator;

public class ComparatorLambdaExample {

	public static void main(String[] args) {
		
		// ***************************************************************************
		Comparator<Integer> compartor =new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				return o1.compareTo(o2);  // 0 o1==o2 // 1 o1>o2 // -1 o1<o2
			}
			
		};
		
		System.out.println(compartor.compare(4, 2));
		
		// ***************************************************************************
		
		// using lambda 
		Comparator<Integer> compartor2 = (Integer a, Integer b)-> {return a.compareTo(b);};
		System.out.println(compartor2.compare(4, 4));
		
		// ***************************************************************************
		Comparator<Integer> compartor3 = (a, b)-> {return a.compareTo(b);};
		System.out.println(compartor3.compare(1, 4));
		

}
}