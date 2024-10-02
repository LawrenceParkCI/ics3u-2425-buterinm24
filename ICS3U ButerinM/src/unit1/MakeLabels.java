package unit1;

import java.util.Scanner;

/**
 * Description: This program can print a label with someone's full name and subject.
 * Date: October 2, 2024
 * @author Misha Buterin
 */

public class MakeLabels {
/**
 * Entry point to the program
 * @param args
 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String name;
		System.out.println("Type in your name and press <Enter>");
		name = sc.nextLine();
		
		String subject;
		
		System.out.println("Type in the subject and press <Enter>");
		subject = sc.nextLine();
		
		System.out.println();
		System.out.println("******************************");
		System.out.println(name);
		System.out.println(subject);
		System.out.println("******************************");
		sc.close();

	}

}
