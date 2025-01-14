package finalProject;

import java.awt.Color;
import java.awt.Font;

import hsa_new.Console;

/**
 * Description: This program allows a user to create their own to-do list.
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
	static boolean[] isComplete = new boolean[20];

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

			//Getting user input on where they want to go
			c.setTextBackgroundColor(new Color (198, 235, 183));
			c.print("Please enter the number of where you would like to go here: ");
			ans1 = c.readInt();

			//Clearing screen/keeping background colour
			c.clear();
			c.setColor(new Color (198, 235, 183));
			c.fillRect(0, 0, c.getWidth(), c.getHeight());

			c.setColor(Color.BLACK);
			c.fillRect(460, 485, 300, 90);
			c.setColor(Color.WHITE);
			c.fillRect(465, 490, 290, 80);

			//Case if user enters 1
			if (ans1 == 1) {
				while (addingTasks) {
					//clearing background for when the loop runs again
					c.clear();
					c.setColor(new Color (198, 235, 183));
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
					
					c.println("Would you like to add another task? (yes/no)");
					ans3 = c.readLine();
					if (ans3.equalsIgnoreCase("no")) {
						addingTasks = false;
					}
				}
			}
			//
			else if (ans1 == 2) {
				c.setColor(Color.BLACK);
				c.drawString("TASKS LIST", 530, 540);

				displayTasks(taskCount);
			}
			//
			else if (ans1 == 3) {
				c.setColor(Color.BLACK);
				c.drawString("COMPLETE TASK", 500, 540);

				//checking if there are no tasks
				if (taskCount == 0) {
					c.println("You have no tasks to mark as complete.");
				}
				else {
					//printing tasks for user to see numbers
					c.print("Here are your current tasks:");
					displayTasks(taskCount);

					c.print("\nPlease enter the number of the task you would like to check off: ");
					completedTaskNumber = c.readInt();

					//Using completeTask method to check off the task
					isComplete[taskCount] = completeTask(completedTaskNumber, taskCount);
					c.println("\nThe task has been checked off.");
				} 
			}
			else if (ans1 == 4) {
				c.setColor(Color.BLACK);
				c.drawString("EXIT", 580, 540);

				c.drawString("Thank you for visiting!", 450, 120);
				//FIX RETURN TO MAIN MENU ON EXIT OPTION
			}
			else {
				c.println("That is not a valid input.");
			}

			c.println("Would you like to return to the main menu? (yes/no)");
			ans2 = c.readLine();
		

		} while (ans2.equalsIgnoreCase("yes"));
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
		//adding info about task to respective arrays
		titles[taskCount] = title;
		descriptions[taskCount] = description;
		isComplete[taskCount] = false;

		//incrementing task count once the task has been added
		taskCount++;
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

		//printing tasks using a for loop
		for (int i = 0; i < taskCount; i++) {
			String status;
			String description;

			//checking completion status
			if (isComplete[i]) {
				status = "[✓]";
			} else {
				status = "[ ]";
			}
			//checking if there is a description
			if (descriptions[i].equals("/")) {
				description = "No description provided";
			} else {
				description = descriptions[i];
			}
			
			c.println("\n" + (i + 1) + "." + status + titles[i]);	
			c.println("\t" + description);
		}

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
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
