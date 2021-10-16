import java.time.LocalDate;
import java.time.DayOfWeek;

public class Main {
    public static void main(String[] args) {
        // Give user background on app and ask them whether they want to create
        // new week or import one from a .ics file
        int createOrImportChoice = UserInterface.createOrImportWeek();
        LocalDate startDate = UserInterface.getStartDate();
        int selectionForScheduling = UserInterface.scheduleDuty();
        FixedTask taskToPut = UserInterface.createFixedTask();
        NonFixedTask taskToSchedule = UserInterface.createNonFixedTask();
        Controller.activateCreateOrImport(createOrImportChoice, startDate, selectionForScheduling, taskToPut, taskToSchedule);
    }
}
