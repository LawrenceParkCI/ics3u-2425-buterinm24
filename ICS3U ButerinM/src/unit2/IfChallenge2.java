package unit2;

import java.util.Scanner;

/**
 * Description: This program checks if three user inputed numbers are in order.
 * Date: November 7, 2024
 * @author Misha Buterin
 */
public class IfChallenge2 {
	/**
	 * This is the entry point to the program.
	 * @param args
	 */
	public static void main(String[] args) {
		//This is for the portfolio

		/*Create a program that asks for three numbers.
	    Tell the user if the numbers are strictly in order.
	    ie.  2 5 11 or 5 6 7 are strictly in order.
	    ie.  6 5 7 or 5 5 7 are not
		 */
		Scanner sc = new Scanner(System.in);
		
		//Getting user input
		System.out.println("Enter three numbers, press <Enter> after each one: ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		if (num1 < num2 && num2 < num3) {
			System.out.println("Your numbers are strictly in order.");
		}
		else {
			System.out.println("Your numbers are not strictly in order.");
		}
		sc.close();
	}
}