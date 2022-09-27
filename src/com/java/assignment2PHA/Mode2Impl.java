package com.java.assignment2PHA;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Mode2Impl implements Ipha {
	Scanner sc = new Scanner(System.in);

	// Getting the current date and time
	Date currentDate = new Date();
	DateFormat dateFormat = new SimpleDateFormat("hh:mm aa");
	SimpleDateFormat formatter = new SimpleDateFormat("kk:mm");
	DateFormat dateFormat2 = new SimpleDateFormat("dd/MM/yyyy");
	
	String timeIn24Hours = formatter.format(currentDate);
	String dateString2 = dateFormat2.format(new Date()).toString();

	
	double tempf;
	double weightp;
	double distancem;

	public void saveFromMode1(double temp, double weight, double distance) {
		this.tempf = (temp * 9 / 5) + 32;
		this.weightp = weight * 2.2046;
		this.distancem = distance * 0.62137119;
	}

	@Override
	public void temp() {
		System.out.println("Enter Temperature between 77 to 113 *C");
		double Ttemp = sc.nextInt();
		if (Ttemp > 77 && Ttemp < 113) {
			this.tempf = Ttemp;
		} else
			System.out.println("Temperature should be greater than 77 and less than 113*C");

	}

	@Override
	public void weight() {
		System.out.println("Enter Weight");
		double Tweight = sc.nextInt();
		if (Tweight > 0 && Tweight < 330) {
			this.weightp = Tweight;
		} else
			System.out.println("Weight should be greater than 0 and less than 330");

	}

	@Override
	public void distance() {
		System.out.println("Enter Distance");
		double Tdistance = sc.nextInt();
		if (Tdistance > 0) {
			this.distancem = Tdistance;
		} else
			System.out.println("Distance should be greater than 0");

	}

	public void togglemode(Mode2Impl m2, Mode1Impl m1) {
		m1.display(m2);

	}

	public void display(Mode2Impl m2, Mode1Impl m1) {

		saveFromMode1(m1.temp, m1.weight, m1.distance);

		System.out.println(" ___________________________________________________________");
		System.out.println("|                                                           |");
		System.out.println("| PERSONAL HEALTH ASSISTANT       EDIT      MODE2->MODE1    |");
		System.out.println("|-----------------------------------------------------------|");
		System.out.println("|                                                           |");
		System.out.println("|                                                           |");
		System.out.println("|   WATCH(HH:MM) 24 Hr Format               DATE(DD/MM/YY)  |");
		System.out.println("|   "+this.timeIn24Hours+"                                    "+this.dateString2+"     |");	
		System.out.println("|   ------------                            -------------   |");
		System.out.println("|                                                           |");
		System.out.println("|                                                           |");
		System.out.println("|   TEMPERATURE (F)                         WEIGHT(Ib)      |");
		System.out.println(
				"|       " + this.tempf + "                                        " + this.weightp + "     |");
		System.out.println("|   --------------                          ------------    |");
		System.out.println("|                                                           |");
		System.out.println("|                                                           |");
		System.out.println("|                                           DISTANCE(MILES) |");
		System.out.println("|                                                  " + this.distancem + "      |");
		System.out.println("|                                           --------------  |");
		System.out.println("|                                                           |");
		System.out.println("|___________________________________________________________|");

		int i = 0;
		// just a loop which never end but using break keyword we can go out of our
		// loop.
		while (i == 0) {

			System.out.println("Enter '1' to display MODE \n" + "Enter '2' to edit MODE \n"
					+ "Enter '3' to TOGGLE MODE \n" + "Enter '0' to EXIT");

			int choose = sc.nextInt();

			switch (choose) {
			case 1:
				System.out.println("DISPLAY");
				m2.display2();
				break;

			case 2:
				System.out.println("EDIT");
				m2.edit(m2, m1);
				break;

			case 3:
				System.out.println("MODE 1");
				m2.togglemode(m2, m1);
				break;

			case 0:
				System.out.println("\nbye");
				i = 1;
				break;

			default:
				break;

			} // switch ends

		} // for loop ends

	}

	public void display2() {

		System.out.println(" ___________________________________________________________");
		System.out.println("|                                                           |");
		System.out.println("| PERSONAL HEALTH ASSISTANT       EDIT      MODE2->MODE1    |");
		System.out.println("|-----------------------------------------------------------|");
		System.out.println("|                                                           |");
		System.out.println("|                                                           |");
		System.out.println("|   WATCH(HH:MM) 24 Hr Format               DATE(DD/MM/YY)  |");
		System.out.println("|   "+this.timeIn24Hours+"                             "+this.dateString2+"        |");	
		System.out.println("|   ------------                            -------------   |");
		System.out.println("|                                                           |");
		System.out.println("|                                                           |");
		System.out.println("|   TEMPERATURE (F)                         WEIGHT(Ib)      |");
		System.out.println("|       " + this.tempf + "                                        " + this.weightp + "      |");
		System.out.println("|   --------------                          ------------    |");
		System.out.println("|                                                           |");
		System.out.println("|                                                           |");
		System.out.println("|                                           DISTANCE(MILES) |");
		System.out.println("|                                                  " + this.distancem + "      |");
		System.out.println("|                                           --------------  |");
		System.out.println("|                                                           |");
		System.out.println("|___________________________________________________________|");
	}

	public void edit(Mode2Impl m2, Mode1Impl m1) {
		display2();

		while (true) {
			Scanner sc = new Scanner(System.in);
			System.out.println("MODE-2");

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
