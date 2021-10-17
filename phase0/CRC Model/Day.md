Class name: Day
Clean Architecture Level: Entity

Responsibilities

Information it Stores:
* localDate: calendar date for this day
* DayOfWeek: day of week for this day (e.g. Sunday)
* todaySchedule: map where keys are half hour intervals and values are tasks where one is scheduled, or empty string where one is not.

Behaviour for which an object is accountable:
*A day must store its schedule so that it may be accessed by other methods

Collaborators:
