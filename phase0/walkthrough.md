## 1. User inputs their fixed routine, with "piano recital" on Saturday ##
    - user meets interface, which asks user whether they want to start a new calendar or import one
    - for walk through, they start a new one - they can select the date of day 1 of their week, which they select to be "2021-10-17"
    - they are provided with a visual of their calendar
    - user selects option to schedule FixedTasks for this week
    - user inputs a fixed task called "meeting" on "2021-10-20" and is 03:00 hours long
    - user inputs a fixed task called "class" on "2021-10-22" and is 02:30 hours long
    - user inputs a fixed task called "piano recital" on "2021-10-24" at "21:30", which is 01:30 hours long
    
## 2. User schedules a "piano practice" project for this week, which they want to work on 20 hours in total before their recital on Saturday ##
    - user provided with option to schedule a single NonFixedTask or a project
    - user selects option to schedule project
    - user prompted to fill in due date (including time it is due on that date), total hours they want to work on it, and name for the project
    - user inputs information: "2021-10-24" at "21:30" is the due date, want to work on it 20 hours, name is "piano practice"
    - min hours per day calculated
    
## 3. Program notifies user their min and max hours per day ##
    - user asked max hours they want to work on a given day (note that there may be Days when user might work
    much less than this max)
    
## 4. User inputs their max between the range suggested ##
 
## 5. Optimal scheduling done by program ##
    - program separates project into tasks and schedules them
