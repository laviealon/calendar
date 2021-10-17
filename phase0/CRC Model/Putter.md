Class name: Putter
Clean Architecture Level: Use Case

Responsibilities

What it does:
* putTask: puts a task into the required day of the week
* putHalfHourTask: puts a task into the schedule for the given day
* putProject: puts a project(Array of NonFixedTasks) into the required days of the week

Behaviour for which an object is accountable:
* Putters will put tasks and projects into a given day's schedule of a week

  Collaborators:
* Week
* Day
* Task
* NonFixedTask