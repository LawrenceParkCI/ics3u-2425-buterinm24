package unit1;

import java.util.Scanner;

/**
 * Description: This program calculates the area and volume of a rectangle.
 * Date: October 2, 2024
 * @author Misha Buterin
 */
public class RectangleArea {
/**
 * Entry point to the program.
 * @param args
 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//declare variables
		int length, width, depth;
		
		//get user input
		System.out.println("AREA PROGRAM");
		System.out.print("Type in the length of the rectangle and <Enter>: ");
		length = sc.nextInt();
		
		System.out.print("Type in the width of the rectangle and <Enter>: ");
		width = sc.nextInt();
		
		System.out.print("Type in the depth of the rectangle and <Enter>: ");
		depth = sc.nextInt();
		
		//calculate area
		int area = length * width;
		
		//calculate volume
		int volume = length*width*depth;
		
		//print output
		System.out.println("The area of your rectangle is " + area);
		System.out.println("The volume of your rectangle is " + volume);
		sc.close();

	}

}
