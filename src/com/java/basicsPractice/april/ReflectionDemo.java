package com.java.basicsPractice.april;

class Dog {
	String name;
	
}



public class ReflectionDemo {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		
		Class a = Class.forName("Dog");
		
		Dog d = new Dog();
		
		Dog b = Dog.class.newInstance();

	}

}
