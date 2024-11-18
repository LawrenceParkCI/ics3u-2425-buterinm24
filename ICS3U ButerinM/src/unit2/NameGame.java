package unit2;

import java.util.Scanner;

/**
 * Description: This program asks a user for their name and randomly tells them if it likes it or hates it.
 * Date: November 18, 2024
 * @author Misha Buterin
 */
public class NameGame {
	/**
	 * This is the entry point to the program.
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		 * The application should prompt the user for their name. 
		 * 70% of the time the program should output that the user's name is their favourite, 
		 * and 30% of the time says they hate that name.
		 * */

		Scanner sc = new Scanner(System.in);

		//Getting user input
		System.out.print("Please type in your name and press <Enter>: ");
		String name = sc.nextLine();

		//Generating random value
		double randomNum = Math.random();

		//Printing output
		if (randomNum < 0.7) {
			System.out.println("Wow, " + name + " is my favourite name!");
		}
		else {
			System.out.println("Oh, I hate the name " + name + ".");
		}

		sc.close();
	}

}
