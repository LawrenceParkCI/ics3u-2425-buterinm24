package unit2;
/**
 * Description: This program is a work sheet on tracing.
 * Date: November 27, 2024
 * @author Misha Buterin
 */
public class Tracing2 {
	/**
	 * This is the entry point to the program.
	 * @param args
	 */
	public static void main(String[] args) {
		int num = 500;

		while (num > 1) {
			if (num % 2 == 0) {
				num = num / 2;
			} else if (num % 3 == 0) {
				num = num + 7;
			} else  {
				num = num + 1;
			}
		}
		System.out.println(num);
	}
}