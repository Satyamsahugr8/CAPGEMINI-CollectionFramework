package com.java.DurgaSir.oops;

public class DefaultConstructor {
	String name;
	int rollNo;

	public DefaultConstructor(String string, int i) {
		super();
		this.name=string;
		this.rollNo=i;
	}
	
	
	 public DefaultConstructor() {
		// TODO Auto-generated constructor stub
	}


	public void printdefaultValue() {
		System.out.println(name+" "+rollNo);
	}

	public static void main(String[] args) {
		
//		//1
//		DefaultConstructor s1 = new DefaultConstructor("Durga", 101);
//		System.out.println(s1.name+" "+s1.rollNo);
		
//		//2
//		DefaultConstructor s2 = new DefaultConstructor("Durgaji",102);
//	    System.out.println(s2.name+" "+s2.rollNo);
	    
//	    //3
//		DefaultConstructor s3 = new DefaultConstructor();
//		s3.printdefaultValue();
		
	}

}
