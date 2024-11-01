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
		System.out.print("Type in any integer and press <Enter>: ");
		int num = sc.nextInt();
		if (num > 0) {
			System.out.println("Your integer is positive.");
		}
		else {
			System.out.println("Your integer is negative.");
		}
		
		if (num%7 == 0) {
			System.out.println("")
		}
		sc.close();

	}

}
