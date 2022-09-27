package com.java.AccessModifierFun1;

public class access2 extends access1{

	public static void main(String[] args) {
		
		access1 a1 = new access1();
		access2 a2 = new access2();

		System.out.println("default modifier in same package");
		System.out.println(a1.a);
		System.out.println(a1.b);
		
		
		System.out.println("public modifier in same package");
		System.out.println(a1.c);
		System.out.println(a1.d);
		
		System.out.println("protected modifier in same package");
		System.out.println(a1.e);
		System.out.println(a1.f);
		
		// private modifier outside the class not accessible
//		System.out.println("private modifier in same package"); 
//		System.out.println(a2.g);
//		System.out.println(a2.h);
		
	

	}

}
