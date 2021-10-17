Class name: Week
Clean Architecture Level: Entity

Responsibilities

Information it stores:
* Days: a collection of all 7 days found in that week

Behaviour for which an object is accountable:
* toString: returns string representation of a week
* A week stores a collection of days that together makes up a schedule for a week which each daily schedule can be accessed by other classes

Collaborators:
* Day
