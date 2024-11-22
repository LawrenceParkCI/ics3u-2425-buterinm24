package unit2;

import java.util.Scanner;
/**
 * Description: This program asks for a password and welcomes them in if it is correct.
 * Date: November 22, 2024
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
		
		//Creating variables
		String password = "Misha123";
		String userAttempt; 
		int numOfAttempts = 0;
		int maxAttempts = 3;
		
		//Getting user input and checking password
		do {
			System.out.print("Please enter the password: ");
			userAttempt = sc.nextLine();
			numOfAttempts ++;

			if(userAttempt.equals(password)) {
				System.out.println("Correct. Access granted.");
			}
			else
				System.out.println("Incorrect.");

		} while ((!userAttempt.equals(password)) && (numOfAttempts < maxAttempts));

		//Denying user if they have too many attempts
		if(!userAttempt.equals(password)) {
			System.out.println("Too many attempts. Access denied.");
		}
		
		sc.close();
		
	}
}