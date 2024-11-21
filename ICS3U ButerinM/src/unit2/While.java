package unit2;

import java.util.Scanner;
/**
 * Description: This program prints a work sheet about while loops.
 * Date: November 21, 2024
 * @author Misha Buterin
 */
public class While {
	/**
	 * This is the entry point to the program.
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("How many people are you planning to see?");

		//Why do you think I coded it this way?
		//So that you could compare the number of people as an integer 
		//using relational operators instead of String comparison.
		int numPeople = Integer.parseInt(in.nextLine());

		while (numPeople > 0) {
			System.out.print("What is this person's name? ");

			//Why do you think the variable is declared here?
			//The variable name is only needed if the number of people is
			//greater than 0, so if there are no people, you don't need to store any names.

			String name = in.nextLine();
			System.out.println("Welcome, " + name + "!");

			numPeople = numPeople - 1;
		}


		//Run the code Using the debugger. 
		//Explain the code in your own words
		/*
		 * This code asks a user how many people they want to see, 
		 * if they say one or more people, the program asks for the first persons name.
		 * Then, it subtracts one from the total number of people because one name has been accounted for.
		 * Then the program loops back and checks if there are more names to ask, and it does this until
		 * all the names have been entered. Once the number of people is equal to zero, the program ends.
		 */

		//What code is repeated?
		//Everything in the curly braces after the while.
		/*
		 * System.out.print("What is this person's name? ");
		 * String name = in.nextLine();
		 * System.out.println("Welcome, " + name + "!");
		 * numPeople = numPeople - 1;
		 */

		//When does it decide whether to repeat or not?
		//At the start of the while loop, through the condition in round brackets

		//What is the condition for repeating?
		//(numPeople > 0)

		//What is the difference between a while loop and a do-while loop?
		//A while loop only runs if the first input entered is true. 
		//A do-while loop always runs at least once even if the first input 
		//from the user doesn't satisfy the condition.

		//Create a while loop that asks for a word, 
		//and prints it out 20 times.


		System.out.print("Enter a word: ");
		String word = in.nextLine();
		int timesPrinted = 0;

		while (timesPrinted < 20) {
			System.out.println(word);
			timesPrinted ++;
		}

		in.close();
	}
}