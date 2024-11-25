package unit2;
/**
 * Description: This program prints a work sheet about for loops.
 * Date: November 25, 2024
 * @author Misha Buterin
 */
public class For2 {
	/**
	 * This is the entry point to the program.
	 * @param args
	 */
	public static void main(String[] args) {
		//Recall - create a for loop printing 1 to 10:
		//for (int i = 1; i <= 10; i ++){
		//}

		//though we are repeating a certain number of times, we can use variables in our for loops as well

		int times = 20;

		for (int i = 15; i < times; i++) {
			System.out.println(i);
		}

		//In addition, the counter doesn't necessarily have to be an integer
		double increment = 0.1;
		for (double i = 0; i < 2; i += increment) {
			System.out.println(i);
		}

		//create a variable to store the starting number, and use it in a for loop. Be able to use a double value:
		double start;
		for (start = 1; start <= 2; start += 0.1) {
			System.out.println(start);
		}

		//Look at the following code. Explain what is happening?
		//In the following code, the integer sum is being increased by the value of the integer i each time the for loop runs.
		//i is increased by one every time the loop runs, so sum is increased by a higher value each time the loop runs.
		//Once i is greater than or equal to 10, the loop stops running and the final value of sum (45) is printed out.
		//Because there is no print statement in the loop, we only see the total value of sum after the loop is done running.
		
		int sum = 0; 

		for (int i = 1; i < 10; i++) {
			sum += i;
		}

		System.out.println(sum);



	}
}