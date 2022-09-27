package com.java.AccessModifierFun2;

import com.java.AccessModifierFun1.access1;

public class access3 extends access1{

	public static void main(String[] args) {
		
		access1 a1 = new access1();
		access3 a2 = new access3();
		
		
//		System.out.println("default modifier in another package AccessFun2");
//		System.out.println(a1.a);  // default modifier
//		System.out.println(a1.b);  // default modifier	
		
		System.out.println("public modifier in another package AccessFun2");
		System.out.println(a1.c);  // public modifier
		System.out.println(a1.d);  // public modifier		
		
		System.out.println("protected modifier in another package AccessFun2");
		System.out.println(a2.e);  // protected modifier
		System.out.println(a2.f);  // protected modifier
		
		// private modifier outside the class not accessible
//		System.out.println("private modifier in another package AccessFun2");
//		System.out.println(a1.g);  // public modifier
//		System.out.println(a1.h);  // public modifier
		
	}

}
