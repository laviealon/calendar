import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.util.Scanner;

public class UserInterface {
    // TODO: Should be able to schedule FixedTasks, NonFixedTasks, and Project

    /**
     * Starts the calendar program. Prints a blurb regarding how to program works, and then
     * gives user the option to either create or import their week calendar.
     *  - If the user inputs 1, program creates a week calendar.
     *  - If the user inputs 2, program imports a week calendar.
     *
     * @return user's selected option as an integer.
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

    /**
     * Give the user the option of scheduling a type of duty.
     *  - If the user inputs 1, program schedules a FixedTask.
     *  - If the user inputs 2, program schedules a NonFixedTask.
     *  - If the user inputs 3, program schedules a project.
     *
     * @return user's selected option as an integer.
     */
    public int scheduleDuty(){
        Scanner reader = new Scanner(System.in);  // Create a Scanner object
        // Give user instructions
        System.out.println("You are now able to schedule your duties. Enter:");
        System.out.println("    - 1 to schedule a task or event that is part of your week's fixed schedule");
        System.out.println("    - 2 to schedule a task or event that is flexible, which RoutOp will find the best" +
                "time slot for based on your fixed schedule.");
        System.out.println("    - 3 to enter information about a project or goal you are working towards, which" +
                "RoutOp will find time during the week for you to work on based on your fixed schedule as well" +
                "as the information you enter about the project.");
        String selectedOption = reader.nextLine(); // Get user input
        return Integer.parseInt(selectedOption);
    }

    /**
     * Get info from user about the FixedTask that they want to schedule and return the Task.
     *
     * @return the FixedTask that is to be put in the schedule.
     */
    public FixedTask createFixedTask(){
        Scanner reader = new Scanner(System.in);  // Create a Scanner object
        System.out.println("What is the name of your task or event?");
        String name = reader.nextLine(); // Get user input
        System.out.println("On what date does your task or event to take place?");
        System.out.println();
        System.out.println("(Please enter date in format YYYY-MM-DD)");
        String startDate = reader.nextLine(); // Get user input
        int year = Integer.parseInt(startDate.substring(0, 4));
        int month = Integer.parseInt(startDate.substring(5, 7));
        int day = Integer.parseInt(startDate.substring(8, 10));
        System.out.println("At what time does your task or event begin?");
        System.out.println();
        System.out.println("(Please enter time in format HH:MM, where HH ranges from 00 to 23 and" +
                " where MM is either 00 or 30)");
        String startTime = reader.nextLine();  // Get user input
        int hour = Integer.parseInt(startTime.substring(0, 2));
        int minute = Integer.parseInt(startTime.substring(3, 5));
        LocalDateTime startDateTime = LocalDateTime.of(year, month, day, hour, minute);
        System.out.println("(Please enter the duration of this task or event in the format HH:MM, HH ranges from 00 to" +
                " 23 and where MM is either 00 or 30");
        String durationStr = reader.nextLine();  // Get user input
        int hourDuration = Integer.parseInt(durationStr.substring(0, 2));
        int minuteDuration = Integer.parseInt(durationStr.substring(3, 5));
        LocalTime duration = LocalTime.of(hourDuration, minuteDuration);
        return new FixedTask(name, startDateTime, duration);  // Create a FixedTask from this information
    }


