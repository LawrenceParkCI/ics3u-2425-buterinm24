package unit2;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Description: This program prints an interactive quiz about world geography.
 * Date: November 14, 2024
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
		System.out.println("W O R L D  G E O G R A P H Y  Q U I Z\n-----------------------------------------------------------------------------------------");
		System.out.println("Welcome to the world geography quiz.\nTo answer a multiple choice question, type in the letter of your answer and press <Enter>\nLets go!");
		System.out.println("\nSTART\n-----------------------------------------------------------------------------------------");

		//Formatting
		DecimalFormat percent = new DecimalFormat("#.#%");
		
		//Variables
		int score = 0;
		final int TOTAL_SCORE = 10;
		String answer1 = "c";
		String answer2 = "e";
		String answer3a = "false";
		String answer3b = "f";
		String answer4 = "d";
		String answer5 = "a";
		String answer6 = "d";
		String answer7 = "b";
		String answer8a = "true";
		String answer8b = "t"; //Giving users the option to type out "true" or just enter "t"
		String answer9 = "a";
		
		//Part 1
		System.out.println("PART 1: C O U N T R I E S");
				
		//Question 1
		System.out.println("\nQuestion 1 (1 point): How many states are there in the United States of America?");
		System.out.println("\ta) 45\n\tb) 49\n\tc) 50\n\td) 55\n\te) None of the above");
		System.out.print("Answer: ");
		String guess1 = sc.nextLine();

		if (guess1.equalsIgnoreCase(answer1)) { //Using .equalsIgnoreCase() for all comparisons as the user may type in a capital or lower case answer
			System.out.println("That is correct!");
			score++;
		}
		else {
			System.out.println("Sorry, that is not correct.");
		}

		//Question 2
		System.out.println("\nQuestion 2 (1 point): How many countries are there in South America?");
		System.out.println("\ta) 11\n\tb) 10\n\tc) 13\n\td) 15\n\te) None of the above");
		System.out.print("Answer: ");
		String guess2 = sc.nextLine();

		if (guess2.equalsIgnoreCase(answer2)) {
			System.out.println("That is correct!");
			score++;
		}
		else {
			System.out.println("Sorry, that is not correct.");
		}
		
		//Question 3 - True/False
		System.out.println("\nQuestion 3 (1 point): True or false; Canada is the largest country in the world.");
		System.out.print("Answer: ");
		String guess3 = sc.nextLine();

		if (guess3.equalsIgnoreCase(answer3a) || guess3.equalsIgnoreCase(answer3b)) {
			System.out.println("That is correct!");
			score++;
		}
		else {
			System.out.println("Sorry, that is not correct.");
		}
		
		//Part 2
		System.out.println("\nPAR 2: L A N D S C A P E S");
		
		//Question 4
		System.out.println("\nQuestion 4 (1 point): What is the name of the mountain range seperating Europe and Asia?");
		System.out.println("\ta) The Alps\n\tb) The Urals\n\tc) The Caucasus\n\td) Both b) & c) are correct\n\te) Both a) & b) are correct");
		System.out.print("Answer: ");
		String guess4 = sc.nextLine();

		if (guess4.equalsIgnoreCase(answer4)) {
			System.out.println("That is correct!");
			score++;
		}
		else {
			System.out.println("Sorry, that is not correct.");
		}
		
		//Question 5
		System.out.println("\nQuestion 5 (1 point): What is the name of the longest river in the world?");
		System.out.println("\ta) River Nile\n\tb) The Amazon River\n\tc) The Yellow River\n\td) The Mississippi\n\te) None of the above");
		System.out.print("Answer: ");
		String guess5 = sc.nextLine();
		
		if (guess5.equalsIgnoreCase(answer5)) {
			System.out.println("That is correct!");
			score++;
		}
		else {
			System.out.println("Sorry, that is not correct.");
		}
		
		//Question 6
		System.out.println("\nQuestion 6 (1 point): How many great lakes are there?");
		System.out.println("\ta) 4\n\tb) 6\n\tc) 7\n\td) 5\n\te) None of the aboe");
		System.out.print("Answer: ");
		String guess6 = sc.nextLine();
		
		if (guess6.equalsIgnoreCase(answer6)) {
			System.out.println("That is correct!");
			score++;
		}
		else {
			System.out.println("Sorry, that is not correct.");
		}
		
		//Part 3
		System.out.println("\nPart 3: C A P I T A L  C I T I E S");
				
		//Question 7
		System.out.println("\nQuestion 7 (1 point): What is the capital city of Poland?");
		System.out.println("\ta) Krakow\n\tb) Warsaw\n\tc) Prague\n\td) Minsk\n\te) None of the above");
		System.out.print("Answer: ");
		String guess7 = sc.nextLine();

		if (guess7.equalsIgnoreCase(answer7)) {
			System.out.println("That is correct!");
			score++;
		}
		else {
			System.out.println("Sorry, that is not correct.");
		}
		
		//Question 8 - True/False
		System.out.println("\nQuestion 8 (1 point): True or false; Seoul is the capital of South Korea.");
		System.out.print("Answer: ");
		String guess8 = sc.nextLine();
		
		if (guess8.equalsIgnoreCase(answer8a) || guess8.equalsIgnoreCase(answer8b)) {
			System.out.println("That is correct!");
			score++;
		}
		else {
			System.out.println("Sorry, that is not correct.");
		}
		
		//Question 9/Challenge
		System.out.println("\nAlmost there! One last question, this one is a bit harder!");
		System.out.println("\nChallenge (2 points): What is the capital city of Kyrgyzstan?");
		System.out.println("\ta) Bishkek\n\tb) Dushanbe\n\tc) Ashgabat\n\td) Tashkent\n\te) None of the above");
		System.out.print("Answer: ");
		String guess9 = sc.nextLine();

		if (guess9.equalsIgnoreCase(answer9)) {
			System.out.println("That is correct! Great job.");
			score = score + 2;
		}
		else {
			System.out.println("Sorry, that is not correct.");
		}
		System.out.println("-----------------------------------------------------------------------------------------\nEND");

		//Score calculation
		double percentScore = ((double)score)/TOTAL_SCORE;
		System.out.println("\nCongratulations, you have completed the world geography quiz.");
		System.out.println("Your score is: " + score + "/10, or " + percent.format(percentScore) + ".");

		//Evaluating score and conclusion
		if (score == 10) {
			System.out.println("Wow! That's an amazing score.");
		}
		else if (score == 9 || score == 8 || score == 7) {
			System.out.println("Nice! Keep up the effort.");
		}
		else if (score == 6 || score == 5) {
			System.out.println("You're on the right track.");
		}
		else {
			System.out.println("That is a fail, you may want to touch up on your geography knowledge.");
		}
		
		System.out.println("\nThank you for playing!");
		
		sc.close();
	}
}