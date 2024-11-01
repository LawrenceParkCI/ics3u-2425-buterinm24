package unit2;

import java.util.Scanner;

/**
 * Description: This program tests if an integer is positive or negative, and then prints the results.
 * Date: November 1, 2024
 * @author Misha Buterin
 */
public class PositiveNegative {
	/**
	 * This is the entry point to the program.
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);

		//Title
		System.out.println("POSITIVE OR NEGATIVE\n--------------------");
		
		//Getting user input
		System.out.print("Type in an integer of your choice and press <Enter>: ");
		int num = sc.nextInt();

		//Testing if the integer is positive or negative and printing results
		if (num > 0) {
			System.out.println("Your integer is positive.");
		}
		if (num < 0) {
			System.out.println("Your integer is negative");
		}
		
		//Accounting for zero
		if (num == 0) {
			System.out.println("Your integer is neutral.");
		}

		//Testing if the integer is divisible by 7 and printing results
		if (num%7 == 0) {
			System.out.println("Your integer is divisible by seven.");
		}
		else {
			System.out.println("Your integer is not divisible by seven.");
		}
		
		sc.close();

	}

}
