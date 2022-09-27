package personalhealth;

import java.util.Scanner;

public class Mode1 extends Parent{
	public float Distance;
	public int Temperature;
	public int Weight;

	

	

	public void display() {
		
		if(((Main.current_mode).equals("Mode1")) || Main.var2.equals("true")) {
			
		System.out.println(" __________________________________________________________________________________________");
		System.out.println("|                                                                                          |");
		System.out.println("|   PERSONAL HEALTH ASSISTANT                              EDIT         MODE1 -> MODE2     |");
		System.out.println("|__________________________________________________________________________________________|");
		System.out.println("|                                                                                          |");
		System.out.println("|                                                                DATE                      |");
		System.out.println("|                                                                   "+" 01-JAN-2023 "+"          |");
		System.out.println("|                                                                                          |");
		System.out.println("|     WATCH                                                                                |");
		System.out.println("|         "+" 00:00 AM "+"                                                                       |");
		System.out.println("|                                                                                          |");
		System.out.println("|                                                                WEIGHT                    |");
		System.out.println("|                                                                   "+Weight+" KG                  |");
		System.out.println("|                                                                                          |");
		System.out.println("|     TEMPERATURE                                                                          |");
		System.out.println("|         "+this.Temperature+" C                                                           |");
		System.out.println("|                                                                                          |");
		System.out.println("|                                                                DISTANCE                  |");
		System.out.println("|                                                                   "+Distance+" KM                |");
		System.out.println("|                                                                                          |");
		System.out.println("|__________________________________________________________________________________________|");
		}
		else {
			
			System.out.println(" __________________________________________________________________________________________");
			System.out.println("|                                                                                          |");
			System.out.println("|   PERSONAL HEALTH ASSISTANT                              EDIT         MODE1 -> MODE2     |");
			System.out.println("|__________________________________________________________________________________________|");
			System.out.println("|                                                                                          |");
			System.out.println("|                                                                DATE                      |");
			System.out.println("|                                                                   "+" 01-JAN-2023 "+"          |");
			System.out.println("|                                                                                          |");
			System.out.println("|     WATCH                                                                                |");
			System.out.println("|         "+" 00:00 AM "+"                                                                       |");
			System.out.println("|                                                                                          |");
			System.out.println("|                                                                WEIGHT                    |");
			System.out.println("|                                                                   "+(Weight/2.205)+" KG                  |");
			System.out.println("|                                                                                          |");
			System.out.println("|     TEMPERATURE                                                                          |");
			System.out.println("|         "+ ((Temperature-32)/1.8)+" C                                                                             |");
			System.out.println("|                                                                                          |");
			System.out.println("|                                                                DISTANCE                  |");
			System.out.println("|                                                                   "+(Distance*1.6)+" KM                |");
			System.out.println("|                                                                                          |");
			System.out.println("|__________________________________________________________________________________________|");
			this.Temperature=(int) ((Temperature-32)/1.8);
			Main.var="true";
			
		}
		}	
	
}
