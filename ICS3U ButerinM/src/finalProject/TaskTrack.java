package finalProject;

import java.awt.Color;
import java.awt.Font;

import hsa_new.Console;

/**
 * Description: This is an interactive program allows a user to create their own to-do list.
 * Date: January 15, 2024
 * @author Misha Buterin
 */
public class TaskTrack {
	/**
	 * This is the entry point to the program
	 * @param args
	 */

	//Initializing console so it works in all methods
	static Console c;

	//Initializing arrays so they work in all methods
	static String[] titles = new String[20];
	static String[] descriptions = new String [20];
	static String[] dates = new String[20];
	static boolean[] isComplete = new boolean[20];
	static int maxTasks = 16;

	public static void main(String[] args) {
		//Creating console
		c = new Console (30, 150, "TaskTrack");

		//Declaring variables
		String title = "";
		String description = "";
		String ans2, ans3;
		int ans1;
		int completedTaskNumber; 
		int taskCount = 0;
		boolean addingTasks = true;

		do {
			//CREATING MAIN MENU DISPLAY
			c.clear();

			//Setting background colour using fillRect
			c.setColor(new Color (200, 240, 180));
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

			//Getting user input on where they want to go
			c.setTextBackgroundColor(new Color (200, 240, 180));
			c.print("Please enter the number of where you would like to go here: ");
			ans1 = c.readInt();

			//Clearing screen/keeping background colour
			c.clear();
			c.setColor(new Color (200, 240, 180));
			c.fillRect(0, 0, c.getWidth(), c.getHeight());

			c.setColor(Color.BLACK);
			c.fillRect(460, 485, 300, 90);
			c.setColor(Color.WHITE);
			c.fillRect(465, 490, 290, 80);

			//user enters 1
			if (ans1 == 1) {
				addingTasks = true; 
				
				while (addingTasks) {
					//clearing background for when the loop runs again
					c.clear();
					c.setColor(new Color (200, 240, 180));
					c.fillRect(0, 0, c.getWidth(), c.getHeight());
					c.setColor(Color.BLACK);
					c.fillRect(460, 485, 300, 90);
					c.setColor(Color.WHITE);
					c.fillRect(465, 490, 290, 80);
					c.setColor(Color.BLACK);
					c.drawString("ADD A TASK", 530, 540);

					c.println("Alright, let's add a new task to the list!");
					c.println("Please enter the following information about your task:");
					c.print("\nTitle of the task: ");
					title = c.readLine();
					c.print("\n(Short) Description of the task (if none, just enter \"/\"): ");
					description = c.readLine();

					//Calling addTask method to add the task
					taskCount = addTask(title, description, taskCount);
					c.println("\nThe task has been successfully added!\n");

					//asking if they want to add another task, so they don't have to return to the main menu to do so
					c.println("Would you like to add another task? (yes/no)");
					ans3 = c.readLine();

					if (ans3.equalsIgnoreCase("no")) {
						addingTasks = false;
					}
					//accounting for invalid input
					else if (!ans3.equalsIgnoreCase("yes") && !ans3.equalsIgnoreCase("no")) {
						c.println("That is not a valid answer.\n");
						addingTasks = false;
					}
				}
			}
			//user enters 2
			else if (ans1 == 2) {
				c.setColor(Color.BLACK);
				c.drawString("TASKS LIST", 530, 540);
				//calling displayTasks method
				displayTasks(taskCount);
			}
			//user enters 3
			else if (ans1 == 3) {
				c.setColor(Color.BLACK);
				c.drawString("COMPLETE TASK", 500, 540);

				//checking if there are no tasks
				if (taskCount == 0) {
					c.println("You have no tasks to mark as complete.");
				} else {
					//printing tasks for user to see numbers
					c.print("Here are your current tasks:");
					displayTasks(taskCount);

					c.print("\nPlease enter the number of the task you would like to check off: ");
					completedTaskNumber = c.readInt();

					//using completeTask method to check off the task
					isComplete[taskCount] = completeTask(completedTaskNumber, taskCount);
					c.println("\nThe task has been checked off.\n");
				} 
			}
			//user enters 4
			else if (ans1 == 4) {
				c.setColor(Color.BLACK);
				c.drawString("EXIT", 580, 540);

				c.drawString("Thank you for visiting!", 450, 120);
				//FIX RETURN TO MAIN MENU ON EXIT OPTION
				//MAYBE JUST DELETE CAUSE IT DOES IT ANYWAY
			}
			//accounting for invalid input 
			else {
				c.setColor(Color.BLACK);
				c.drawString("ERROR", 560, 540);
				c.println("That is not a valid input.");
			}

			//directing user back to the main menu
			c.println("Would you like to return to the main menu? (yes/no)");
			ans2 = c.readLine();


		} while (ans2.equalsIgnoreCase("yes"));

		//Printing exit screen
		c.clear();
		c.setColor(new Color (200, 240, 180));
		c.fillRect(0, 0, c.getWidth(), c.getHeight());
		c.setColor(Color.BLACK);
		c.drawString("Thank you for visiting!", 450, 120);

	}

