package unit1;

import java.util.Scanner;

/**
* Description:
* Date: October 10, 2024
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
    //You are declaring the double Num to be the value of Num plus 2.2.
    //The answer printed will be 12.2, because doubleNum was declared as 10 above.
    
    //explicit casting
    intNum = (int) doubleNum;

    //What type of data is printed here? Why?
    System.out.println(intNum);
    //An integer is being printed here.
    
    /*
    Demonstrate casting between each of the data type. Write down whether it is explicit or implicit
      int to double
      intNum = (double) intNum;
      
      double to int
      doubleNum = (int) doubleNum;
      
      int to long
      intNum = (long) intNum;
      
      long to int
	  longNum = (int) longNum;
	  
    Why do you think these are implicit/explicit? (Hint: Think about the size of each data and the type of data)
    I think that these are explicit, because I am adding brackets to cast the data, which is specific code the cast them.
    */

    System.out.println("Part 2");

    //understanding what you can do with casting, can you round the following variable to the nearest 10th?
    double myNum;
    
    Scanner in = new Scanner(System.in);
    System.out.println("Give me decimal number up to the hundredth");
    //code

    System.out.print("Rounding down to the nearest tenth, it is: ");
    
  }
}