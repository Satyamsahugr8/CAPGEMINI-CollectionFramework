package com.java.OopsPolymorphism;

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
	int b;

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
		Animal b = new Dog(); // Animal reference but Dog object

		a.move(); // runs the method in Animal class
		a.display();
		b.move(); // runs the method in Dog class
		b.display();
		b.b=3;
		b.display();
	}
}