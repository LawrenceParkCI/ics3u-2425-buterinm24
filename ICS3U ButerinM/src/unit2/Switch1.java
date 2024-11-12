package unit2;

import java.util.Scanner;

/**
 * Description: This program is a work sheet about switch statements.
 * Date: November 12, 2024
 * @author Misha Buterin
 */
public class Switch1 {
	/**
	 * This is the entry point to the program.
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("What number day is it?");
		int day = in.nextInt();

		switch(day) {
		case 1:
			System.out.println("Sunday");
			break;
		case 2:
			System.out.println("Monday");
			break;
		case 3:
			System.out.println("Tuesday");
			break;
		case 4:
			System.out.println("Wednesday");
			break;
		case 5:
			System.out.println("Thursday");
			break;
		case 6:
			System.out.println("Friday");
			break;
		case 7:
			System.out.println("Saturday");
			break;
		default:
			System.out.println("We don't have that day yet");
			break;
		}

		//Run the program. Type in a number between 1-7, and then a number bigger than that. What is the result?
		//For the numbers 1-7, the respective days are printed out based on what case it is (1 = Sunday, 2 = Monday, etc.)
		//For any number greater than 7, "We don't have that day yet" is printed out because it is the default result.

		//What do you think default means?
		//I believe that default means that if none of the cases are true, then this is what should be printed. 
		//default is essentially like else in an if statement.

		//What do you think break means? What happens when you remove a break?
		//break tells the program to stop looking at other cases since this one is already true.
		//When I removed a break, the program printed the day that matches the number, and every day after that.
		//For example, I removed the break in case 6, and then inputed the number 6. The output was Friday Saturday
		//because the program wasn't told to stop after one case was true.

		//Create another program, this time asking what day it is (String), and printing out how many days until the weekend

		Scanner sc = new Scanner(System.in);

		//Getting user input
		System.out.print("What day is it today? ");
		String weekDay = sc.nextLine();

		weekDay = weekDay.toLowerCase(); //Making formats match up
		
		//Printing output
		switch (weekDay) {
			case "monday":
				System.out.println("There are 5 days until the weekend.");
				break;
			case "tuesday":
				System.out.println("There are 4 days until the weekend.");
				break;
			case "wednesday":
				System.out.println("There are 3 days until the weekend.");
				break;
			case "thursday":
				System.out.println("There are 2 days until the weekend.");
				break;
			case "friday":
				System.out.println("There is one day until the weekend!");
				break;
			case "saturday":
				System.out.println("It's the weekend!");
				break;
			case "sunday":
				System.out.println("It's the weekend");	
				break;
			default:
				System.out.println("The day you entered does not exist.");
				break;
		}
		
		sc.close();
	}
}