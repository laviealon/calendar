Class name: Scheduler
Clean Architecture Level: Use case

Responsibilities

What it does:
* ScheduleTaskInWeek: Finds the best time slot in the given week and updates the task
* ScheduleTaskInDay: Finds the best time slots of a given day and updates the given task, which will be required for the ScheduleProject method
* ScheduleProject: finds the best time slots in the days of the given week and updates each of the tasks start times.

Behaviour for which an object is accountable:
* Schedulers will be given a task or a project(array of NonFixedTasks) and finds the best possible time slots to schedule each task and updates each task or tasks time slot.

  Collaborators:
* Week
* Day
* Task
* NonFixedTask