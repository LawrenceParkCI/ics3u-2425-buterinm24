package unit1;

/**
 * Description: This program is a work sheet that demonstrates casting and explains ASCII.
 * Date: October 15, 2024
 * @author Misha Buterin
 */
public class Casting2 {

	/**
	 * This is the entry point to the program.
	 * @param args unused
	 */
	public static void main(String[] args) {
		/*
    Char and int
		 */
		char myChar = 'a';
		System.out.println(myChar);
		System.out.println(myChar + 1);

		char myChar2 = (char) (myChar + 1);

		System.out.println(myChar2);

		//Explain what is happening in the code. Where is there explicit casting, where is there implicit casting?

		//First, the character a is being printed because it was assigned to the character myChar.
		//Then, the number 98 is printed because the ASCII value of a is 97, and + 1 equals 98.
		//The ASCII value and not the actual character is printed because of the + 1, since there are no brackets around myChar, it is converted to an 
		//integer due to the order of operations.

		//There is explicit casting in the line "char myChar2 = (char) (myChar + 1);" where you are specifically casting myChar2 as a char, by writing (char).
		//The letter b is printed after the explicit casting occurs because myChar + 1 has the value of 98, and the ASCII value of b is 98.
		//98 is being casted into a character, and that character is b.

		//There is implicit casting in the line "System.out.println(myChar + 1);" because myChar is being changed from a char to an integer without
		//any specific code.

		//Why do you think this happens?
		//This happens because of the ASCII values of all the characters included in the code, and because of the implicit and explicit casting between data types.

		//Investigate what is ASCII. What is it?
		//ASCII stands for  American Standard Code for Information Interchange.
		//It is a character encoding system used for electronic communication. ASCII allows you to communicate text data through numerical values.
		//ASCII assigns a numerical value to every existing character.

		//Can you find the number value for 'a'? Does it match with your findings above?
		//The ASCII value of 'a' is 97. This matches up with what I saw above.

		//create a new character myCharCap, and transform myChar into a capital 'A' and print it
		char myCharCap = (char)(myChar - 32);
		System.out.println(myCharCap);

	}
}