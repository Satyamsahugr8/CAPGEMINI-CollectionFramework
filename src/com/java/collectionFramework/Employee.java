package com.java.collectionFramework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


class Employeee {
	private int id;
	private String name;
	private int age;
	private long salary;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public long getSalary() {
		return salary;
	}
	public void setSalary(long salary) {
		this.salary = salary;
	}
	public Employeee(int id, String name, int age, long salary) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employeee [id=" + id + ", name=" + name + ", age=" + age + ", salary=" + salary + "]";
	}
	
	
}
public class Employee {
	
	public static void main(String[] args) {
		List<Employeee> employeee = new ArrayList<>();
		employeee.add(new Employeee(10,"Satyam", 22 , 14000));
		employeee.add(new Employeee(20,"Mayank", 21 , 14500));
		employeee.add(new Employeee(30,"Bittu", 23 , 14600));
		employeee.add(new Employeee(40,"Jay", 24 , 14700));
		
		Collections.sort(employeee, new MySort());
		System.out.println(employeee); 
		
		for(Employeee ele : employeee) {
			System.out.println(ele);
			
		}
	}

}

class MySort implements Comparator<Employeee>{
	@Override
	public int compare(Employeee o1,Employeee o2) {
		return (int) (o1.getSalary()-o2.getSalary());
	}
}