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
* convertDurationDouble: converts the duration of the given task and converts it from type LocalTime to Double
* (Task has 2 different initializers to accommodate the needs of its 2 different subclasses)

Behaviour for which an object is accountable:
* Tasks do not play an active role, but their attributes are accessed and updated by many methods and classes

Collaborators:
