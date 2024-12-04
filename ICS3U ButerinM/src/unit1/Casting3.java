package unit1;

/**
 * Description: This program is a worksheet that demonstrates casting, specifically between Strings and other data types.
 * Date: October 15, 2024
 * @author Misha Buterin
 */
public class Casting3 {

	/**
	 * This is the entry point to the program.
	 * @param args unused
	 */
	public static void main(String[] args) {
		/* 
		 * Strings and Back Again
		 */
		//Recall:
		System.out.println("Part 1");
		System.out.println("1 + 2 + 3" + 4 + 5);
		//why did it print out this way?
		//It printed this because 1 + 2 + 3 are inside quotation marks, making them a string, while
		//+ 4 + 5 are outside the quotes so they are printed as regular numbers being added next the string.

		//Demonstrate casting a double value to a String in this way
		double myDouble = 10.0;
		System.out.println("10.0" + 3.7);

		//Demonstrate casting a boolean value to a String in this way
		boolean myBoolean = true;
		System.out.println("true" + 3);

		//Demonstrate casting a char value to a String in this way
		char myChar = 'm';
		System.out.println("m" + 4);

		System.out.println("\nPart 2");
		//In order to change a String into an integer, we need another set of code

		String strNum = "-5";
		int myNum = Integer.parseInt(strNum);

		System.out.println(strNum + " x 2 = " + (myNum + myNum));

		/*Change strNum to the following values, and see if they work:
		 * "25.2" Did not work, printed an error.
		 * "23c" Did not work, printed an error.
		 * "2 3" Did not work, printed an error.
		 * "Lol23" Did not work, printed an error.
		 * "-5" Worked.
		 */
		//What can you say about how we can use the function, Integer.parseInt()?
		//You can use this function to convert a string to an integer, but only if the original string can be an integer
		//For example if the original string is 2 it will work, but if it is a double such as 2.3 it will not work and print an error.

		// What do you think the code to change a String to double would look like?
		String strDouble = "12.6";
		double doubleNum = Double.parseDouble(strDouble);
		System.out.println(doubleNum);

		//Similarly, test out the code and write down what instructions
		//I tested the code and it worked, printing 12.6.
		//Instructions:
		//First I declared a string and gave it a numerical value that can be stored in a double.
		//Then I used the function "Integer.parseInt(strNum)" from above, but altered it to work for a double, not an int.
		//Lastly I printed out my string which is now converted to a double.

		//When do you think it might be necessary to change a string value into an integer value/double value?
		//If you ever need to do any arithmetic operations to two strings, you can convert them to integers or doubles.
		
	}
}