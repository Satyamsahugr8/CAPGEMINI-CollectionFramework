package personalhealth;

import java.util.Scanner;

public class Mode2 extends Parent {
	public float Distance;
	public int Weight;
	

	public void display() {
		if(((Main.current_mode).equals("Mode2")) || Main.var.equals("true")) {
			
			System.out.println(" __________________________________________________________________________________________");
			System.out.println("|                                                                                          |");
			System.out.println("|   PERSONAL HEALTH ASSISTANT                              EDIT         MODE2 -> MODE1     |");
			System.out.println("|__________________________________________________________________________________________|");
			System.out.println("|                                                                                          |");
			System.out.println("|                                                                DATE                      |");
			System.out.println("|                                                                   "+" 01-JAN-2023 "+"    |");
			System.out.println("|                                                                                          |");
			System.out.println("|     WATCH                                                                                |");
			System.out.println("|         "+" 00:00 AM "+"                                                                 |");
			System.out.println("|                                                                                          |");
			System.out.println("|                                                                WEIGHT                    |");
			System.out.println("|                                                                   "+Weight+" Pounds      |");
			System.out.println("|                                                                                          |");
			System.out.println("|     TEMPERATURE                                                                          |");
			System.out.println("|         "+Temperature +" F                                                               |");
			System.out.println("|                                                                                          |");
			System.out.println("|                                                                DISTANCE                  |");
			System.out.println("|                                                                   "+Distance+" Miles     |");
			System.out.println("|                                                                                          |");
			System.out.println("|__________________________________________________________________________________________|");
		}
		else {
			System.out.println(" __________________________________________________________________________________________");
			System.out.println("|                                                                                          |");
			System.out.println("|   PERSONAL HEALTH ASSISTANT                              EDIT         MODE2 -> MODE1     |");
			System.out.println("|__________________________________________________________________________________________|");
			System.out.println("|                                                                                          |");
			System.out.println("|                                                                DATE                      |");
			System.out.println("|                                                                   "+" 01-JAN-2023 "+"    |");
			System.out.println("|                                                                                          |");
			System.out.println("|     WATCH                                                                                |");
			System.out.println("|         "+" 00:00 AM "+"                                                                 |");
			System.out.println("|                                                                                          |");
			System.out.println("|                                                                WEIGHT                    |");
			System.out.println("|                                                                "+(Weight*2.205)+" Pounds |");
			System.out.println("|                                                                                          |");
			System.out.println("|     TEMPERATURE                                                                          |");
			System.out.println("|         "+((Temperature*1.8)+32) +" F                                                    |");
			System.out.println("|                                                                                          |");
			System.out.println("|                                                                DISTANCE                  |");
			System.out.println("|                                                          "+(Distance*0.621)+" Miles      |");
			System.out.println("|                                                                                          |");
			System.out.println("|__________________________________________________________________________________________|");
			this.Temperature=(int) ((Temperature*1.8)+32);
			Main.var2="true";
		}
	}	
}
