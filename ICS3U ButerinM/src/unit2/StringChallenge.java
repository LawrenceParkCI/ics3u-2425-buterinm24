package unit2;

import java.util.Scanner;

/**
 * Description: This program demonstrates different String comparison methods.
 * Date: November 11, 2024
 * @author Misha Buterin
 */
public class StringChallenge {
	/**
	 * This is the entry point to the program.
	 * @param args
	 */
	public static void main(String[] args) {
		//This is for the portfolio

		/*
	    Create a program that demonstrates the use of .equals(), .equalsIgnoreCase(), .compareTo().  You should be using if statements for this program.

	    Also, include an example of explicit and implicit casting.

	    Comment to explain:
	      -when you use the different String functions
	      -when you are casting and how the value is changed
		 */
		
		Scanner sc = new Scanner(System.in);
		//Idea: make class attendance
		System.out.println("Enter five names, ensure to press <Enter> after each one.");
		String name1 = sc.nextLine();
		String name2 = sc.nextLine();
		String name3 = sc.nextLine();
		String name4 = sc.nextLine();
		String name5 = sc.nextLine();
		
		sc.close();
	}
}