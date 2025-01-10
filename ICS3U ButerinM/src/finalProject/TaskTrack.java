package finalProject;

import java.awt.Color;
import java.awt.Font;

import hsa_new.Console;

/**
 * Description:
 * Date: 
 * @author Misha Buterin
 */
public class TaskTrack {
	/**
	 * This is the entry point to the program
	 * @param args
	 */
	
	static String[] titles = new String[20];
	static String[] descriptions = new String [20];
	
	public static void main(String[] args) {
		//Creating console
		//NOTE MAKE IT SO CONSOLE WORKS IN OTHER METHODS TOO
		Console c = new Console (45, 180, "TaskTrack");
		
		//CREATING MAIN MENU DISPLAY
		
		//Setting background colour by making a rectangle
		c.setColor(new Color (198, 235, 183));
		c.fillRect(0, 0, c.getWidth(), c.getHeight());
		
		//Writing headings using drawString
		c.setColor(Color.BLACK);
		c.setFont(new Font("Serif", Font.BOLD, 40));
		c.drawString("Welcome to TaskTrack!", 520, 100);
		
		c.setFont(new Font("Serif", Font.PLAIN, 20));
		c.drawString("Where would you like to go?", 620, 130);
		
		//Drawing options using fillRect and drawString
		//Creating black rectangles for outline
		c.fillRect(580, 180, 300, 100);
		c.fillRect(580, 320, 300, 100);
		c.fillRect(580, 460, 300, 100);
		c.fillRect(580, 600, 300, 100);
		
		//Creating white rectangles on top
		c.setColor(Color.WHITE);
		c.fillRect(585, 185, 290, 90);
		c.fillRect(585, 325, 290, 90);
		c.fillRect(585, 465, 290, 90);
		c.fillRect(585, 605, 290, 90);
		
		//Drawing text
		//Setting font colour and size again
		c.setColor(Color.BLACK);
		c.setFont(new Font("Serif", Font.BOLD, 27));
		
		//Drawing strings
		c.drawString("1. ADD A TASK", 630, 240);
		c.drawString("2. DISPLAY TASKS", 610, 380);
		c.drawString("3. COMPLETE TASK", 600, 520);
		c.drawString("4. EXIT", 680, 660);
		
		//MAIN METHOD CODE 
		
		//Declaring variables
		String title = "";
		String description = "";
		int currentTaskCount = 0;
		
		//Getting input on where user wants to go
		c.print("Please enter the number of where you would like to go here: ");
		int answer = c.readInt();
		
		//Clearing screen but keeping background colour
		c.clear();
		c.setColor(new Color (198, 235, 183));
		c.fillRect(0, 0, c.getWidth(), c.getHeight());
		
		if (answer == 1) {
			//Getting information about task
			c.println("Alright, let's add a new task to the list!");
			c.println("Please enter the following information about your task:");
			c.print("Title of the task: ");
			title = c.readLine();
			c.print("Description of the task (if none, just enter \"/\"): ");
			description = c.readLine();
			//Calling addTask method
			addTask(title, description, currentTaskCount);
			c.println("The task has been successfully added!");
			
		}
		else if (answer == 2) {
			
		}
		else if (answer == 3) {
			
		}
		else if (answer == 4) {
			
		}
		else {
			
		}
	}
	
	/**
	 * This method
	 * @param title -> The title of the task the user wants to add
	 * @param description -> The description of the task the user wants to add
	 * @param currentTaskCount -> current number of existing tasks
	 * @return -> updated count of existing tasks
	 */
	public static int addTask (String title, String description, int currentTaskCount) {
		
		int taskCount = currentTaskCount++;
		return taskCount;
	}

}
