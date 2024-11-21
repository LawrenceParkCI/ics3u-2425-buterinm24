package unit2;

import java.util.Scanner;
/**
 * Description: This program asks for a password and welcomes them in if it is correct.
 * Date: November 21, 2024
 * @author Misha Buterin
 */
public class LoopChallenge1 {
/**
 * This is the entry point to the program.
 * @param args
 */
	public static void main(String[] args) {
		/*
	      Create a program that will ask for the password.  If they answer 
	      incorrectly, tell them, and repeat. If they answer correctly, 
	      welcome them in.

	      Extra: if they don't give a proper answer within 3 
	      Decide on whether you should use the while or do while loop.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		String password = "Misha123";
		String userGuess; 
		int numOfGuesses = 0;
		
		do {
			System.out.print("Please enter the password: ");
			userGuess = sc.nextLine();
			numOfGuesses ++;
			
		} while (!userGuess.equals(password));
		
		System.out.println("Welcome in.");
	}
}