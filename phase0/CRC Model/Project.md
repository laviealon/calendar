Class name: Project
Clean Architecture Level: Use Case

Responsibilities

What it does:
* calculateMinHours: collects information about the project from the user and calculates the minimum number of hour the user must work on their project per given frequency.
* getIdealChunk: calculates the ideal number hours per chunk the user would need to work on the project throughout the week
* fitSchedule: checks whether the given chunk can be scheduled into each day of the week
* calculateMaxHoursWeek: calculates the maximum number of hours that can be fit into every day of the week.
* calculateMaxHoursDay: calculates the max amount of hours that are available for a day

Behaviour for which an object is accountable:
* Projects are able to calculate the minimum number of hours that the user must work on their project per the number of times the user would like to work on their project per week

Collaborators:
* Week 
* Day