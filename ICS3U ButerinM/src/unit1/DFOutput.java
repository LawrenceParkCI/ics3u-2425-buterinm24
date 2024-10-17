package unit1;

import java.text.DecimalFormat;
import java.util.Scanner;
/**
 * Description: This program is a work sheet that demonstrates formatting decimals.
 * Date: October 17, 2024
 * @author Misha Buterin
 */
public class DFOutput {
/**
 * Entry point to the program.
 * @param args
 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		//Run the following program with a cost of 10.00.
		//What value is displayed in the output?
		//11.3

		final double TAX_RATE = 0.13;
		DecimalFormat money = new DecimalFormat("$#,###,##0.00");
		DecimalFormat percent = new DecimalFormat("#.#%");

		double cost;
		System.out.print("Please enter the cost of an item then press <Enter>: $");
		cost = sc.nextDouble();
		double total = cost + (cost * TAX_RATE);

		System.out.println("The cost of your item with tax is " + money.format(total));


		//Change the above print statement on line 19 to:
		//System.out.println("The cost of your item with tax is " + money.format(total));
		//Run the program again, how is the output different? Why?
		//The output is now 11.30, which differs from the first output because it has one more decimal place.
		//The output changed because of the money.format function, which formats a number into the standard currency format(2 decimal places).

		//Modify the parameter for the DecimalFormat on line 15 to be "$0.00"
		//Run the program again with the cost of 10, how is the output different?
		//The output is now $11.30. The difference from before is that there is now a dollar sign before the value.

		//Modify the parameter for the DecimalFormat on line 15 to be "$0.##"
		//Run the program again with the cost of 10, how is the output different?
		//The output is now $11.3. This is different because one decimal place was lost.

		//Modify the parameter for the DecimalFormat on line 15 to be "$0.##"
		//Calculate 10.50 x 1.13 = 11.865
		//Run the program again with the cost of 10.50, what is happening?
		//The output is now $11.87. The program is rounding the value to be in a standard currency format, which is two decimal places.
		//5 rounds up so .865 becomes .87.

		//Modify the parameter for the DecimalFormat on line 15 as you think is appropriate for money.
		//Run the program again with the cost of 123456, what is displayed?
		//$139505.28 is displayed. I didn't modify the parameter because it was already displaying two decimal places.
		//Two decimal places is what I think is appropriate for money.

		//Modify the parameter for the DecimalFormat on line 15 to be "$#,###,##0.00"
		//Run the program again with the cost of 123456, how is the output different? Explain what is happening.
		//The output is now $139,505.28 which is different because there is a comma separating the thousands from the hundreds places.
		//This is happening because of the commas between the hash tags in $#,###,##0.00, which make it so that
		//commas are displayed after every 3 digits.

		//Uncomment the following print line, and run the program with any value for the cost.
		//What value is printed for the TAX_RATE?
		//I entered the value 5. 0.13 is printed as the value of TAX_RATE.
		System.out.println("The tax rate is " + percent.format(TAX_RATE));

		//Change the above print statement to format the TAX_RATE using the percent DecimalFormat instance.
		//Run the program again with any cost, how is the TAX_RATE displayed differently?
		//The tax rate is now displayed as 13%.

		sc.close();
	}

}
