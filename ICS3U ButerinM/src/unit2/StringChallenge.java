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
		System.out.print("Please enter two names of your choice, press <Enter> after each one: ");
		String name1 = sc.nextLine();
		name1 = name1.toLowerCase(); //Ensuring that names are compared by actual letters only
		String name2 = sc.nextLine();
		name2 = name2.toLowerCase();

		//Demonstrating .compareTo()
		int comparison = (name1.compareTo(name2));
		if (comparison < 0) {
			System.out.println("The first name comes before the second, alphabetically.");
		}
		else if (comparison > 0) {
			System.out.println("The first name comes after the second, alphabetically.");
		}
		else {
			System.out.println("Both names are the same.");
		}
		
		//Demonstrating .equals()
		if (name1.equals(name2)) {
			System.out.println("Both names entered are exactly the same.");
		}
		else {
			System.out.println("The names entered are different.");
		}
	}
}