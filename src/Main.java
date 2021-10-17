import java.time.LocalDate;
//import java.time.DayOfWeek;

public class Main {
    public static void main(String[] args) {
        // Give user background on app and ask them whether they want to create
        // new week or import one from a .ics file
        int createOrImportChoice = UserInterface.createOrImportWeek(); // gets user input for whether they would like
        // create or import a week
        LocalDate startDate = UserInterface.getStartDate(); // gets the start date for the week assuming they create it
        int selectionForScheduling = UserInterface.scheduleDuty();
//        FixedTask taskToPut = UserInterface.createFixedTask();
//        NonFixedTask taskToSchedule = UserInterface.createNonFixedTask();
        UserInterface.activateCreateOrImport(createOrImportChoice, startDate, selectionForScheduling);
    }
}