	/**
	 * This method takes a title and description entered by a user,
	 * creates a task based on that information, and returns
	 * an updated count of how many tasks there are.
	 * @param title -> The title of the task the user wants to add
	 * @param description -> The description of the task the user wants to add
	 * @param taskCount -> current number of existing tasks
	 * @return -> updated count of existing tasks
	 */
	public static int addTask (String title, String description, int taskCount) {
		//checking if the max number of tasks has been reached
		if (taskCount >= maxTasks) {
			c.println("The task list is full, you cannot add anymore tasks.");
		} else {
			//adding info about task to respective arrays
			titles[taskCount] = title;
			descriptions[taskCount] = description;
			isComplete[taskCount] = false;

			//incrementing task count once the task has been added
			taskCount++;
		}
		return taskCount;
	}

	/**
	 * This method takes the current number of tasks a user has,
	 * and prints them out using a for loop.
	 * @param taskCount -> current number of existing tasks
	 */
	public static void displayTasks (int taskCount) {
		//case if the user has no tasks
		if (taskCount == 0) {
			c.setColor(Color.BLACK);
			c.drawString("You have no tasks to display.", 440, 140);
		}

		//variables to print tasks using drawString
		int x1 = 50;
		int x2 = 580;
		int y1 = 80;
		int y2 = 50;
		
		//setting font
		c.setFont(new Font("Courier New", Font.PLAIN, 16));

		//printing tasks using a for loop
		for (int i = 0; i < 8; i++) {
			String status;
			String description;

			if (i < taskCount) {
				if (isComplete[i]) {
					status = "[✓] ";
				} else {
					status = "[ ] ";
				}	
				if (descriptions[i].equals("/")) {
					description = "No description provided";
				} else {
					description = descriptions[i];
				}

				c.drawString(((i + 1) + "." + status + titles[i]), x1, y1 + i * y2);	
				c.drawString(("   -  " + description), x1, y1 + i * y2 + 20);
			}
			if (i + 8 < taskCount) {
				if (isComplete[i + 8]) {
					status = "[✓] ";
				} else {
					status = "[ ] ";
				}	
				if (descriptions[i + 8].equals("/")) {
					description = "No description provided";
				} else {
					description = descriptions[i];
				}

				c.drawString((i + 9) + "." + status + titles[i], x2,  y1 + i * y2);	
				c.drawString("   -  " + description, x2,  y1 + i * y2 + 20);
			}
		}
	}

	/**
	 * This method
	 * @param completedTaskNumber -> the number of the task the user wants to check off
	 * @return
	 */
	public static boolean completeTask (int completedTaskNumber, int taskCount) {
		//accounting for invalid input
		if (completedTaskNumber < 1 || completedTaskNumber > taskCount) {
			c.println("Invalid task number.");
		}

		//updating isComplete value of the selected task
		int index = completedTaskNumber - 1;
		isComplete[index] = true;
		return true;
	}



}
