package unit2;
/**
 * Description: This program is a work sheet about if statements.
 * Date: November 5, 2024
 * @author Misha Buterin
 */

import java.util.Scanner;

public class IfStatements2 {
	/**
	 * This is the entry point to the program.
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("What is your age?");
		int userAge = in.nextInt();
		/*
	    if (userAge > 18) { //If they're over 18, they are titled an adult
	      String title = "Adult";
	    } else {  //if they're not over 18, I don't want a title
	      System.out.println("Sorry, not quite yet.");
	    }

	    System.out.println(title);
		 */
		//Looking at the logic above, why do you think the 
		//program won't work? 
		//Because the variable title is only declared if the if statement is true.
		//Since userAge is needs to be inputed by the user, 
		//the program does not know if the if is true, and cannot declare the variable.

		//Copy the code below, and try to find a solution.
		/*
		String title = "Adult"; //Declaring the variable before the if statement
		if (userAge > 18) { //If they're over 18, they are titled an adult
			System.out.println(title); //Moved the println into the if statement.
		} else {  //if they're not over 18, I don't want a title
			System.out.println("Sorry, not quite yet.");
		}
		 */
		
		//Comment the code above to avoid compilation errors.

		in.close();
	}

}
