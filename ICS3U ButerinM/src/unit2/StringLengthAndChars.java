package unit2;

import java.util.Scanner;

/**
 * Description: This program asks a user for their name and then prints it out letter by letter.
 * Date: November 26, 2024
 * @author Misha Buterin
 */
public class StringLengthAndChars {
	/**
	 * This is the entry point to the program
	 * @param args
	 */
	public static void main(String[] args) {
		/*
	      Goal: Using string methods with a for loop
	        .length()
	        .charAt(<position>)
		 */

		String name = "Ms. Kemp";

		//write comments for the following code - what does it print out, and why?
		System.out.println(name.length()); //Prints 8, because there are 8 chars in the String "Ms. Kemp"
		System.out.println(name.charAt(1)); //Prints s, because s is the character at index 1 in "Ms Kemp" (because indexes start at 0)
		System.out.println(name.charAt(2)); //Prints ., because . is the character at index 2 in "Ms.Kemp"
		System.out.println(name.charAt(3)); //Prints a space, because the character at index three of "Ms. Kemp" is 3

		//.length() gets the number of characters
		//.charAt(position) gets the character at the specified index
		//counting starts at 0

		/**
	      Ask for user input for name. Print out each individual letter of the name on separate lines, using a for loop
		 */
		
		Scanner sc = new Scanner(System.in);
		
		//Title
		System.out.println("THE NAME GAME\n-------------");
		
		//Getting user input
		System.out.print("Please enter your name: ");
		String userName = sc.nextLine();
		int length = userName.length();
		
		//Printing output using for loop
		System.out.println("Here is each letter of your name!");
		for (int letter = 0; letter < length; letter++) {
			System.out.println(userName.charAt(letter));
		}
		
		sc.close();

	}
}