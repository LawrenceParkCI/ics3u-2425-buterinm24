package unit2;
/**
 * Description: This program prints a random number between 100-1000
 * Date: November 18, 2024
 * @author Misha Buterin
 */
public class Randomness {
/**
 * This is the entry point to the program.
 * @param args
 */
	public static void main(String[] args) {
		
		//Defining range
		int max = 1000;
		int min = 100;
		int range = max - min + 1;
		
		//Generating numbers
		for (int i = 0; i < 1; i++) {
			System.out.println((int)(Math.random()*range + min));
		}

		//Run the program a few times. What do you think is the 
		//range of the numbers generated?
		//The range of numbers generated are doubles between 0 and 1.
		
		//Read the demo program. Write the code so that the program 
		//will produce a random number between 100 and 1000.

	}
}