package unit1;

import java.text.DecimalFormat;
import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

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
		System.out.print("\nWelcome to Ms. Buterin's Grocery!\nWhat is the first product would you like to buy?");
		item1 = sc.nextLine();
		System.out.print("How much does it cost?");
		price1 = sc.nextDouble();
		System.out.print("How many are you buying?");
		quantity1 = sc.nextInt();
		System.out.println("Great!");
		sc.nextLine();

		//Collecting input for the second item.
		System.out.print("\nWhat is the second product would you like to buy?");
		item2 = sc.nextLine();
		System.out.print("How much does it cost?");
		price2 = sc.nextDouble();
		System.out.print("How many are you buying?");
		quantity2 = sc.nextInt();
		System.out.println("Perfect!");

		//Calculations
		double totalPrice1 = price1*quantity1;
		double totalPrice2 = price2*quantity2;

		//Getting date and time.
		LocalDateTime now = LocalDateTime.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yy HH:mm");
		String formattedDateTime = now.format(formatter);

		//Printing output.
		System.out.println("\nHere is your reciept:\n");

		//Formatting title.
		String title = "Ms. Buterin's Grocery";
		int totalWidth = 54;
		int padding = (totalWidth - title.length()) / 2;
		String centeredTitle = String.format("%" + padding + "s%s%" + padding + "s", "", title, "");
		System.out.println(centeredTitle);

		//Printing output.
		System.out.println(formattedDateTime);
		System.out.println("-----------------------------------------------------");
		System.out.format("%-13s%-13s%-13s%-13s%-1s", "|Item Name", "|Price", "|Quanity", "|Total Price", "|");
		System.out.println("\n|------------|------------|------------|------------|");
		System.out.format("%-2s%-10s%-4s%9s%-4s%9s%-4s%9s%-1s", "|", item1, " | $", money.format(price1), " |", quantity1, " | $", money.format(totalPrice1), " |");
		System.out.format("\n%-2s%-10s%-4s%9s%-4s%9s%-4s%9s%-1s", "|", item2, " | $", money.format(price2), " |", quantity2, " | $", money.format(totalPrice2), " |");
		System.out.println("\n|---------------------------------------------------|");
		double subtotal = totalPrice1 + totalPrice2;
		System.out.format("%-1s%41s%9s%2s", "|", "Subtotal: $", money.format(subtotal), "|");
		double taxPrice = taxRate * subtotal;
		System.out.format("\n%-1s%41s%9s%2s", "|", "Tax: $", money.format(taxPrice), "|");
		double total = subtotal + taxPrice;
		System.out.format("\n%-1s%41s%9s%2s", "|", "Total: $", money.format(total), "|");
		System.out.println("\n-----------------------------------------------------");

		System.out.println("\nThis is approximately $" + Math.round(total) + ".");
		System.out.println("\nThank you for shopping at Ms. Buterin's Grocery.\nHave a great day!");
		sc.close();

	}

}
