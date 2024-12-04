package unit2;

import java.util.Scanner;

/**
 * Description: This program is a work sheet about flow charts.
 * Date: November 22, 2024
 * @author Misha Buterin
 */
public class FlowChartChallenge {

	public static void main(String[] args) {
		/*Create a flow chart for this program. Add the Share link
	    to your flowchart as a comment in this program.

	    https://drive.google.com/file/d/17mfUdPqGNzpcmKm-AmmQ4vdIBz93cYyv/view?usp=sharing

	    How would the flow chart of the do-while loop
	     and while loop differ?

	     For a while loop, the condition test (diamond) goes before the contents of the loop (parallelogram(s)).
	     For a do-while loop, the diamond would go after the parallelogram.
	     This is because in a while loop, the condition is tested at the start of the loop while in a do-while loop
	     the condition is tested at the end of the loop.
		 */

		Scanner sc = new Scanner(System.in);
		String name;
		do {
			System.out.print("What is your name? ");
			name = sc.nextLine();
		} while (!name.equals("Ms. Kemp"));

		System.out.println("You are welcome into the secret secret pogchamp club.");

		sc.close();

	}
}