package unit1;
/**
 * Date: October 1, 2024
 * Description: This program is a work sheet about math operators
 * @author Misha Buterin
 */
public class MathOperators {
	/**
	 * Entry point to the program.
	 * @param
	 */
	public static void main(String[] args) {
		/*
		 * Pre: Kind of Math, but not really
		 * What do you notice is happening?
		 */ 
		// Words and integers are being added together and printed, but in different ways based on quotation marks.
		System.out.println("Butter" + "fly");

		System.out.println("1 + 2 + 3 + 4 + 5");

		System.out.println(1 + 2 + 3 + 4 + 5);

		System.out.println(1 + 2 + "3 + 4 + 5");

		System.out.println("1 + 2 + 3" + 4 + 5);

		//Why do you think the last two outputs act so differently?
		//Because of the placement of the quotation marks. The plus signs inside the quotes are printed but the plus signs outside the quotes are not printed.

		//Summary: What are two possible roles of the + operator?
		// Adding multiple strings or integers together.

		/*
        Part 1 
        Figure out what is the meaning of each operator. Use print statements
        to verify your answer and explain.
		 */

		// + means: Addition
		System.out.println("Addition: ");
		System.out.println(2 + 1);
		// - means: Subtraction
		System.out.println("Subtraction: ");
		System.out.println(2-1);
		// * means: Multiplication
		System.out.println("Multiplication: ");
		System.out.println(2*1);
		// / means: Division
		System.out.println("Division: ");
		System.out.println(2/1);
		//Print the following expression: (3 + 2) * 5
		System.out.println((3+2)*5);
		//Print the following expression: 3 + 2 * 5
		System.out.println(3+2*5);
		//Was this expected? Why or why not?
		// This was expected because brackets can make a big difference in math operations.
		/*
        Part 2 - Calculate Using Operators
        Print out, using one println statement, what 45 degrees Celsius is in Fahrenheit

        Print out, using a print and a println statement, what 900 Fahrenheit is in Celsius
		 */     
		System.out.println(45*9/5+32);
		System.out.println((900-32)*5/9);

		/*
        Part 3
        Figure out what is the meaning of % as a math operator. Use print statements
        to check your answer.
		 */
		System.out.println(3%3);
		System.out.println(7%2);

		//I think % means: 
		// % as a math operator means calculating the remainder when dividing integers. 
		// For example, 7/2 is 3 (in integer math), and since 3x2 is 6, the remainder is 1.
	}

}
