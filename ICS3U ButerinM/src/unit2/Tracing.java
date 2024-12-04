package unit2;
/**
 * Description: This program is a work sheet on tracing.
 * Date: November 27, 2024
 * @author Misha Buterin
 */
public class Tracing {
	/**
	 * This is the entry point to the program.
	 * @param args
	 */
	public static void main(String[] args) {
		int num = 0;
		String word = "Que";

		while (num < 15) {
			System.out.println(word);
			num = num + 1;
		}
		word = word + word;
		while (num > 0) {
			System.out.println(word);
			num = num - 1;
		}
	}
}