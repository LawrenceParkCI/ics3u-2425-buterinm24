package unit2;

/**
 * Description: This program simulates rolling dice for a user and a computer, and then comparing results.
 * Date: November 18, 2024
 * @author Misha Buterin
 */
public class DoubleDiceContest {
/**
 * This is the entry point to the program.
 * @param args
 */
	public static void main(String[] args) {
		/*
		 * Write code that simulates rolling two dice for the user and then two dice for the computer. 
		 * The program should output the total of the two dice for both the user and the computer, 
		 * then announce who won: the computer, the user, or say it was a tie.
		 */
		
		int userDie1 = (int)(Math.random()*6 + 1);
		int userDie2 = (int)(Math.random()*6 + 1);
		int userTotal = userDie1 + userDie2;
		
		int computerDie1 = (int)(Math.random()*6 + 1);
		int computerDie2 = (int)(Math.random()*6 + 1);
		int computerTotal = computerDie1 + computerDie2;
		
		System.out.println("The total of the two dice for the user is " + userTotal);
		System.out.println("The total of the two dice for the computer is " + computerTotal);
		
		if (userTotal > computerTotal) {
			System.out.println("The user won.");
		}
		else if (userTotal < computerTotal) {
			System.out.println("The computer won. ");
		}
		else {
			System.out.println("The user and computer tied.");
		}

	}

}
