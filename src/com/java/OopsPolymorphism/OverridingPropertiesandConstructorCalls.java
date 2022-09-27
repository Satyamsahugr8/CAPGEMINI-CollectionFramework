package com.java.OopsPolymorphism;

// A Simple Java program to demonstrate method overriding in java

// Base Class
class Parent {
	void show() {
		System.out.println("Parent's show()");
	}

	public Parent(int e) {
		System.out.println("Parent constructor in int "+ e );
	}
	
	public Parent() {
		System.out.println("Parent Constructor's is called");
	}
}

// Inherited class
class Child extends Parent {
	// This method overrides show() of Parent
	@Override
	void show() {
		System.out.println("Child's show()");
	}

	
	
	public Child() {
//		super(3);
		super();
		System.out.println("Child Constructor's is called");
	}
	
	
}

// Driver class
public class OverridingPropertiesandConstructorCalls {
	public static void main(String[] args) {
		
		// If a Parent type reference refers to a Parent object, then Parent's show is
		// called
		Parent obj1 = new Parent();
		obj1.show();
		

		System.out.println("---------");


		// If a Parent type reference refers to a Child object Child's show() is called.
		// This is called RUN TIME POLYMORPHISM.
		Child obj2 = new Child();
		obj2.show();
		

		System.out.println("---------");

		
		Parent obj3 = new Child();
		obj3.show();
		
		// ** Cannot Have child reference over parent object
//		 Child obj4 = new Parent();
		
	}
}
