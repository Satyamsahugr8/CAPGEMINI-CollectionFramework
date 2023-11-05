package com.java.assignment.java8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class Array_List {

	public static void main(String[] args) {

		List <Integer> list = new ArrayList<>();
		//add(element)
		list.add(31);
		list.add(32);
		list.add(33);
		System.out.println("list 1 is "+list); //[31, 32, 33]
		
		//add(index , element)
		list.add(3, 40);
		System.out.println("list 1 is "+list); //list 1 is [31, 32, 33, 40]
		list.add(3, 43);	//insert at index 3	
		System.out.println("list 1 is "+list); //list 1 is [31, 32, 33, 43, 40]
		
		List <Integer> list2 = new ArrayList<>();
		list2.add(1);
		list2.add(2);
		list2.add(3);
		list2.add(4);
		System.out.println("list 2 is "+list2); //list 2 is [1, 2, 3, 4]
		
		//addAll(listName)
		list.addAll(list2);
		System.out.println("list 1(1+2) is updated to "+list); //list 1(1+2) is updated to [31, 32, 33, 43, 40, 1, 2, 3, 4]
		
		//list 1(list 1+list 2) is updated to [31, 32, 33, 43, 40, 1, 2, 3, 4]
		//remove(index)
		list.remove(4); // 40 removed
		System.out.println("list 1 is "+list); //list 1 is [31, 32, 33, 43, 1, 2, 3, 4]
		
		//remove(Integer.value.of)
		list.remove(Integer.valueOf(43));
		list.remove(Integer.valueOf(40));
		System.out.println("list 1 is "+list); //list 1 is [31, 32, 33, 1, 2, 3, 4]
		
		list.add(33);
		list.add(32);
		System.out.println("list 1 is "+list);  //list 1 is [31, 32, 33, 1, 2, 3, 4, 33, 32]
		
		
		// list 1 is [31, 32, 33, 1, 2, 3, 4, 33, 32]
		
		// set(index,element) 
		//setting value
		list.set(5, 54);
		list.set(6, 55);
		list.set(7, 56);
		list.set(8, 57);
		System.out.println(list);  // [31, 32, 33, 1, 2, 54, 55, 56, 57]
		
		//size()
		System.out.println(list.size()); //9
		
		
		//Using for loop
		for(int i=0 ; i< list.size() ; i++) {
		System.out.print(list.get(i)+","); //31,32,33,1,2,54,55,56,57,
		}

		System.out.println("");
		
		//Using Iterator
		Iterator it = list.iterator();
		while(it.hasNext()) {
			System.out.print(it.next()+","); //31,32,33,1,2,54,55,56,57,
		}
		
		System.out.println("");
		
		//Using foreach
		for(Integer element : list) {
			System.out.print(element+","); //31,32,33,1,2,54,55,56,57,
		}
		
		System.out.println("");
		
		//null value check 
		list.add(null);
		System.out.println(list);  //[31, 32, 33, 1, 2, 54, 55, 56, 57, null]
		
		int a = list.size();
		list.remove(a-1);
		System.out.println(list); //[31, 32, 33, 1, 2, 54, 55, 56, 57]
		
		
		
		
	

}}
