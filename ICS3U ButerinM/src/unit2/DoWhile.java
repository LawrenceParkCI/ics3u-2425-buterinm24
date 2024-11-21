package unit2;

import java.util.Scanner;
/**
 * Description: This program prints a work sheet about do-while loops.
 * Date: November 21, 2024
 * @author Misha Buterin
 */
public class DoWhile {
/**
 * This is the entry point to the program.
 * @param args
 */
	public static void main(String[] args) {
		/*
	    A loop is another control structure that allows for repetition. It 
	    does not make a decision on which branch to go on, like the 
	    conditional.
	    It makes a decision whether it should go back to re do a set of code.
		 */
		Scanner in = new Scanner(System.in);
		String name;
		do {
			System.out.print("What is your name? ");
			name = in.nextLine();
		} while (!name.equals("Mr. Lee"));

		System.out.println("You are welcome into the secret secret pogchamp club.");

		//Run the code. Explain the code in your own words
		//The code asks the user for their name. 
		//It then checks if the name is not equal to "Mr. Lee"
		//If that condition is true, then it repeats the loop
		//The loop is repeated over and over until the name entered it "Mr. Lee"
		//Then it prints welcome to the secret club.

		//What code is repeated?
		//Everything in the braces after the do
		/*
		 * System.out.print("What is your name? ");
		 * name = in.nextLine();
		 */
		
		//When does it decide whether to repeat or not?
		//After the do is executed, through the while condition at the end.
		
		//What is the condition for repeating?
		//The name entered not being equals to "Mr. Lee"
		//(!name.equals("Mr. Lee"))


		/*
	     Note:Pay attention to the brackets, and the semicolon
		 */

		/*
	      When constructing a loop, there are many strategies. I like to 
	      break down the problems this way:
	        1. What commands am I going to repeat?
	        2. How many times/until when will I repeat the code?
		 */

		//Create a do-while loop that asks for a word, and 
		//prints it out 20 times.
		
		System.out.print("Enter a word: ");
		String word = in.nextLine();
		int timesRepeated = 0;
		
		do {
			System.out.println(word);
			timesRepeated ++;
		} while (timesRepeated < 20);
		
		in.close();
	}
}