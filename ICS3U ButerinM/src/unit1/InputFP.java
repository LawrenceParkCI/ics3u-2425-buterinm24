package unit1;

import java.util.Scanner;

/**
 * Description: This program asks for and prints two floating point numbers.
 * Date: October 3, 2024
 * @author Misha Buterin
 */
public class InputFP {
/**
 * Entry point to the program.
 * @param args
 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//declaring variables
		double num1, num2;
		
		//getting user input
		System.out.println("Type a value for num1 and press <Enter>: ");
		num1 = sc.nextDouble();
		System.out.println("Type a value for num2 and press <Enter>: ");
		num2 = sc.nextDouble();
		
		//printing output
		System.out.println();
		System.out.println("The first number entered was " + num1);
		System.out.println("The second number entered was " + num2);
		
		sc.close();

	}

}
