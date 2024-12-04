package unit1;

import java.util.Scanner;

/**
 * Description: This program is a work sheet about using math methods.
 * Date: October 10, 2024
 * @author Misha Buterin
 */
public class UsingMathMethods {

	/**
	 * Entry point to the program.
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double num;
		
		System.out.println("Part A");
		
		//Write code to ask the user for any real number to be input.
		System.out.println("Type in a real number and press <Enter>: ");
		
		//Store their input into the num variable
		num = sc.nextDouble();

		System.out.println(Math.round(num));
		System.out.println(Math.rint(num));
		System.out.println(Math.sqrt(num));
		System.out.println(Math.abs(num));
		System.out.println(Math.pow(num, 2));
		System.out.println(Math.pow(num, num));
		System.out.println(Math.pow(num, 3));
		
		/*
		 * Run the program and write down the output that is produced
		 * when each of the following values are input:
		 * 
		 * 					num = 16.75		            | num = 4.0	| num = -23.45
		 * 					-----------------------------------------------------------
		 * Math.round(num)		17		                | 	4		| -23
		 * Math.rint(num)		17.0		            | 	4.0		| -23.0
		 * Math.sqrt(num)		4.092676385936225		|	2.0		| NaN
		 * Math.abs(num)		16.75			        |	4.0		| 23.45
		 * Math.pow(num, 2)		280.5625             	|	16.0	| 549.9024999999999
		 * Math.pow(num, num)	3.178689376746782E20   	|	256.0	| NaN
		 * Math.pow(num, 3)		4699.421875	           	|	64.0	| -12895.213624999999
		 * 
		 */
		
		//Why does the last value(-23.45) give strange output for Math.sqrt(num)?
		//Because you cannot square root a negative number.
		//Therefore the computer result prints NaN, Not a Number.
		
		//Nan stands for Not a number!
		
		//In your own words describe what the following Math methods does
		/*
		 * round: Rounds a number to the nearest integer (no decimal points)
		 * rint: Rounds a number to a double, adding a .0 to the end of the rounded number.
		 * sqrt: Prints the square root of a number
		 * abs: Prints the absolute value of a number, for example |-23.45| is 23.45, the negative is discarded.
		 * pow: Multiples any number by a chosen exponent.
		 */
		
		//The methods round, sqrt and abs only have one parameter (which is in the brackets).
		//Why does the pow method have 2 parameters? Explain the purpose of these 2 parameters.
		//The method pow needs two values, a base and exponent. The two values tell the method 
		//what number it is multiplying (first parameter), and by what exponent (second parameter).
		
		System.out.println("\nPart B");
		//Ask the user for any real number and an integer to be input. Display the real number,
		//and its square root. Also determine and display the real number raised to the integer power.
		double realNum;
		double realNum2;
		System.out.println("Type in a real number and press <Enter>: ");
		realNum = sc.nextDouble();
		System.out.println("Now type in another real number for your power and press <Enter>: ");
		realNum2 = sc.nextDouble();
		
		//Use suitable headings, displaying the results across the screen.\
		System.out.format("%-20s%-20s%-20s", "REAL NUMBER: ", "SQUARE ROOT: ", "RAISED TO THE POWER OF: " + realNum2);
		System.out.format("\n%-20s%-20s%-20s",realNum, Math.sqrt(realNum), (Math.pow(realNum, realNum2)));
		
		//Eg. If the real number 13.5 and the integer 2 are input, display
		//REAL NUMBER	SQUARE ROOT		RAISED TO POWER 2 <- display power here
		//   13.5		   3.6742			182.25
		
		//Write down the results produced by your program when the real number 7.8985 and
		//the integer 3 are input.
		//Real number: 7.8985
		//Square root: 2.8104270138183627
		//Raised to power 3: 492.75820832162503
		
		//Change your program so that instead of inputting an integer power, a real number
		//power can be input.
		//Write down the results produced by your program when the following are input:
		
		//a) the number 16 and the real number power 0.5
		//Real number: 16.0
		//Square root: 4.0
		//Raised to power 0.5: 4.0
		
		//b) the number 8 and the real number power 0.33
		//Real number: 8.0
		//Square root: 2.8284271247461903
		//Raised to power 0.33: 1.9861849908740719
		
		//Does your program give a different answer if 0.3333333 is input instead of 0.33 for the power?
		//Yes, the first two answers stay the same, but the real number raised to power becomes:
		//1.9999998613705687 
		
		sc.close();
		
	}

}
