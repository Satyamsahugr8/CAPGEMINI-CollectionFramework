package com.java.learning.oops;


class BirdOne {
	public void fly() {
		System.out.println("hello Parent");
		}
	}
class ChildBird extends BirdOne {
	public void fly() {
		 System.out.println("Hello child");
		 }
}

public class Bird {
	
	public static BirdOne createBird(int a) { 
		if (a == 0) {
			BirdOne b = new BirdOne();
			return b;
			} else {
				ChildBird b1 = new ChildBird();
				return b1;
				}
		}

	public static void main(String[] args) {
			BirdOne b = createBird(2);
		    b.fly();
			}
		}




