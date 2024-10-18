package unit1;

import java.text.DecimalFormat;
import java.util.Scanner;
/**
 * Description:
 * Date:
 * @author Misha Buterin
 */
public class GroceryShopping {
	/**
	 * This is the entry point to the program.
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		//Title
		System.out.println("|| $$$ \\\\\\ ========= \"Ms. Buterin's Grocery\" ========= /// $$$ ||");
		
		//Declaring variables
		String item1, item2;
		double price1, price2;
		int quantity1, quantity2;
		final double taxRate = 0.13;
		
		//Formatting
		DecimalFormat money = new DecimalFormat("0.00");
		
		//Collecting input for the first item.
		System.out.println("Welcome to Ms. Buterin's Grocery! What is the first product would you like to buy?");
		item1 = sc.nextLine();
		System.out.println("How much does it cost?");
		price1 = sc.nextDouble();
		System.out.println("How many are you buying?");
		quantity1 = sc.nextInt();
		System.out.println("Great!");
		sc.nextLine();
		
		//Collecting input for the second item.
		System.out.println("What is the second product would you like to buy?");
		item2 = sc.nextLine();
		System.out.println("How much does it cost?");
		price2 = sc.nextDouble();
		System.out.println("How many are you buying?");
		quantity2 = sc.nextInt();
		System.out.println("Perfect!");
		
		//Printing output.
		System.out.println("Here is your reciept:");
		System.out.println("Ms. Buterin's Grocery"); //Research how to get date and time
		System.out.println("\n-----------------------------------------------------");
		System.out.format("%-13s%-13s%-13s%-13s%-1s", "|Item Name", "|Price", "|Quanity", "|Total Price", "|");
		System.out.println("\n|------------|------------|------------|------------|");
		System.out.format("%-2s%-10s%-4s%9s%-4s%9s%-4s%9s%-1s", "|", item1, " | $", money.format(price1), " |", quantity1, " | $", money.format(price1*quantity1), " |");
		System.out.format("\n%-2s%-10s%-4s%9s%-4s%9s%-4s%9s%-1s", "|", item2, " | $", money.format(price2), " |", quantity2, " | $", money.format(price2*quantity2), " |");
		System.out.println("\n-----------------------------------------------------");
		//System.out.println("\nThank you for shopping at Ms. Buterin's Grocery.\nHave a great day!");
		sc.close();

	}

}
