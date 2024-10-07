package unit1;

import java.util.Scanner;

/**
 * Description: This program calculates how long someone has been alive and sleeping, based on their input.
 * Date: October 7, 2024
 * @author Misha Buterin
 */
public class Alive {
/**
 * Entry point to the program.
 * @param args
 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("A L I V E\n-------------------------------------------------------");
		//Declaring variables
		int year1, year2, month1, month2, day1, day2;
		
		//Collecting user input
		System.out.println("Want to find out how long you've been alive and asleep?\n\nFirst, enter your birthdate. ");
		System.out.println("Year: ");
		year1 = sc.nextInt();
		System.out.println("Month: ");
		month1 = sc.nextInt();
		System.out.println("Day: ");
		day1 = sc.nextInt();
		
		System.out.println("\nGreat! Now enter todays date. ");
		System.out.println("Year: ");
		year2 = sc.nextInt();
		System.out.println("Month: ");
		month2 = sc.nextInt();
		System.out.println("Day: ");
		day2 = sc.nextInt();
	  
		//Calculations
		int alive, sleep;
		alive = (((year2 - year1 - 1)*365) + ((12 - month1)*30 + 30 - (day1 -1)) + ((month2 - 1)*30 + day2)) ;
		sleep = alive * 8;
		//These calculations are based on the idea that 1 month is 30 days, 1 year is 365 days, and you sleep 8 hours a day.
	
		//Printing output
		System.out.println("\nR E S U L T S \n----------------------------------\n");
		System.out.println("You have been alive for " + alive + " days.");
		System.out.println("\nYou have slept " + sleep + " hours.");
		System.out.println("\n----------------------------------\nWow! That's a lot.\nThanks for playing!! :)");
		sc.close();


	}

}
