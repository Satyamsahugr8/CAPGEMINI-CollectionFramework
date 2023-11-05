package com.java.learning.oops;

public class Childd extends Parentt {
	
	void property(){
		System.out.println("Child property");
		}
	
	void marry() {
		System.out.println("Child marry"); //overriding method
		}
	
	void sex() {
		System.out.println("Sex of child");
	}
	
	public static void main(String[] args){ 
	
	Childd c = new Childd();
	c.property();             //Child property
	c.marry();                //Child marry
	c.sex();                  //Sex of child

	System.out.println("--------------");
	
	Parentt p = new Parentt();  
	p.property();             //money+land+house   
	p.marry();                //black girl
	
	System.out.println("--------------");
	
	Parentt P = new Childd(); 
	P.property();
	P.marry();
	
	// it is not accessible because compiler check parent class if sex method is present 
	// or not if it is not present then compile time error will be generated
	// 
	// Hence when only overridden method is possible for parent type reference of child type object
	
    // Based on above point we can say by using parent reference it is possible to call only overriding 
    // methods (m1 () ) of child class but it is not possible to call direct method(m2() ) of child class.
//	p.sex();

	
//	Child C = new Parent(); // Not possible
	

	}}
