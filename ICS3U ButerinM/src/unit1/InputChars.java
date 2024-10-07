package unit1;

import java.util.Scanner;

/**
 * Description: This program asks for and prints 3 characters.
 * Date: October 3, 2024
 * @author Misha Buterin
 */
public class InputChars {
/**
 * Entry point to the program.
 * @param args
 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//declaring variables
		char ch1, ch2, ch3;
		//getting user input
		System.out.println("Type in any three characters on the keyboard");
		System.out.println("Press <Enter> after each.");
		ch1 = sc.nextLine().charAt(0);
		ch2 = sc.nextLine().charAt(0);
		ch3 = sc.nextLine().charAt(0);
		//printing output
		System.out.println();
		System.out.print("Together these 3 letters spell: " + (ch1 + ch2 + ch3));
		sc.close();
	}

}
