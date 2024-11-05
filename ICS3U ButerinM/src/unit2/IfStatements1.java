package unit2;
/**
 * Description: This program is a work sheet about if statements.
 * Date: November 5, 2024
 * @author Misha Buterin
 */
public class IfStatements1 {
	/**
	 * This is the entry point to the program.
	 * @param args
	 */
	public static void main(String[] args) {
		int firstNum = 10;
		int secondNum = 30;

		System.out.println("Part 1: If");
		System.out.println("----------");
		if (firstNum > secondNum) {
			System.out.println("KEKW");
			System.out.println("OMEGLUL");
		}    

		//What prints out? Why?
		//Nothing is printed out because the if statement is untrue. 
		//(10 is not greater than 30), and there is no else.
		
		System.out.println("\nPart 2: If, Else");
		System.out.println("----------------");
		if (firstNum > secondNum) {
			System.out.println("KEKW");
			System.out.println("OMEGALUL");
		} else {
			System.out.println("XQCL");
		}

		//What prints out? Why?
		//XQCL is printed because the if statement is not true, 
		//so the program moves on and prints the else.
		
		System.out.println("\nPart 3: If, Else if, Else");
		System.out.println("-------------------------");
		if (firstNum > secondNum) {
			System.out.println("KEKW");
			System.out.println("OMEGALUL");
		} else if (firstNum % 2 == 0 && secondNum % 3 == 0){
			System.out.println("sykSHY");
		} else {
			System.out.println("XQCL");
		}

		//What prints out? Why?
		//sykSHY is printed out because the else if statement is true.

		System.out.println("\nPart 4: What's the difference?");
		System.out.println("------------------------------");
		System.out.println(1);
		if (firstNum < secondNum) {
			System.out.println("KEKW");
			System.out.println("OMEGALUL");
		} else if (firstNum % 2 == 0 && secondNum % 3 == 0){
			System.out.println("sykSHY");
		} else {
			System.out.println("XQCL");
		}

		System.out.println(2);
		if (firstNum < secondNum) {
			System.out.println("KEKW");
			System.out.println("OMEGALUL");
		}

		if (firstNum % 2 == 0 && secondNum % 3 == 0){
			System.out.println("sykSHY");
		}

		if (!(firstNum < secondNum)) {
			System.out.println("XQCL");
		}

		//What prints out? Why?
		/*
		 * The first part prints:
		 * 1
		 * KEKW
		 * OMEGALUL
		 */
		
		/*
		 * The second part prints: 
		 * 2
		 * KEKW
		 * OMEGALUL
		 * sykSHY
		 */
		//This is printed because in the first part, the if statement is true
		//and so the program sees that and prints the conditions of that if statement.
		//In the second part, there are three separate if statements so one being true doesn't affect the other. 
		//Because the first two are true, they are both printed.
		
		//What is the difference between the first and second part?
		//The difference is that in the first part, there is an if statement followed by an else if and an else if that if statement is untrue.
		//Because everything in the first part is under one initial if statement, 
		//even if the else if and else are true, they are not printed because the if is already truer.
		//In the second part, there are three separate if statements, so they can all be true and printed simultaneously.

	}
}