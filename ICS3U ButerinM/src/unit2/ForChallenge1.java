package unit2;

import java.util.Scanner;

/**
 * Description:
 * Date: November 25, 2024
 * @author Misha Buterin
 */
public class ForChallenge1 {
/**
 * This is the entry point to the program.
 * @param args
 */
	public static void main(String[] args) {
		/*
	      Create a program that asks for the starting number, the ending number, and how much you should count by. Then print out the numbers using a for loop.  You should be able to count by decimals.
	      ie.

	      Starting Num: 
	        0
	      Ending Num: 
	        1
	      Count by: 
	        0.1
	      Result: 
	        0 0.1 0.2 0.3 0.4 0.5 0.6 0.7 0.8 0.9 1.0
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number you would like to start counting from: ");
		int startNum = sc.nextInt();
		
		System.out.print("Enter the number you want to end at: ");
		int endNum = sc.nextInt();
		
		System.out.print("Enter the value that you would like to count by");
		double increment = sc.nextDouble();
		

		sc.close();
	}
}