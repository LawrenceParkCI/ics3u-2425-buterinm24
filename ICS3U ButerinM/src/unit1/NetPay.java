package unit1;
/**
 * Description: This program calculates an employees net pay.
 * Date: October 7, 2024
 * @author Misha Buterin
 */
public class NetPay {
/**
 * Entry point to the program.
 * @param args
 */
	public static void main(String[] args) {
		//Declaring variables
		int hours = 40;
		double wage = 5.00;
		double insurance = 2.00;
		double tax = 0.22;
		double netPay;
		//Calculating netPay
		netPay = (hours*wage-insurance) - tax*(hours*wage-insurance);
		//Printing output
		System.out.println("The employees net pay is " + netPay);

	}

}
