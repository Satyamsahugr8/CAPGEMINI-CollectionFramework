package com.java.DurgaSir.oops;

interface Interf {
	public void m1();
	public void m2();

}

abstract class ServiceProvider implements Interf{

	public void m1() {
		
	}	
}


class SubserviceProvider extends ServiceProvider{
	
	public void m2() {
		
	}
}


