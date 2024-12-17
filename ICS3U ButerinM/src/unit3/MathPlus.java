package unit3;
/**
 * Description: This program prints four different math methods: distance, hypotenuse, numOfFactors, isPrime
 * Date: December 17, 2024
 * @author Misha Buterin
 */
public class MathPlus {
	/**
	 * This is the entry point to the program
	 * @param args
	 */
	public static void main(String[] args) {	
		//Testing methods
		
		//Distance method
		double distance = distance(1, 5, 2, 5);
		System.out.println(distance);

		//Hypotenuse method
		double hypotenuse = hypotenuse(3, 4);
		System.out.println(hypotenuse);

		//numOfFactors method
		int numOfFactors = numOfFactors(16);
		System.out.println(numOfFactors);

		//isPrime method
		boolean isPrime = isPrime(11);
		System.out.println(isPrime);
	}

	/**
	 * This method takes two points and returns the
	   distance between them
	 * @param x1 - x-value of the first point
	 * @param y1 - y-value of the first point
	 * @param x2 - x-value of the second point
	 * @param y2 - y-value of the second point
	 * @return - distance between the 2 points passed to the method
	 */
	public static double distance( int x1, int y1, int x2, int y2 ) {
		double distance = Math.sqrt(Math.pow(y2 - y1, 2) + Math.pow(x2 - x1, 2));
		return distance;
	}

	/**
	 * This method takes the lengths of the two legs
	 * of a triangle and returns the hypotenuse
	 * @param a - length of the first leg of the triangle
	 * @param b - length of the second leg of the triangle
	 * @return - the hypotenuse based on the two side lengths passed to the method
	 */
	public static double hypotenuse(int a, int b) {
		double hypotenuse = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
		return hypotenuse;
	}

	/**
	 * This method returns the number of factors
	 * a given integer has
	 * @param num - integer being factored
	 * @return - the number of a factors of the integer passed to the method
	 */
	public static int numOfFactors (int num) {
		int numOfFactors = 0;
		
		for (int i = 1; i <= num; i++)
			if ((num % i) == 0) {
				numOfFactors++;
			}
		
		return numOfFactors;
	}

	/**
	 * This method returns true if a given number is prime
	 * otherwise is returns false
	 * @param number - integer being checked to be prime
	 * @return - true if the integer passed to the method is prime, false if not
	 */
	public static boolean isPrime (int num) {
		boolean isPrime = true;
		
		if (num <= 1) {
			isPrime = false;
		}
		
		for (int i = 2; i <= num/2; i++) {
			if ((num % i) == 0) {
				isPrime = false;
				break;
			}
		}
		
		return isPrime;
	}
}
