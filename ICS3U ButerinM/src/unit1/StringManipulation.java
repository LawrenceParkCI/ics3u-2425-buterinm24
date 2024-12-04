package unit1;

import java.util.Scanner;

/**
 * Description: This program asks a user for a sentence, and then manipulates that sentence in several ways.
 * Date: October 8, 2024
 * @author Misha Buterin
 */
public class StringManipulation {
	/**
	 * Entry point to the program
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		//Declaring variable
		String sentence;

		//Title
		System.out.println("S T R I N G  M A N I P U L A T I O N\n------------------------------------");

		//Getting user input
		System.out.println("Please type in a sentence of your choice and press <Enter>: ");
		sentence = sc.nextLine(); 

		//Printing output
		System.out.println("1. Your sentence:");
		System.out.println(sentence);
		System.out.println("\n2. Your sentence in all uppercase letters:");
		System.out.println(sentence.toUpperCase());
		System.out.println("\n3. Your sentence in all lowercase letters:");
		System.out.println(sentence.toLowerCase());
		System.out.println("\n4. The length of your sentence:");
		System.out.println(sentence.length() + " characters.");
		System.out.println("\n5. The character at index 5 in your sentence:");
		System.out.println(sentence.charAt(5) + " is at index 5 in your sentence.");
		
		//Bonus
		System.out.println("\n6. The first word in your sentence is:");
		int m = sentence.indexOf(" ");
		System.out.println(sentence.substring(0,m));
		sc.close();


	}

}
