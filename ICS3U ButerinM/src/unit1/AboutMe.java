package unit1;
/**
 * Description: This program prints basic information about me, a school cheer, and my time table for the week of September 23rd.
 * Date: September 20, 2024
 * @author Misha Buterin
 */
public class AboutMe {

	public static void main(String[] args) {
		// The next five lines have a title and information about me.
		System.out.println("About Me: \n---------");
		System.out.println("Name    - Misha Buterin");
		System.out.println("Grade   - 11");
		System.out.println("Teacher - Ms. Kemp");
		System.out.println("School  - Lawrence Park Collegiate Institute");
		// This is a school cheer
		System.out.println("\n\"Go Panthers!!\"\n");
		// This is my timetable for the week of September 23rd.
		System.out.println("Timetable for the week of Sept. 23 \n___________________________________________________________________________________________________________");
		System.out.format("%-18s%-18s%-18s%-18s%-18s%-17s%s", "|Date","|Monday", "|Tuesday", "|Wednesday", "|Thursday", "|Friday", "|");
		System.out.format("\n%-18s%-18s%-18s%-18s%-18s%-17s%s", "|","|September 23", "|September 24", "|September 25", "|September 26", "|September 27", "|");
		System.out.println("\n|-----------------|-----------------|-----------------|-----------------|-----------------|----------------|");
		System.out.format("%-18s%-18s%-18s%-18s%-18s%-18s", "|Period 1","|Computer Science", "|Functions", "|Computer Science", "|Functions", "|Computer Science|");
		System.out.format("\n%-18s%-18s%-18s%-18s%-18s%-18s", "| ","|9:00-10:15","|9:00-10:15","|9:55-10:55","|9:00-10:15","|9:00-10:15      |");
		System.out.println("\n|-----------------|-----------------|-----------------|-----------------|-----------------|----------------|");
		System.out.format("%-18s%-18s%-18s%-18s%-18s%-18s", "|Period 2","|Functions", "|Computer Science", "|Functions", "|Computer Science", "|Functions       |");
		System.out.format("\n%-18s%-18s%-18s%-18s%-18s%-18s", "|","|10:20-11:40","|10:20-11:40","|11:00-12:00","|10:20-11:40","|10:20-11:40     |");
		System.out.println("\n|-----------------|-----------------|-----------------|-----------------|-----------------|----------------|");
		System.out.format("%-18s%-18s%-18s%-18s%-18s%-18s", "|        /","|Lunch", "|Lunch", "|Lunch", "|Lunch", "|Lunch           |");
		System.out.println("\n|-----------------|-----------------|-----------------|-----------------|-----------------|----------------|");
		System.out.format("%-18s%-18s%-18s%-18s%-18s%-18s", "|Period 3","|Comm Tech", "|English", "|Comm Tech", "|English", "|Comm Tech       |");
		System.out.format("\n%-18s%-18s%-18s%-18s%-18s%-18s", "|","|12:40-1:55","|12:40-1:55","|1:00-2:10","|12:40-1:55","|12:40-1:55      |");
		System.out.println("\n|-----------------|-----------------|-----------------|-----------------|-----------------|----------------|");
		System.out.format("%-18s%-18s%-18s%-18s%-18s%-18s", "|Period 4","|English", "|Comm Tech", "|English", "|Comm Tech", "|English         |");
		System.out.format("\n%-18s%-18s%-18s%-18s%-18s%-18s", "|","|12:40-1:55","|12:40-1:55","|1:05-2:10","|12:40-1:55","|12:40-1:55      |");
		System.out.println("\n|_________________|_________________|_________________|_________________|_________________|________________|");
	}

}
