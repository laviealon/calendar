Class name: Scheduler

Responsibilities

What it does:
* ScheduleTaskInWeek: Finds the best time slot in the given week and schedules the given task
* NonFixedTask: finds the best time slots of a given day, which will be required for the ScheduleProject method
* ScheduleProject: finds the best time slots in the given week in order to schedule a project

Behaviour for which an object is accountable:
* Schedulers will be given a task or a project and will be required to schedule them into the best possible time in the user’s week

  Collaborators:
* Week
* Day
* Task
* NonFixedTask