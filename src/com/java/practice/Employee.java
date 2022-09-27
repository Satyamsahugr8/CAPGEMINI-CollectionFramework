package com.java.practice;

public class Employee {
	
	int id;
	String name;
	int age;
	

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
	
	public Employee() {
		super();
	}
	
	public Employee(int i, String string, int j) {
		this.id = i;
		this.name = string;
		this.age = i;
	}

	@Override
	public String toString() {
		return "Employee [id = " + id + ", name = " + name + ", age = " + age + "]";
	}
	}

	

