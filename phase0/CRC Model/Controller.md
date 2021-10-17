Class name: Controller
Clean Architecture Level: Controller

Responsibilities

What it does: 
* activateCreateOrImport: collects whether a user wants to create or import their own week and either starts to create a week with the user-given information or imports the given week
* activateScheduling: puts all the tasks and projects that were given from the user into the new created week, if the user selected to create a new week rather than importing

Behaviour for which an object is accountable:
* Controllers will take in inputs from the UserInterface class then creates a new schedule or imports an existing schedule and puts tasks into the schedule

Collaborators:
* Week
* Putter
* Scheduler
* UserInterface
* FixedTask
* NonFixedTask