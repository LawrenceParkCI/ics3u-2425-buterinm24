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
	static boolean[] isComplete = new boolean[20];
	
	public static void main(String[] args) {
		//Creating console
		Console c = new Console (30, 150, "TaskTrack");
		
		//CREATING MAIN MENU DISPLAY

		//Setting background colour using fillRect
		c.setColor(new Color (198, 235, 183));
		c.fillRect(0, 0, c.getWidth(), c.getHeight());

		//Setting colour back to black to print headings
		c.setColor(Color.BLACK);
		c.setFont(new Font("Serif", Font.BOLD, 40));
		c.drawString("Welcome to TaskTrack!", 400, 90);
		
		c.setFont(new Font("Serif", Font.PLAIN, 20));
		c.drawString("Where would you like to go?", 500, 120);
		
		//Drawing boxes for each option of where to go
		c.fillRect(460, 140, 300, 90);
		c.fillRect(460, 255, 300, 90);
		c.fillRect(460, 370, 300, 90);
		c.fillRect(460, 485, 300, 90);
		
		c.setColor(Color.WHITE);
		c.fillRect(465, 145, 290, 80);
		c.fillRect(465, 260, 290, 80);
		c.fillRect(465, 375, 290, 80);
		c.fillRect(465, 490, 290, 80);
		
		//Adding text for each option
		c.setColor(Color.BLACK);
		c.setFont(new Font("Serif", Font.BOLD, 27));
		
		c.drawString("1. ADD A TASK", 510, 195);
		c.drawString("2. DISPLAY TASKS", 490, 310);
		c.drawString("3. COMPLETE TASK", 480, 425);
		c.drawString("4. EXIT", 560, 540);
		
		//MAIN METHOD CODE 
		
		//Declaring variables
		String title = "";
		String description = "";
		int taskCount = 0;
		
		//Getting user input on where they want to go
		c.print("Please enter the number of where you would like to go here: ");
		int answer = c.readInt();
		
		//Clearing screen/keeping background colour
		c.clear();
		c.setColor(new Color (198, 235, 183));
		c.fillRect(0, 0, c.getWidth(), c.getHeight());
		
		//Case if user enters 1
		if (answer == 1) {
			c.println("Alright, let's add a new task to the list!");
			c.println("Please enter the following information about your task:");
			c.print("\nTitle of the task: ");
			title = c.readLine();
			c.print("\nDescription of the task (if none, just enter \"/\"): ");
			description = c.readLine();
			
			taskCount = addTask(title, description, taskCount);
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
	public static int addTask (String title, String description, int taskCount) {
		titles[taskCount] = title;
		descriptions[taskCount] = description;
		isComplete[taskCount] = false;
		
		taskCount++;
		return taskCount;
	}

}
