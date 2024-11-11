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
	
		System.out.print("Out of the seven colours on the rainbow, which one is your favourite?");
		String colour = sc.nextLine();
		
		
		sc.close();
	}
}