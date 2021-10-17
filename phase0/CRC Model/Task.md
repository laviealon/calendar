Class name: Task
Subclasses: NonFixedTask, FixedTask
Clean Architecture Level: Entity

Responsibilities

What it stores: 
* Name: name of the task
* startDateTime: the day and time that the task will be started 
* Duration :the amount of time dedicated to that task
* Completed: whether the task has been done

What it does:
* complete: indicates that a task has been completed

Behaviour for which an object is accountable:
* Tasks do not play an active role, but their attributes are accessed and updated by many methods and classes

Collaborators:
