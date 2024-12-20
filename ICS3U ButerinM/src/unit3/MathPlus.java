package unit3;
/**
 * Description: This program prints various methods that perform special math operations.
 * Date: December 20, 2024
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

		//int sum method
		int[] array1 = {1, 2, 3};
		int sum = sum(array1);
		System.out.println(sum);

		//double sum method
		double[] array2 = {1.2, 2.4, 3.4};
		double sum2 = sum(array2);
		System.out.println(sum2);

		//int min method
		int[] array3 = {5, 7, 4, 8};
		int min = min(array3);
		System.out.println(min);

		//double min method
		double[] array4 = {5.2, 7.6, 5.3, 8.8};
		int min2 = min(array4);
		System.out.println(min2);

		//int max method
		int[] array5 = {5, 8, 9, 10, 6};
		int max = max(array5);
		System.out.println(max);

		//double max method
		double[] array6 = {5.2, 5.3, 5.4, 5.5, 5.6};
		int max2 = max(array6);
		System.out.println(max2);

		//int bigDifference method
		int[] array7 = {4, 8, 9, 10, 1};
		int difference = bigDifference(array7);
		System.out.println(difference);

		//double bigDifference method
		double[] array8 = {5.2, 4.2};
		double difference2 = bigDifference(array8);
		System.out.println(difference2);
		
		//factors method
		int num = 8;
		int[] factors = factors(num);
		for(int i = 0; i < factors.length; i++) {
			System.out.print(factors[i] + " ");
		}
	}

	/**
	 * This method takes two points and returns the
	   distance between them
	 * @param x1 -> x-value of the first point
	 * @param y1 -> y-value of the first point
	 * @param x2 -> x-value of the second point
	 * @param y2 -> y-value of the second point
	 * @return -> distance between the 2 points passed to the method
	 */
	public static double distance( int x1, int y1, int x2, int y2 ) {
		double distance = Math.sqrt(Math.pow(y2 - y1, 2) + Math.pow(x2 - x1, 2));
		return distance;
	}

	/**
	 * This method takes the lengths of the two legs
	 * of a triangle and returns the hypotenuse
	 * @param a -> length of the first leg of the triangle
	 * @param b -> length of the second leg of the triangle
	 * @return -> the hypotenuse based on the two side lengths passed to the method
	 */
	public static double hypotenuse(int a, int b) {
		double hypotenuse = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
		return hypotenuse;
	}

	/**
	 * This method returns the number of factors
	 * a given integer has
	 * @param num -> integer to be factored
	 * @return -> the number of a factors of the integer passed to the method
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
	 * @param number -> integer being checked to be prime
	 * @return -> true if the integer passed to the method is prime, false if not
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

	/**
	 * This method adds all the numbers in an array
	 * of integers and then returns the sum
	 * @param x -> an array of integers
	 * @return -> the sum of the array passed to the method
	 */
	public static int sum(int[] numbers) {
		int sum = 0;
		for (int i = 0; i < numbers.length; i++) {
			sum += numbers[i];
		}
		return sum;
	}

	/**
	 * This method adds all the numbers in an array
	 * of doubles and then returns the sum
	 * @param x -> an array of doubles
	 * @return -> the sum of the array passed to the method
	 */
	public static double sum(double[] numbers) {
		double sum = 0;
		for (int i = 0; i < numbers.length; i++) {
			sum += numbers[i];
		}
		return sum;
	}

	/**
	 * This method finds the smallest number in an
	 * array of integers and returns the index of it
	 * of where it is
	 * @param numbers -> an array of integers
	 * @return -> the index of the minimum value in the array passed to the method
	 */
	public static int min(int[] numbers) {
		int minIndex = 0;
		int min = numbers[minIndex];
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] <= min){
				min = numbers[i];
				minIndex = i;
			}
		}
		return minIndex;
	}

	/**
	 * This method finds the smallest number in an
	 * array of doubles and returns the index of it
	 * @param numbers -> an array of doubles
	 * @return -> the index of the minimum value in the array passed to the method
	 */
	public static int min(double[] numbers) {
		int minIndex = 0;
		double min = numbers[minIndex];
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] <= min){
				min = numbers[i];
				minIndex = i;
			}
		}
		return minIndex;
	}

	/**
	 * This method finds the largest number in an
	 * array of ints and returns the index of it
	 * @param numbers -> an array of integers
	 * @return -> the index of the maximum value in the array passed to the method
	 */
	public static int max(int[] numbers) {
		int maxIndex = 0;
		int max = numbers[maxIndex];
		for(int i = 0; i < numbers.length; i++) {
			if (numbers[i] >= max){
				max = numbers[i];
				maxIndex = i;
			}
		}
		return maxIndex;
	}

	/**
	 * This method finds the largest number in an array
	 * of integers and returns the index of it
	 * @param numbers -> an array of doubles
	 * @return -> the index of the maximum value in the array passed to the method
	 */
	public static int max(double[] numbers) {
		int maxIndex = 0;
		double max = numbers[maxIndex];
		for(int i = 0; i < numbers.length; i++) {
			if (numbers[i] >= max){
				max = numbers[i];
				maxIndex = i;
			}
		}
		return maxIndex;
	}

	/**
	 * This method finds the difference between the largest
	 * and smallest integers in an array
	 * @param numbers -> an array of integers
	 * @return -> the difference between the largest and smallest ints 
	 * in the array passed to the method
	 */
	public static int bigDifference(int[] numbers) {
		int max = numbers[0];
		int min = numbers[0];
		for (int i = 1; i < numbers.length; i++) {
			if (numbers[i] > max) {
				max = numbers[i];
			}
			else if (numbers[i] < min) {
				min = numbers[i];
			}
		}
		int difference = max - min;
		return difference;
	}

	/**
	 * This method finds the difference between the largest
	 * and smallest doubles in an array
	 * @param numbers -> an array of doubles
	 * @return -> the difference between the largest and smallest doubles 
	 * in the array passed to the method
	 */
	public static double bigDifference(double[] numbers) {
		double max = numbers[0];
		double min = numbers[0];
		for (int i = 1; i < numbers.length; i++) {
			if (numbers[i] > max) {
				max = numbers[i];
			}
			else if (numbers[i] < min) {
				min = numbers[i];
			}
		}
		double difference = max - min;
		return difference;
	}

	/**
	 * This method returns an array of factors
	 * for a given integer passed to the method
	 * @param num -> int to be factored
	 * @return -> array of factors for num
	 */
	public static int[] factors(int num) {	
		int[] factors = new int[numOfFactors(num)];
		int index = 0;
		for (int i = 1; i <= num; i++) {
			if ((num % i) == 0) {
				factors[index++] = i;
			}
		}
		return factors;
	}
}
