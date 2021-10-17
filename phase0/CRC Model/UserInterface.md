Class name: UserInterface
Clean Architecture Level: commandLineUI

Responsibilities

What it does:
* createOrImportWeek: starts the program and receives input from the user about whether they would like to import or create their week calendar and returns the selected option as an integer
* getStartDate: collects the day that the user would like to start their week on and returns the date they selected
* scheduleDuty: Collects the type of task that the user would like to schedule and returns the selected option as an integer
* createFixedTask: Collect information from user about task they want to schedule and return a task according to their specifications
* createNonFixedTask: Collect information from the user about a non-fixed task that they want to schedule and returns the task
* createProject: Get info from user about the project they want to schedule, and return an array of NonFixedTasks
* schedulingDecision: Takes the selection and week that is given and finds whether what type of task is needed to be scheduled and schedules the task corresponding to the project.
* activateCreateOrImport: Takes the selection of the user and allows the user to create their schedule with the given week, start time, or to import an existing schedule


Behaviour for which an object is accountable:
* UserInterfaces must be able to receive inputs from the user about how they want to create their schedule and the type and information of the task they would like to schedule and allows interface adapters to use the information given

  Collaborators:
* Controller
