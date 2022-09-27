/**
 * 
 */
package com.java.Aftercapgemini;

/**
 * @author satya
 *
 */
public class Bus extends Vehicle{

	public static void main(String[] args) {
		
		Bus bb = new Bus();

		int a = bb.getNoOfWheel();
		int b = bb.getNoOfStiring();
		
		System.out.println("Bus no of wheel");
		System.out.println(a);

		System.out.println("Bus no of stirring");
		System.out.println(b);


}

	@Override
	public int getNoOfWheel() {
		// TODO Auto-generated method stub
		return 6;
	}

	@Override
	public int getNoOfStiring() {
		// TODO Auto-generated method stub
		return 1;
	}
	}

