package com.java.learning.Interface;

import java.util.ArrayList;
import java.util.List;

public class lambdaInterfaceExample {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(4);
		list.add(3);
		list.add(5);
		list.add(6);
		list.add(7);

		list.forEach(n -> System.out.println(n));

		// anonymous inner class
		
		// without lambda expression
		
		lambdaInterface obj = new lambdaInterface() {

			@Override
			public String draw(String a) {
			return "a = " + a;

			}
		};
		obj.draw("satyam");

		
		
		// Using Lambda Expression 1

		lambdaInterface obj2 =(a)->{return "a = "+a;};	
		obj2.draw("sahu");

		
		
		
		// Using Lambda Expression 2

		lambdaInterface obj1 = (name) -> {
			return "hey " + name;
		};
		System.out.println(obj1.draw("Akash"));
	}
}
