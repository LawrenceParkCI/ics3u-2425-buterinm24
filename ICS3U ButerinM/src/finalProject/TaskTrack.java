package finalProject;

import java.awt.Color;
import java.awt.Font;

import hsa_new.Console;

/**
 * Description: This is an interactive program allows a user to create their own to-do list.
 * Date: January 16, 2024
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
		String title = "", description = "";
		String ans2, ans3, ans4;
		int ans1;
		int completedTaskNumber; 
		int taskCount = 0, completedTasks = 0;
		boolean addingTasks = true, completingTasks = true;

		do {
			//Creating the main menu display
			c.clear();

			//Setting background colour
			c.setColor(new Color (200, 240, 180));
			c.fillRect(0, 0, c.getWidth(), c.getHeight());

			//Printing headings
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

			//Drawing text for each option
			c.setColor(Color.BLACK);
			c.setFont(new Font("Serif", Font.BOLD, 27));

			c.drawString("1. ADD A TASK", 510, 195);
			c.drawString("2. DISPLAY TASKS", 490, 310);
			c.drawString("3. COMPLETE TASK", 480, 425);
			c.drawString("4. EXIT", 560, 540);

			//Main method code

			//Getting user input on where they want to go
			c.setTextBackgroundColor(new Color (200, 240, 180));
			c.print("Please enter the number of where you would like to go here: ");
			ans1 = c.readInt();

			//Clearing screen/repainting background
			c.clear();
			c.setColor(new Color (200, 240, 180));
			c.fillRect(0, 0, c.getWidth(), c.getHeight());

			c.setColor(Color.BLACK);
			c.fillRect(460, 485, 300, 90);
			c.setColor(Color.WHITE);
			c.fillRect(465, 490, 290, 80);

			//User enters 1
			if (ans1 == 1) {
				addingTasks = true; 

				//Loop that runs until the user does not want to add anymore tasks
				while (addingTasks) {
					
					//Clearing and repainting background for when the loop runs again
					c.clear();
					c.setColor(new Color (200, 240, 180));
					c.fillRect(0, 0, c.getWidth(), c.getHeight());
					c.setColor(Color.BLACK);
					c.fillRect(460, 485, 300, 90);
					c.setColor(Color.WHITE);
					c.fillRect(465, 490, 290, 80);
					
					//Drawing heading
					c.setColor(Color.BLACK);
					c.drawString("ADD A TASK", 530, 540);
					
					//Getting information about the task from the user
					c.println("Alright, let's add a new task to the list!");
					c.println("\nYou currently have: " + taskCount + " task(s). The maximum capacity is 16.");
					c.println("\nPlease enter the following information about your task:");
					c.print("\nTitle of the task: ");
					title = c.readLine();
					c.print("\n(Short) Description of the task (if none, just enter \"/\"): ");
					description = c.readLine();

					//Calling addTask method to add the task
					taskCount = addTask(title, description, taskCount);
					c.println("\nThe task has been successfully added!\n");

					//Asking if they want to add another task, so they don't have to return to the main menu to do so
					c.println("Would you like to add another task? (yes/no)");
					ans3 = c.readLine();

					if (ans3.equalsIgnoreCase("no")) {
						addingTasks = false;
					}
					//Accounting for invalid input
					else if (!ans3.equalsIgnoreCase("yes") && !ans3.equalsIgnoreCase("no")) {
						c.println("That is not a valid answer.\n");
						addingTasks = false;
					}
				}
			}
			//User enters 2
			else if (ans1 == 2) {
				//Drawing heading
				c.setColor(Color.BLACK);
				c.drawString("TASKS LIST", 530, 540);
				
				//Calling displayTasks method
				displayTasks(taskCount);
			}
			//User enters 3
			else if (ans1 == 3) {
				completingTasks = true;

				while (completingTasks) {
					//Clearing and repainting background
					c.clear();
					c.setColor(new Color (200, 240, 180));
					c.fillRect(0, 0, c.getWidth(), c.getHeight());
					c.setColor(Color.BLACK);
					c.fillRect(460, 485, 300, 90);
					c.setColor(Color.WHITE);
					c.fillRect(465, 490, 290, 80);
					
					//Drawing heading
					c.setColor(Color.BLACK);
					c.setFont(new Font("Serif", Font.BOLD, 27));
					c.drawString("COMPLETE TASK", 490, 540);

					//Checking if there are no tasks
					if (taskCount == 0) {
						c.println("You have no tasks to mark as complete.");
						completingTasks = false;
					} 
					//Checking if all tasks are complete already
					else if (completedTasks == taskCount) {
						c.println("All your tasks have been completed!");
						completingTasks = false;
					} else {
						//Printing tasks for user to see numbers
						c.print("Here are your current tasks:");
						displayTasks(taskCount);

						c.print("\nPlease enter the number of the task you would like to check off: ");
						completedTaskNumber = c.readInt();

						//Clearing task list so text doesn't overlap
						c.clear();
						c.setColor(new Color (200, 240, 180));
						c.fillRect(0, 0, c.getWidth(), c.getHeight());
						c.setColor(Color.BLACK);
						c.fillRect(460, 485, 300, 90);
						c.setColor(Color.WHITE);
						c.fillRect(465, 490, 290, 80);
						c.setColor(Color.BLACK);
						c.setFont(new Font("Serif", Font.BOLD, 27));
						c.drawString("COMPLETE TASK", 490, 540);

						//Checking if the selected task is already complete
						if (isComplete[completedTaskNumber -1]) {
							c.println("That task has already been marked as complete.");
						} 
						//Marking selected task as complete
						else {
						isComplete[taskCount] = completeTask(completedTaskNumber, taskCount);
						c.println("The task has been checked off.\n");
						}
						
						try {
							Thread.sleep(3000);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}

						//Incrementing number of completedTasks to compare it with the task count
						completedTasks++;

						//Asking if they want to add another task, so they don't have to return to the main menu to do so
						if (!(completedTasks == taskCount)) {
							c.println("Would you like to check off another task? (yes/no)");
							ans4 = c.readLine();

							if (ans4.equalsIgnoreCase("no")) {
								completingTasks = false;
							}
							//Accounting for invalid input
							else if (!ans4.equalsIgnoreCase("yes") && !ans4.equalsIgnoreCase("no")) {
								c.println("That is not a valid answer.\n");
								completingTasks = false;
							}
						}
					}
				} 
			}
			
			//User enters 4
			else if (ans1 == 4) {
				//Drawing heading
				c.setColor(Color.BLACK);
				c.drawString("EXIT", 580, 540);

				//Telling user they are about to exit in case they mistyped 
				c.println("You are about to exit the program.");
			}
			//Accounting for invalid input 
			else {
				c.setColor(Color.BLACK);
				c.drawString("ERROR", 560, 540);
				c.println("That is not a valid input.");
			}

			//Directing user back to the main menu
			c.println("Would you like to return to the main menu? (yes/no)");
			ans2 = c.readLine();
			
			//Accounting for invalid input
			if(!ans2.equalsIgnoreCase("yes") || !ans2.equalsIgnoreCase("no")) {
				c.println("That is not a valid answer.");
			}
			
		} while (ans2.equalsIgnoreCase("yes"));

		//Drawing exit screen
		c.clear();
		c.setColor(new Color (200, 240, 180));
		c.fillRect(0, 0, c.getWidth(), c.getHeight());
		c.setColor(Color.BLACK);
		c.drawString("Thank you for visiting!", 450, 120);
	}

	/**
	 * This method adds a new task to the users task list by putting the provided 
	 * title and description into the titles[] and descriptions[] arrays,
	 * it then increments the task count variable and returns the updated number of tasks.
	 * @param title -> The title of the task the user wants to add
	 * @param description -> The description of the task the user wants to add
	 * @param taskCount -> The current number of existing tasks
	 * @return -> An updated count of existing tasks
	 */
	public static int addTask (String title, String description, int taskCount) {
		//Checking if the max number of tasks has been reached
		if (taskCount >= maxTasks) {
			c.println("The task list is full, you cannot add anymore tasks.");
		} else {
			//Adding info about task to respective arrays
			titles[taskCount] = title;
			descriptions[taskCount] = description;
			isComplete[taskCount] = false;

			//Incrementing task count once the task has been added
			taskCount++;
		}
		return taskCount;
	}

	/**
	 * This method displays all the tasks a user has in two columns
	 * using a for loop. The tasks are each displayed with a number, 
	 * title, description, and completion status using the titles[],
	 * descriptions[] and isComplete[] arrays for information.
	 * @param taskCount -> The current number of existing tasks
	 */
	public static void displayTasks (int taskCount) {
		//Checking if the user has no tasks to display
		if (taskCount == 0) {
			c.setColor(Color.BLACK);
			c.drawString("You have no tasks to display.", 440, 140);
		}

		//Variables used to create columns
		int x1 = 50;
		int x2 = 580;
		int y1 = 80;
		int y2 = 50;

		//Setting font to draw tasks
		c.setFont(new Font("Courier New", Font.PLAIN, 16));

		//Drawing tasks using a for loop
		for (int i = 0; i < 8; i++) {
			String status;
			String description;

			//Left column
			if (i < taskCount) {
				if (isComplete[i]) {
					status = "[DONE] ";
				} else {
					status = "[    ] ";
				}	
				if (descriptions[i].equals("/")) {
					description = "No description provided";
				} else {
					description = descriptions[i];
				}

				c.drawString(((i + 1) + "." + status + titles[i]), x1, y1 + i * y2);	
				c.drawString(("   -  " + description), x1, y1 + i * y2 + 20);
			}
			//Right column
			if (i + 8 < taskCount) {
				if (isComplete[i + 8]) {
					status = "[Done] ";
				} else {
					status = "[    ] ";
				}	
				if (descriptions[i + 8].equals("/")) {
					description = "No description provided";
				} else {
					description = descriptions[i + 8];
				}

				c.drawString((i + 9) + "." + status + titles[i + 8], x2,  y1 + i * y2);	
				c.drawString("   -  " + description, x2,  y1 + i * y2 + 20);
			}
		}
	}

	/**
	 * This method marks a task of the user's choice complete by updating its
	 * value in the isComplete[] array.
	 * @param completedTaskNumber -> The number of the task the user wants to check off
	 * @return -> The updated completion status of the task
	 */
	public static boolean completeTask (int completedTaskNumber, int taskCount) {
		//Accounting for invalid input
		if (completedTaskNumber < 1 || completedTaskNumber > taskCount) {
			c.println("Invalid task number.");
		}

		//Updating isComplete value of the selected task
		int index = completedTaskNumber - 1;
		isComplete[index] = true;
		return true;
	}
}
