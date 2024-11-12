package unit2;

import java.util.Scanner;

/**
 * Description: This program is a work sheet that demonstrates the switch statement.
 * Date: November 11, 2024
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
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the name of any month: ");
		String month = sc.nextLine();
		month = month.toLowerCase();
		int monthDays;

		switch (month) {
		case "january":
			monthDays = 31;
			break;
		case "february":
			monthDays = 28;
			break;
		case "march":
			monthDays = 31;
			break;
		case "april":
			monthDays = 30;
			break;
		case "may":
			monthDays = 31;
			break;
		case "june":
			monthDays = 30;
			break;
		case "july":
			monthDays = 31;
			break;
		case "august":
			monthDays = 31;
			break;
		case "septmeber":
			monthDays = 30;
			break;
		case "october":
			monthDays = 31;
			break;
		case "november":
			monthDays = 30;
			break;
		case "december":
			monthDays = 30;
			break;		
		}
		//Can you create it such that you can remove some breaks?
	}
}