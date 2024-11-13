package unit2;

import java.util.Scanner;

/**
 * Description: This program prints an interactive quiz about world geography.
 * Date: November 13, 2024
 * @author Misha Buterin
 */
public class IfChallenge3 {
	/**
	 * This is the entry point to the program.
	 * @param args
	 */
	public static void main(String[] args) {
		//This is for the portfolio

		/*
	    Write an interactive quiz. It should ask the user three 
	    multiple-choice or true/false questions about something. 
	    It must keep track of how many they get wrong, and print 
	    out a "score" at the end.

	    Sample:

	    Are you ready for a quiz?  N
	    Okay, here it comes!

	    Q1) What is the capital of Alaska?
	      1) Melbourne
	      2) Anchorage
	      3) Juneau

	    > 3

	    That's right!
		 */

		Scanner sc = new Scanner(System.in);
		
		//Title and introduction
		System.out.println("World Geography Quiz\n-----------------------------------------------------------");
		System.out.println("Welcome to the world geography quiz.\nLets go!");
		System.out.println("\nSTART\n-----------------------------------------------------------");
		
		//Variables
		int score = 0;
		String answer1 = "b";
		String answer2 = "c";
		String answer3 = "d";
		String answer4 = "d";
		String answer5 = "false";
		String answer6 = "a";
		
		//Question 1
		System.out.println("Question 1 (1 point): What is the capital city of Poland?");
		System.out.println("\ta) Krakow\n\tb) Warsaw\n\tc) Prague\n\td) None of the above");
		System.out.print("Answer: ");
		String guess1 = sc.nextLine();
		
		if (guess1.equalsIgnoreCase(answer1)) {
			System.out.println("That is correct!");
			score++;
		}
		else {
			System.out.println("Sorry, that is not correct.");
		}
		
		//Question 2
		System.out.println("\nQuestion 2 (1 point): How many states are there in the United States of America?");
		System.out.println("\ta) 45\n\tb) 49\n\tc) 50\n\td) None of the above");
		System.out.print("Answer: ");
		String guess2 = sc.nextLine();
		
		if (guess2.equalsIgnoreCase(answer2)) {
			System.out.println("That is correct!");
			score++;
		}
		else {
			System.out.println("Sorry, that is not correct.");
		}
		
		//Question 3
		System.out.println("\nQuestion 3 (1 point): How many countries are there in South America?");
		System.out.println("\ta) 11\n\tb) 10\n\tc) 13\n\td) None of the above");
		System.out.print("Answer: ");
		String guess3 = sc.nextLine();
		
		if (guess3.equalsIgnoreCase(answer3)) {
			System.out.println("That is correct!");
			score++;
		}
		else {
			System.out.println("Sorry, that is not correct.");
		}
		
		//Question 4
		System.out.println("\nQuestion 4 (1 point): What is the name of the mountain range seperating Europe and Asia?");
		System.out.println("\ta) The Alps\n\tb) The Urals\n\tc) The Caucasus\n\td) Both b) & c) are correct");
		System.out.print("Answer: ");
		String guess4 = sc.nextLine();
		
		if (guess4.equalsIgnoreCase(answer4)) {
			System.out.println("That is correct!");
			score++;
		}
		else {
			System.out.println("Sorry, that is not correct.");
		}
		
		//Question 5 - True/False
		System.out.println("\nQuestion 5 (1 point): True or false; Canada is the largest country in the world.");
		System.out.print("Answer: ");
		String guess5 = sc.nextLine();
		
		if (guess5.equalsIgnoreCase(answer5)) {
			System.out.println("That is correct!");
			score++;
		}
		else {
			System.out.println("Sorry, that is not correct.");
		}
				
		//Question 6/Challenge
		System.out.println("\nChallenge (2 points): What is the capital city of Kyrgyzstan?");
		System.out.println("a) Bishkek\nb) Dushanbe\nc) Ashgabat\nd) Tashkent");
		System.out.print("Answer: ");
		String guess6 = sc.nextLine();
		
		if (guess6.equalsIgnoreCase(answer6)) {
			System.out.println("That is correct! Great job.");
			score = score + 2;
		}
		else {
			System.out.println("Sorry, that is not correct.");
		}
		
		//Score calculation and conclusion.
		System.out.println("-----------------------------------------------------------\nEND");
		System.out.println("\nCongratulations, you have completed the world geography quiz.");
		System.out.println("Your score is: " + score + "/7");
		
		if (score == 7) {
			System.out.println("Wow! That's an amazing score.");
		}
		else if (score == 6 || score == 5) {
			System.out.println("Nice! Keep up the effort.");
		}
		else if (score == 4 || score == 3) {
			System.out.println("You're on the right track.");
		}
		else
			System.out.println("You may want to touch up on your geography knowledge.");
		
		System.out.println("\nThank you for playing!");
		sc.close();
	}
}