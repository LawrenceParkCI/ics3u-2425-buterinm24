package unit1;

import java.text.NumberFormat;
import java.util.Scanner;
/**
 * Description: This program is a work sheet that demonstrates number formatting.
 * Date: October 17, 2024
 * @author Misha Buterin
 */
public class NFOutput {
	/**
	 * Entry point to the program.
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final double TAX_RATE = 0.13;
		NumberFormat money = NumberFormat.getCurrencyInstance();
		NumberFormat percent = NumberFormat.getPercentInstance();

		double cost;
		System.out.print("Please enter the cost of an item then press <Enter>: $");
		cost = sc.nextDouble();
		double total = cost + (cost * TAX_RATE);
		System.out.println("The cost of your item with tax is " + money.format(total));
		System.out.println("The tax rate is " + percent.format(TAX_RATE));

		//How can you change how your value is displayed?
		//I can change how my value is displayed by changing what comes after NumberFormat. .
		//For example, getCurrencyInstance and getPercentInstance are two ways to display my value.
		//To use these formats I can do x.format(); with whatever format I choose.

		//What other formats does NumberFormat offer?
		/*
		 * getIntegerInstance:
		 * Returns an integer number format for the current default FORMAT locale.
		 * The returned number format is configured to round floating point numbers to the nearest integer 
		 * using half-even rounding (see RoundingMode.HALF_EVEN) for formatting, and to parse only the integer 
		 * part of an input string (see isParseIntegerOnly). 
		 */

		//getNumberInstance:
		//Returns a general-purpose number format for the current default FORMAT locale. 

		//getInstance:
		//This format does the same thing as getNumberInstance.

		//getCompactNumberInstance:
		//Returns a compact number format for the default FORMAT locale with "SHORT" format style.

		sc.close();
	}

}
