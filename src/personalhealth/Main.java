package personalhealth;

import java.util.*;

public class Main {
	
	static String var = "false";
	static String var2 = "false";
	static String current_mode = "Mode1";
	static int Temperature;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Mode1 m1 = new Mode1();
		Mode2 m2 = new Mode2();
		Parent p1 = new Parent();
		
		boolean i = true;

		m1.Weight = p1.Weight;
		m2.Weight = p1.Weight;

		m1.Distance = p1.Distance;
		m2.Distance = p1.Distance;

		while (i) {
			System.out.println("Enter '1' to Display Mode \n" + "Enter '2' to Toggle Mode \n"
					+ "Enter '3' to Edit Values \n" + "Enter '0' to Exit Mode");

			if (current_mode.equals("Mode1")) {
				int choice = sc.nextInt();
				switch (choice) {
				case 1:
					m1.display();
					break;

				case 2:
					m2.display();
					current_mode = "Mode2";
					break;

				case 3:
					System.out.println("Enter '1' to change Temperature \n" + "Enter '2' to change Weight \n"
							+ "Enter '3' to change Distance ");

					int edit_choice = sc.nextInt();

					if (edit_choice == 1) {
						System.out.println("Enter the Temperature in Celcius");
						int user_temp = sc.nextInt();
						p1.setTemperature(user_temp);
						m1.Temperature = p1.Temperature;
						m2.Temperature = p1.Temperature;
						System.out.println("Successfully Edited");

					} else if (edit_choice == 2) {
						System.out.println("Enter the Weight in Kilogram");
						int user_weight = sc.nextInt();
						p1.setWeight(user_weight);
						System.out.println("Successfully Edited");
					} else {
						System.out.println("Enter the Distance in Kilometer");
						float user_dist = sc.nextFloat();
						p1.setDistance(user_dist);
						System.out.println("Successfully Edited");

					}
					break;

				case 0:
					System.out.println("Exit");
					i = false;
				}
			} else {
				int choice = sc.nextInt();
				switch (choice) {
				case 1:
					m2.display();
					break;

				case 2:
					m1.display();
					current_mode = "Mode1";
					break;

				case 3:
					System.out.println("Enter '1' to change Temperature \n" + "Enter '2' to change Weight \n"
							+ "Enter '3' to change Distance ");
					int edit_choice = sc.nextInt();

					if (edit_choice == 1) {
						System.out.println("Enter the Temperature in Farenhite");
						int user_temp = sc.nextInt();
						p1.setTemperature(user_temp);
						m1.Temperature = p1.Temperature;
						m2.Temperature = p1.Temperature;
						System.out.println("Successfully Edited");
					} else if (edit_choice == 2) {
						System.out.println("Enter the Weight in Pounds");
						int user_weight = sc.nextInt();
						p1.setWeight(user_weight);
						System.out.println("Successfully Edited");
					} else {
						System.out.println("Enter the Distance in Miles");
						float user_dist = sc.nextFloat();
						p1.setDistance(user_dist);
						System.out.println("Successfully Edited");
					}
					break;

				case 0:
					System.out.println("Exit");
					i = false;
				}
			}

		}
		sc.close();
	}

}
