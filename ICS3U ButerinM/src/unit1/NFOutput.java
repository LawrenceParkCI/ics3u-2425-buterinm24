package unit1;

import java.text.NumberFormat;
import java.util.Scanner;

public class NFOutput {

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
		//I can change how my value is displayed by changing what comes after NumberFormat.
		//For example, getCurrencyInstance and getPercentInstance are two ways to display my value.
		//To use these format I can do x.format(); with whatever format I choose.
		
		//What other formats does NumberFormat offer?
		//getIntegerInstance
		//This format converts a value into an integer
		//getNumberInstance
		//getCompactNumberInstance
		NumberFormat integer = NumberFormat.getIntegerInstance();
		System.out.println(integer.format(total));

		


		sc.close();
	}

}
