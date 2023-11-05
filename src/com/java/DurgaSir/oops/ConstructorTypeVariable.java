package com.java.DurgaSir.oops;

class Test11 { 
	// instance variables
	int a;
	int b;

	Test11(int a, int b) {
		this.a = a;
		this.b = b;
	}
}

class Test22 {// instance variables
	boolean b1;
	boolean b2;

	Test22(boolean b1, boolean b2) {
		this.b1 = b1;
		this.b2 = b2;
	}
}

class Test3 { // instance variables
	char ch1;
	char ch2;

	Test3(char ch1, char ch2) {
		this.ch1 = ch1;
		this.ch2 = ch2;
	}
}

public class ConstructorTypeVariable {
	Test11 t1;
	Test22 t2;
	Test3 t3;
	
	ConstructorTypeVariable(Test11 t1 ,Test22 t2,Test3 t3)//constructor [local variables]
		{ //conversion of local-instance
		this.t1 = t1;
		this.t2 = t2;
		this.t3 = t3;
		}

	void display()
		{ System.out.println("Test1 object values:-? "+t1.a+" ----- "+t1.b);
		System.out.println("Test2 object values:-? "+t2.b1+" ----- "+t2.b2);
		System.out.println("Test3 object values:-? "+t3.ch1+" ----- "+t3.ch2);
		}

	public static void main(String[] args) {
		Test11 t = new Test11(10, 20);
		Test22 tt = new Test22(true, true);
		Test3 ttt = new Test3('a', 'b');
		ConstructorTypeVariable main = new ConstructorTypeVariable(t, tt, ttt);
		main.display();
	}
}

