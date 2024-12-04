package unit2;

import java.util.Scanner;

/**
 * Description: This program is a work sheet that demonstrates the switch statement.
 * Date: November 12, 2024
 * @author Misha Buterin
 */
public class Switch2 {
	/**
	 * This is the entry point to the program.
	 * @param args
	 */
	public static void main(String[] args) {
		/*Create a program that asks for a month, and print out how many days there are in that month. (For "February", just put 28). This will be a part of your portfolio.
	    Challenge: Ask for the year, and change "February" to 29 if the year is a leap year (divisible by 4)
		 */
		//Can you create it such that you can remove some breaks?

		Scanner sc = new Scanner(System.in);
		
		//Getting user input
		System.out.print("Enter the name of any month: ");
		String month = sc.nextLine();
		month = month.toLowerCase();
		
		System.out.print("Enter the year: ");
		int year = sc.nextInt();

		int monthDays = 30; //Placeholder value so that the program can run.

		//Assigning the correct number of days to the month
		switch (month) {
			case "january":
			case "march":
			case "may":
			case "july":
			case "august":
			case "october":
			case "december":
				monthDays = 31;
				break;	
			case "april":
			case "june":
			case "september":
			case "november":
				monthDays = 30;
				break;
			case "february":
				if (year%4 == 0) {
					monthDays = 29;
				}
				else {
					monthDays = 28;
				}
				break;
			default:
				System.out.println("That month does not exist.");
		}
		
		//Printing output
		System.out.println(month + " has " + monthDays + " days.");
		
		sc.close();
	}
}