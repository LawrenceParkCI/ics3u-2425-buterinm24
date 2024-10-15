package unit1;

import java.util.Scanner;

/**
 * Description: This program is a work sheet that demonstrates casting.
 * Date: October 15, 2024
 * @author Misha Buterin
 */
public class Casting {

	/**
	 * This is the entry point to the program.
	 * @param args unused
	 */
	public static void main(String[] args) {
		/*
		 *Casting* means to change data from one type to another.

    Implicit casting - changing of data types without specifically writing extra code

    Explicit casting - changing of data types by specifically writing extra code
		 */

		System.out.println("Part 1");

		int intNum;
		intNum = 10;

		double doubleNum;

		//implicit casting
		doubleNum = intNum;

		//What type of data is printed here? Why?
		System.out.println(doubleNum);
		//A double is printed here, because doubleNum was put in the brackets, casting Num as a double

		//can you explain what is happening in this code?
		doubleNum = doubleNum + 2.2;
		//You are declaring the double doubleNum to be the current value of doubleNum plus 2.2.
		//The answer printed will be 12.2, because doubleNum was declared as 10 above.

		//explicit casting
		intNum = (int) doubleNum;

		//What type of data is printed here? Why?
		System.out.println(intNum);
		//An integer is being printed here.

		/*
    Demonstrate casting between each of the data type. Write down whether it is explicit or implicit
      int to double:
      double myDouble = myInt;
      This is implicit casting.

      double to int
      int myInt = (int) myDouble;
      This is explicit casting.

      int to long
      long myLong = myInt;
      This is implicit casting.

      long to int
	  int myInt = (int) myLong;
	  This is explicit casting.

    Why do you think these are implicit/explicit? (Hint: Think about the size of each data and the type of data)
    int to double and int to long are both implicit because you are switching from a smaller to a larger data type,
    and no data has a chance of being lost. All the original information can still be stored.

    double to int and long to int are both explicit because you are switching from a larger to a smaller data type.
    These require explicit casting because some data is being cut off so specific code is needed to try and keep
    data as accurate as possible.
		 */

		System.out.println("Part 2");

		//understanding what you can do with casting, can you round the following variable to the nearest 10th?
		double myNum;

		Scanner in = new Scanner(System.in);
		System.out.println("Give me decimal number up to the hundredth");

		//code
		myNum = in.nextDouble();
		myNum = (int)(myNum*10)/10.0;

		System.out.print("Rounding down to the nearest tenth, it is: " + myNum);

		in.close();

	}
}