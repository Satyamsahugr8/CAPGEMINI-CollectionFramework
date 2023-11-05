package com.java.learning.oops;

class Animal {
	int b;

	public void move() {
		System.out.println("Animals can move");
	}

	public void display() {
		System.out.println(b);
	}
}

class Dog extends Animal {
	int b = 9;

	public void move() {
		System.out.println("Dogs can walk and run");
	}

	public void display() {
		System.out.println(b);
	}
}

public class TestDog {

	public static void main(String args[]) {
		Animal a = new Animal(); // Animal reference and object
		Animal b = new Dog(); // Animal reference but Dog object p c c
		Dog d = new Dog();

		a.move(); // runs the method in Animal class
		a.display();
		
		b.move(); // runs the method in Dog class
		b.display();
		System.out.println("1ssssssss");
		b.display();
		System.out.println("11ssssssss");
		b.b = 4;
		b.display();
		
		
		System.out.println("2ssssssss");
		d.display();
		System.out.println("3ssssssss");
		d.b = 3;
		d.display();
	}
}