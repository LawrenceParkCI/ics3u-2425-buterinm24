package unit2;

import java.util.Scanner;

/**
 * Description: This program counts the number of each nucleotide in a DNA string.
 * Date: November 26, 2024
 * @author Misha Buterin
 */
public class DNAStringChallenge {
/**
 * This is the entry point to the program.
 * @param args
 */
	public static void main(String[] args) {
		/**
	      http://rosalind.info/problems/dna/
		 */
		
		Scanner sc = new Scanner(System.in);
		
		//Title
		System.out.println("Counting DNA Nucleotides!\n-------------------------");
		
		//Getting user input
		System.out.print("Please enter the DNA string: ");
		String DNA = sc.nextLine();
		
		//Creating and initializing variables
		int numOfA = 0, numOfC = 0, numOfG = 0, numOfT = 0;
		int length = DNA.length();
		
		//Counting nucleotides using for loop
		for (int i = 0; i < length; i++) {
			char letter = DNA.charAt(i);
			
			if (letter == 'A') {
				numOfA++;
			}
			else if (letter == 'C') {
				numOfC++;
			}
			else if (letter == 'G') {
				numOfG++;
			}
			else if (letter == 'T') {
				numOfT++;
			}
		}
		
		//Printing results
		System.out.println("\nHere is the number of nucleotides (A, C, G, T):");
		System.out.println("\n" + numOfA + " " + numOfC + " " + numOfG + " " + numOfT);
	
		sc.close();
		
	}
}