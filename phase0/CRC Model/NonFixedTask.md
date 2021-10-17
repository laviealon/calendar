Class name: NonFixedTask
Super class: Task
Clean Architecture Level: Entity

Responsibilities

Information it stores:
* Name: name of the task
* Duration: the amount of time dedicated to that task
* Completed: whether a task is completed
* dueDateTime: the day and time by which the task needs to be completed

What it does:
* (Uses methods defined in the parent class)

Behaviour for which an object is accountable:
* Non-Fixed Tasks do not play an active role, but their attributes are accessed and updated by many methods and classes

Collaborators:
