package unit2;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Description: This program demonstrates different String comparison methods through a geography trivia experience.
 * Date: November 12, 2024
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
		
		//Formatting
		DecimalFormat percent = new DecimalFormat("00.00%");
	
		//Title
		System.out.println("Geography Fun!\n--------------");
		
		//Demonstrating .compareTo()
		System.out.print("Please enter two cities of your choice, press <Enter> after each one: ");
		String city1 = sc.nextLine();
		String city2 = sc.nextLine();

		city1 = city1.toLowerCase(); //Ensuring that cities are compared by actual letters only
		city2 = city2.toLowerCase();

		int comparison = (city1.compareTo(city2)); //Using compare to method to compare cities alphabetically
		if (comparison < 0) {
			System.out.println("The first city comes before the second, alphabetically.");
		}
		else if (comparison > 0) {
			System.out.println("The first city comes after the second, alphabetically.");
		}
		else {
			System.out.println("Both cities entered are the same.");
		}
		
		//Demonstrating .equals()
		System.out.print("\nPlease enter the number of continents in the world: ");
		String userAns = sc.nextLine();
		String ans = "7";
		
		if (userAns.equals(ans)) { //Using .equals to see if the answer is correct
			System.out.println("That is correct!");
		}
		else {
			System.out.println("That is not correct.");
		}
		
		System.out.println("\nHow many continents have you visited?");
		int visitedContinents = sc.nextInt();
		sc.nextLine();
		int totalContinents = Integer.parseInt(ans); //Example of explicit casting by changing a String to an int
		int remainingContinents = totalContinents - visitedContinents;
		
		if (remainingContinents > 0) {
			System.out.println("You still have " + remainingContinents + " continent(s) to explore!");
			double percentRemaining = (remainingContinents * 1.0) / totalContinents; //Example of implicit casting to change the percentRemaining from int to double
			System.out.println("To be more precise, you have " + percent.format(percentRemaining) + " of the worlds continents left to explore.");
		}
		else if (remainingContinents == 0) {
			System.out.println("Wow! That's amazing.");
		}
		else {
			System.out.println("I don't think that is possible.");
		}
		
		//Demonstrating .equalsIgnoreCase()
		String answer = "North America";
		System.out.print("\nWhat is the name of the continent above South America? "); 
		String userAnswer = sc.nextLine();
		
		if (userAnswer.equalsIgnoreCase(answer)) { //Using .equalsIgnoreCase() to check answer, because the user may forget capitals but still have the correct answer
			System.out.println("That is correct!");
		}
		else {
			System.out.println("That is not correct.");
		}
	}
}