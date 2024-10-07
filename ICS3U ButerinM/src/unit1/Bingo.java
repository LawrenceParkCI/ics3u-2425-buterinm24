package unit1;
/**
 * Description: This program prints the rules of Bingo, followed by an example of a Bingo card.
 * Date: September 25, 2024
 * @author Misha Buterin
 */
public class Bingo {
/**
 * Entry point to the program.
 * @param args
 */
	public static void main(String[] args) {
		// These are the rules for a Bingo game.
		System.out.println("Rules of Bingo\n\n-------------------------------------------------------------------\n");
		System.out.println("1. The caller randomly pulls a numbered bingo ball.\n");
		System.out.println("2. The number is placed on the bingo board and called out.\n");
		System.out.println("3. Players look for the called number on their bingo card.\n");
		System.out.println("4. If the number is located, it is marked off.\n");
		System.out.println("5. Steps 1-4 are repeated until a player matches the BINGO pattern.\n");
		System.out.println("6. The winning player yells \"BINGO!\"");
		System.out.println("\n-------------------------------------------------------------------\n");
		// This is a sample Bingo card.
		System.out.println("Bingo Card");
		System.out.println(" _____________________________");
		System.out.format("%-6s%-6s%-6s%-6s%-6s%1s", "|B", "|I", "|N", "|G", "|O", "|");
		System.out.println("\n|=====|=====|=====|=====|=====|");
		System.out.format("%-6s%-6s%-6s%-6s%-6s%1s", "|3", "|21", "|38", "|47", "|74","|");
		System.out.println("\n|-----|-----|-----|-----|-----|");
		System.out.format("%-6s%-6s%-6s%-6s%-6s%1s", "|11", "|28", "|42", "|59", "|63","|");
		System.out.println("\n|-----|-----|-----|-----|-----|");
		System.out.format("%-6s%-6s%-6s%-6s%-6s%1s", "|8", "|17", "|FREE", "|51", "|70","|");
		System.out.println("\n|-----|-----|-----|-----|-----|");
		System.out.format("%-6s%-6s%-6s%-6s%-6s%1s", "|15", "|23", "|35", "|48", "|66","|");
		System.out.println("\n|-----|-----|-----|-----|-----|");
		System.out.format("%-6s%-6s%-6s%-6s%-6s%1s", "|1", "|19", "|44", "|60", "|72","|");
		System.out.println("\n|_____|_____|_____|_____|_____|");
	}

}
