package unit3;
/**
 * Description: This program prints the distance between two points using a distance method.
 * Date: December 17, 2024
 * @author Misha Buterin
 */
public class MethodChallenge1 {
/**
 * This is the entry point to the program.
 * @param args
 */
	public static void main( String[] args )    {
		// Complete the function below. Don't forget to comment.
		double d1 = distance(-2,1 , 1,5);
		System.out.println(" (-2,1) to (1,5) => " + d1 );

		double d2 = distance(-2,-3 , -4,4);
		System.out.println(" (-2,-3) to (-4,4) => " + d2 );

		System.out.println(" (2,-3) to (-1,-2) => " + distance(2,-3,-1,-2) );

		System.out.println(" (4,5) to (4,5) => " + distance(4,5,4,5) );
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

}
