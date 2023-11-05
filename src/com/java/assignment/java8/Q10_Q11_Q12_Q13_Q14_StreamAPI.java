package com.java.assignment.java8;

import java.util.*;
import java.util.stream.Collectors;

public class Q10_Q11_Q12_Q13_Q14_StreamAPI {

	public static void main(String[] args) {
//		List <Integer> list = new ArrayList<>();
		List <Integer> listArray = Arrays.asList(10,1,2,2,1,3,4,4,5,346,34,34);
		System.out.println("listArray ="+listArray);
		
		System.out.println(".Sorted() ="+
		listArray.stream().sorted().collect(Collectors.toList()));
		System.out.println("listArray ="+listArray);
		
		System.out.println(".sorted(Collections.reverseorder()) ="+
		listArray.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList()));
		System.out.println("listArray ="+listArray);
		
		System.out.println(".limit(6) ="+
		listArray.stream().limit(6).collect(Collectors.toList()));
//		System.out.println("listArray ="+listArray);
		
		System.out.println(".sorted().limit(6) ="+
		listArray.stream().sorted().limit(6).collect(Collectors.toList()));
//		System.out.println("listArray ="+listArray);
		
		System.out.println(".skip(5) ="+
		listArray.stream().skip(5).collect(Collectors.toList()));
//		System.out.println("listArray ="+listArray);
		
		System.out.println(".sorted().skip(5) ="+
		listArray.stream().sorted().skip(5).collect(Collectors.toList()));
//		System.out.println("listArray ="+listArray);
		
		System.out.println(".sorted().distinct() ="+
		listArray.stream().sorted().distinct().collect(Collectors.toList()));
//		System.out.println("listArray ="+listArray);
		
		System.out.println(".distinct() ="+
		listArray.stream().distinct().collect(Collectors.toList()));
//		System.out.println("listArray ="+listArray);
		
	}
}
