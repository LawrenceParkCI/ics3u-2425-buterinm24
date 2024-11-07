package unit2;

import java.util.Scanner;

/**
 * Description: This program asks for the users favourite number checks various information about that number.
 * Date: November 7, 2024
 * @author Misha Buterin
 */
public class IfChallenge {
	/**
	 * This is the entry point to the program.
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		/*
		    (IF)

		    ask for the user's favourite number.
		    if the number is negative, say that they need to look on
		    the bright side.  If their number is odd, say that it's a 
		    bit strange.

		    (IF, ELSE)

		    If their number is divisible by 3 and by 2, 
		    say that they should really consider thinking about 6, 
		    otherwise say they can keep wholesome.  

		    (IF, ELSE IF, ELSE)

		    Finally, if the 
		    ones digit of the number is 8, say that you too are full, 
		    if the ones digit is 9, say Canada is a nice country, 
		    and any other number should result in "don't count on 
		    it". 
		 */
		System.out.print("Enter your favourite number: ");
		int favNum = in.nextInt();

		//Checking if favNum is negative
		if (favNum < 0) {
			System.out.println("You need to look on the bright side.");
		}
		//Checking if favNum is odd
		if (favNum%2 != 0){
			System.out.println("That is a bit strange.");
		}

		//Checking if favNum is divisible by 2 and 3
		if (favNum%2 == 0 && favNum%3 == 0) {
			System.out.println("You should really consider thinking about 6.");
		}
		else {
			System.out.println("You can keep wholesome.");
		}

		//Checking if ones digit is 8, 9, or something else
		if (favNum%10 == 8) {
			System.out.println("You are too full.");
		}
		else if (favNum%10 == 9) {
			System.out.println("Canada is a nice country");
		}
		else {
			System.out.println("Don't count on it");
		}

		in.close();

	}
}