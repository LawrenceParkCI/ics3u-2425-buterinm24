package unit2;

import java.util.Scanner;

/**
 * Description: This program tests if an integer is odd or even and then prints the results.
 * Date: November 1, 2024
 * @author Misha Buterin
 */
public class OddEven {
	/**
	 * This is the entry point to the program
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		//Title
		System.out.println("ODD OR EVEN?\n------------");
		
		//Getting user input
		System.out.print("Type in any integer and press <Enter>: ");
		int num = sc.nextInt();
		
		//Testing if it's odd or even and printing output
		if (num%2 == 0) {
			System.out.println("Your integer is even.");
		}
		else {
			System.out.println("Your integer is odd.");
		}
		
		sc.close();

	}

}
