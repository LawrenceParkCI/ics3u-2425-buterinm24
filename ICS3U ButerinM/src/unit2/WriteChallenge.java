package unit2;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

/**
 * Description: This program stores a users grades in a file called grades.txt
 * Date: November 27, 2024
 * @author Misha Buterin
 */
public class WriteChallenge {
/**
 * This is the entry point to the program.
 * @param args
 */
	public static void main(String[] args) {
		/*
	      Ask the user how many grades they want to enter. Write those grades into separates lines in a file called grades.txt.
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("How many grades would you like to enter? ");
		int numOfGrades = sc.nextInt();
		sc.nextLine();
		
		try {
			File file = new File("grades.txt");
			PrintStream output = new PrintStream(file);

			for(int i = 1; i <= numOfGrades; i++) {
				System.out.print("Enter grade " + i + ": ");
				String grade = sc.nextLine();
				output.println(grade);
			}
			
			output.close();
			System.out.println("Your grades have been saved to the file grades.txt.");
		}
		catch (IOException e) {
			System.out.println("Sorry, cannot write to that file.");
		}
		
	}
}