    /**
     * Get info from user about the NonFixedTask that they want to schedule and return the Task.
     *
     * @return the NonFixedTask that is to be put in the schedule.
     */
    public NonFixedTask createNonFixedTask(){
        Scanner reader = new Scanner(System.in);  // Create a Scanner object
        System.out.println("What is the name of your task or event?");
        String name = reader.nextLine(); // Get user input
        System.out.println("(Please enter the duration of this task or event in the format HH:MM, HH ranges from 00 to" +
                " 23 and where MM is either 00 or 30");
        String durationStr = reader.nextLine();  // Get user input
        int hourDuration = Integer.parseInt(durationStr.substring(0, 2));
        int minuteDuration = Integer.parseInt(durationStr.substring(3, 5));
        LocalTime duration = LocalTime.of(hourDuration, minuteDuration);

        System.out.println("Please enter the date that this task or event is due before.");
        System.out.println();
        System.out.println("(Please enter date in format YYYY-MM-DD)");

        String startDate = reader.nextLine(); // Get user input
        int year = Integer.parseInt(startDate.substring(0, 4));
        int month = Integer.parseInt(startDate.substring(5, 7));
        int day = Integer.parseInt(startDate.substring(8, 10));

        System.out.println("At what time on that day is your task or event due before?");
        System.out.println();
        System.out.println("(Please enter time in format HH:MM, where HH ranges from 00 to 23 and" +
                " where MM is either 00 or 30)");

        String startTime = reader.nextLine();  // Get user input
        int hour = Integer.parseInt(startTime.substring(0, 2));
        int minute = Integer.parseInt(startTime.substring(3, 5));

        LocalDateTime dueDateTime = LocalDateTime.of(year, month, day, hour, minute);
        return new NonFixedTask(name, duration, dueDateTime);
    }

    /**
     * Get info from user about the project they want to schedule, and return an array of NonFixedTasks
     * corresponding to the project.
     *
     * @return an array of unscheduled NonFixedTasks corresponding to this project.
     */
    public NonFixedTask[] createProject(Week week){
        Scanner reader = new Scanner(System.in);  // Create a Scanner object
        System.out.println("What is the name of your project or goal?");
        String name = reader.nextLine(); // Get user input
        System.out.println("What date do you want to start working on this project or goal?");
        System.out.println();
        System.out.println("(Please enter date in format YYYY-MM-DD)");
        String startDateStr = reader.nextLine(); // Get user input
        int year = Integer.parseInt(startDateStr.substring(0, 4));
        int month = Integer.parseInt(startDateStr.substring(5, 7));
        int day = Integer.parseInt(startDateStr.substring(8, 10));
        LocalDate startDate = LocalDate.of(year, month, day);
        System.out.println("What date is this project or goal due by?");
        System.out.println();
        System.out.println("(Please enter date in format YYYY-MM-DD)");
        String dueDateStr = reader.nextLine(); // Get user input
        year = Integer.parseInt(dueDateStr.substring(0, 4));
        month = Integer.parseInt(dueDateStr.substring(5, 7));
        day = Integer.parseInt(dueDateStr.substring(8, 10));
        System.out.println("At what time on that day is your project or goal due before?");
        System.out.println();
        System.out.println("(Please enter time in format HH:MM, where HH ranges from 00 to 23 and" +
                " where MM is either 00 or 30)");

        String startTime = reader.nextLine();  // Get user input
        int hour = Integer.parseInt(startTime.substring(0, 2));
        int minute = Integer.parseInt(startTime.substring(3, 5));
        LocalDateTime dueDate = LocalDateTime.of(year, month, day, hour, minute);
        System.out.println("What is the total number of hours you would like to work on this project? (round to the" +
                " nearest 0.5)");
        double totalHours = Double.parseDouble(reader.nextLine());
        double minHours = Project.calculateMinHours(week, startDate, dueDate, totalHours, Constants.FREQUENCY);
        // Create case to handle when minHours is 0.0
        double maxHours = Project.calculateMaxHoursWeek(week);
        System.out.println("You must work on this project at least " + minHours + " per day and at most " + maxHours +
                " per day.");
        System.out.println("Please enter the maximum amount of time you would like to work on this project in a given" +
                "day. Enter a time formatted as HH:MM, where HH and MM are between that of the minimum and maximum" +
                "shown above.");
        String input = reader.nextLine();
        int hours = Integer.parseInt(input.substring(0, 2));
        int minutes = Integer.parseInt(input.substring(3, 5));
        LocalTime maxHoursPerTask = LocalTime.of(hours, minutes);
        NonFixedTask[] projectTasks = new NonFixedTask[Constants.FREQUENCY];
        for(int i = 0; i <= 7; i++){
            projectTasks[i] = new NonFixedTask(name, maxHoursPerTask, dueDate);
        }
        return projectTasks;
    }
}


