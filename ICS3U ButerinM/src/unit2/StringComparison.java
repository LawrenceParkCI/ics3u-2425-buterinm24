package unit2;

import java.util.Scanner;

/**
 * Description: This program prints a work sheet about String comparison.
 * Date: November 11, 2024
 * @author Misha Buterin
 */
public class StringComparison {
	/**
	 * This is the entry point to the program.
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		String answer;

		System.out.println("What is the capital of Ontario?");
		answer = in.nextLine();

		if (answer == "Toronto") {
			System.out.println("Correct!");
		} else {
			System.out.println("Sorry, that's incorrect.");
		}

		//Run the code. What happens when you type the correct answer? The incorrect answer?
		//Both the correct and incorrect answers print out "Sorry, that's incorrect."
		//This is because Strings are not a primitive data type so they cannot be
		//compared as if they are.

		/*
		      Strings are objects, not primitives and as such are a 
		      *reference* data type. These variables hold an address 
		      to the value. (Scanner is also a reference data type)

		      int, double, char, etc. are all *primitive* data types. 
		      These variables hold the actual value.

		      Look at the website:
		      https://www.javatpoint.com/string-comparison-in-java

		      Demonstrate the use of the functions:
		        .compareTo()
		        .equals()
		        .equalsIgnoreCase()
		 */
		//Using the examples from the website:

		//.compareTo()
		String str1 = "A";  
		String str2 = "B";  
		String str3 = "C";  
		System.out.println(str1.compareTo(str2)); //Result: -1 
		System.out.println(str1.compareTo(str3)); //Result: -2   
		System.out.println(str3.compareTo(str1)); //Result: 2

		//.equals()
		String s1="A";  
		String s2="A";  
		String s3="A";  
		String s4="B";  
		System.out.println(s1.equals(s2)); //Result: true
		System.out.println(s1.equals(s3)); //Result: true
		System.out.println(s1.equals(s4)); //Result: false 

		//.equalsIgnoreCase()
		String string1 = "Misha";  
		String string2 = "miSHa";  
		System.out.println(string1.equalsIgnoreCase(string2)); //Result: true

		//What values does compareTo() return? How can we 
		//interpret the value?

		//compareTo() returns integer values, (positive, negative, or 0)
		//These values can be interpreted as how far apart are the first letters
		//in each String (or second, third, etc if the first letters are the same)
		//This method calculates the output using the ASCII values of letters.

		//what value does equals() and equalsIgnoreCase() return? 
		//equals() and equalsIgnoreCase() return boolean values (true or false).

		//What is the difference between these two functions?
		//equals() takes into account capitalization, so Misha and misha are not equal.
		//equalsIgnoreCase ignores capitalization and only considers the actual letters,
		//so Misha and misha would be equal because they have the same letters.

		in.close();
	}
}