import java.time.LocalDate;
import java.util.Scanner;

public class UserInterface {
    // TODO: Should be able to schedule FixedTasks, NonFixedTasks, and Project

    /**
     * Starts the calendar program. Prints a blurb regarding how to program works, and then
     * gives user the option to either create or import their week calendar.
     * If the user inputs 1, program creates a week calendar.
     * If the user inputs 2, program imports a week calendar.
     *
     * @return their selected option as an integer.
     */
    public static int createOrImportWeek(){
        Scanner reader = new Scanner(System.in);  // Create a Scanner object
        // Give background for the app and instructions for the user
        System.out.println("Hi there! Welcome to RoutOp, the app built for optimizing your week.");
        System.out.println("The app looks at your week's fixed schedule (for example: meetings, exercise, or " +
                "classes), and then schedules all your flexible duties in their optimal time slot. This way," +
                "RoutOp helps you maximize your executive output each week!");
        System.out.println("Let's begin. Enter");
        System.out.println("    - 1 to start a new week schedule");
        System.out.println("    - 2 to import a week schedule from a .ics file (feature coming soon)");
        String selectedOption = reader.nextLine();  // Read user input
        return Integer.parseInt(selectedOption);
    }

    /**
     * Assuming user starts a new week, ask the user to choose on which date
     * they want their week to start.
     *
     * @return the date they input as a LocalDate object.
     */
    public LocalDate getStartDate(){
        Scanner reader = new Scanner(System.in);  // Create a Scanner object
        // Give user instructions
        System.out.println("On which day do you want your week to start?");
        System.out.println();
        System.out.println("(Please enter date in format YYYY-MM-DD)");
        // Gets user input
        String startDate = reader.nextLine();
        // Reads user input and converts it to a LocalDate object
        int year = Integer.parseInt(startDate.substring(0, 4));
        int month = Integer.parseInt(startDate.substring(5, 7));
        int day = Integer.parseInt(startDate.substring(8, 10));
        return LocalDate.of(year, month, day);
    }

}

