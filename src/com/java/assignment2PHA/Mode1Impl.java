package com.java.assignment2PHA;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Mode1Impl implements Ipha {
	
	DateFormat dateFormat = new SimpleDateFormat("hh:mm aa");
	DateFormat dateFormat2 = new SimpleDateFormat("MM/dd/yyyy");
	
	String dateString = dateFormat.format(new Date()).toString();
	String dateString2 = dateFormat2.format(new Date()).toString();
	
	Scanner sc = new Scanner(System.in);

	double temp;
	double weight;
	double distance;

	// constructor
	public Mode1Impl() {
		this.temp = 25.0;
		this.weight = 0.0;
		this.distance = 0.0;
	}

	public void saveFromMode2(double temp, double weight, double distance) {
		this.temp = (temp - 32) * 5 / 9;
		this.weight = weight * 0.45359237;
		this.distance = distance * 1.609347;
	}

	@Override
	public void temp() {
		System.out.println("Enter Temperature between 25 to 45 *C");
		double Ttemp = sc.nextInt();
		if (Ttemp > 25 && Ttemp < 45) {
			this.temp = Ttemp;
		} else
			System.out.println("Temperature should be greater than 25 and less than 45*C");
	}

	@Override
	public void weight() {
		System.out.println("Enter Weight");
		double Tweight = sc.nextInt();
		if (Tweight > 0 && Tweight < 150) {
			this.weight = Tweight;
		} else
			System.out.println("Weight should be greater than 0 and less than 150");
	}

	@Override
	public void distance() {
		System.out.println("Enter Distance");
		double Tdistance = sc.nextInt();
		if (Tdistance > 0) {
			this.distance = Tdistance;
		} else
			System.out.println("Distance should be greater than 0");

	}

	public void togglemode(Mode2Impl m2, Mode1Impl m1) {
		m2.display(m2, m1);

	}

	public void display(Mode2Impl m2) {

		saveFromMode2(m2.tempf, m2.weightp, m2.distancem);

		System.out.println(" ___________________________________________________________");
		System.out.println("|                                                           |");
		System.out.println("| PERSONAL HEALTH ASSISTANT       EDIT      MODE1->MODE2    |");
		System.out.println("|-----------------------------------------------------------|");
		System.out.println("|                                                           |");
		System.out.println("|                                                           |");
		System.out.println("|   WATCH(HH:MM) AM/PM                      DATE(MM/DD/YY)  |");
		System.out.println("|    "+this.dateString+"                        "+this.dateString2+"     |");
		System.out.println("|   ------------                            -------------   |");
		System.out.println("|                                                           |");
		System.out.println("|                                                           |");
		System.out.println("|   TEMPERATURE (*C)                         WEIGHT(KG)     |");
		System.out.println("|       " + this.temp + "                              " + this.weight + "        |");
		System.out.println("|   --------------                          ------------    |");
		System.out.println("|                                                           |");
		System.out.println("|                                                           |");
		System.out.println("|                                           DISTANCE(KM)    |");
		System.out.println("|                                           " + this.distance + "        |");
		System.out.println("|                                           --------------  |");
		System.out.println("|                                                           |");
		System.out.println("|___________________________________________________________|");
	}

	public void display2() {

		System.out.println(" ___________________________________________________________");
		System.out.println("|                                                           |");
		System.out.println("| PERSONAL HEALTH ASSISTANT       EDIT      MODE1->MODE2    |");
		System.out.println("|-----------------------------------------------------------|");
		System.out.println("|                                                           |");
		System.out.println("|                                                           |");
		System.out.println("|   WATCH(HH:MM) AM/PM                      DATE(MM/DD/YY)  |");
		System.out.println("|    "+this.dateString+"                      "+this.dateString2+"       |");
		System.out.println("|   ------------                            -------------   |");
		System.out.println("|                                                           |");
		System.out.println("|                                                           |");
		System.out.println("|   TEMPERATURE (*C)                         WEIGHT(KG)     |");
		System.out.println("|       " + this.temp + "                     " + this.weight + "    |");
		System.out.println("|   --------------                          ------------    |");
		System.out.println("|                                                           |");
		System.out.println("|                                                           |");
		System.out.println("|                                           DISTANCE(KM)    |");
		System.out.println("|                                           " + this.distance + "      |");
		System.out.println("|                                           --------------  |");
		System.out.println("|                                                           |");
		System.out.println("|___________________________________________________________|");
	
	}

	public void edit(Mode2Impl m2, Mode1Impl m1) {
		display2();

		while (true) {
			Scanner sc = new Scanner(System.in);
			System.out.println("MODE-1");

			System.out.println("Enter '1' to edit TEMPERATURE \n" + "Enter '2' to edit WEIGHT \n"
					+ "Enter '3 to edit DISTANCE \n" + "Enter '4' to TOGGLE-MODE \n" + "Enter '5' to Exit \n");

			// lets take this as input
			int input = (sc.nextInt());

			if (input == 1) {
				temp();
				display2();
			} else if (input == 2) {
				weight();
				display2();
			} else if (input == 3) {
				distance();
				display2();
			} else if (input == 4) {
				togglemode(m2, m1);
			} else if (input == 5) {
				break;
			}

		}
	}

}
