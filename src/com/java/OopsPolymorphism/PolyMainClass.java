package com.java.OopsPolymorphism;

class Parent2 {
	
	int i=0;

	public Parent2() {
		System.out.println("Parent Constructor");
	}

	public void display() {
		System.out.println("Parent display "+i);
	}
}

class Child2 extends Parent2 {
	
	int j = 1;
	
	public Child2() {
		System.out.println("Child Constructor"+ i);
	}
    
	@Override 
	public void display() {
		System.out.println("Child display "+j);
	}

}

public class PolyMainClass {
	public static void main(String[] args) {
		
		Parent2 p = new Parent2();
		p.display();
		
		
		System.out.println("------");
		Child2 c = new Child2();
		c.display();
		
		
		System.out.println("------");
		Parent2 p2 = new Child2();
		p2.display();
		
//		Child2 c2 = new Parent2(); 

	}

}
