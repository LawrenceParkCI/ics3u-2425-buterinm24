package unit1;

import java.util.Scanner;

/**
 * Description: This program uses user input to calculate the cost of a carpet for a rectangular room.
 * Date: October 8, 2024
 * @author Misha Buterin
 */
public class Carpet {
/**
 * Entry point to the program.
 * @param args
 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Title
		System.out.println("C A R P E T  C O S T\n--------------------");
		double length, width, costPerMeter, totalCost;
		// I used a double in case the length of their room or cost per meter is a decimal amount.
		
		//Getting user input
		System.out.println("Want to find out the cost of getting a carpet in your room?\n...................................................................");
		System.out.println("\nType in the length of your carpet in meters and press <Enter>: ");
		length = sc.nextDouble();
		System.out.println("Type in the width of your carpet in meters and press <Enter>: ");
		width = sc.nextDouble();
		System.out.println("Type in the cost per square-meter of your carpet and press <Enter>: ");
		costPerMeter = sc.nextDouble();
		System.out.println("...................................................................");
		
		//Calculating
		totalCost = length*width*costPerMeter;
		
		//Printing output
		System.out.println("R E S U L T S\n-------------");
		System.out.format("The cost of a carpet in your room will be: $%.2f",totalCost);
		System.out.println("\nHope that was helpful!");
		sc.close();

	}

}
