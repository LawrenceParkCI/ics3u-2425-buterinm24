package unit2;
/**
 * Description: This program is a work sheet about boolean operators and expressions.
 * Date: November 4, 2024
 * @author Misha Buterin
 */
public class BasicBoolean {
	/**
	 * This is the entry point to the program.
	 * @param args
	 */
	public static void main(String[] args) {
		//we've declared a variable called isPurple of boolean type
		//Recall: boolean holds either true or false
		boolean isPurple = false;

		/*
	      Boolean Operators, Expressions
		 */

		//boolean expressions are ways we can "calculate" whether
		//something is true or false

		int firstNum = 5;
		int secondNum = 10;
		double thirdNum = 5.5;

		//this prints out true because 5 is less than 10.
		System.out.println("1: " + (firstNum < secondNum)); 

		//this prints out false because 5 is not greater than 10.
		System.out.println("2: " + (firstNum > secondNum)); 

		//this prints out true because (int)thirdNum equals 5, which is equal to firstNum.
		System.out.println("3: " + (firstNum <= (int)thirdNum)); 

		//this prints out true because 5 is less than 5.5.
		System.out.println("4: " + (firstNum <= thirdNum)); 

		/*Test out these boolean operators. Figure out the meaning
		 * > means: Greater than
		 * < means: Less than
		 * <= means: Less than or equal to
		 * >= means: Greater than or equal to
		 * == means: Equals
		 * != means: Does not equal
		 */

	}
}