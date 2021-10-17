# Progress Report

## Summaries:

#### Specifications:
   Our product is a task scheduling software. We have many ambitions for it, but phase 0 requires us to start with something smaller and doable within a small timeframe. Our current product schedules 3 kinds of tasks: fixed tasks, non-fixed tasks, and projects. Fixed tasks are tasks with a predetermined start time, completion time, and duration. Nonfixed tasks are tasks which the user wishes to complete by a certain day but is not sure when they wish to schedule it. Projects are a series of nonfixed tasks with a certain frequency that share the same goal (e.g. practice piano once a day, where each practicing session is a task).
#### CRC
-   Our current version of the program, which our skeleton code seeks to execute has a variety of classes fitting the different levels of clean architecture.

      Entities: Task, NonFixedTask, FixedTask, Day, Week,

      Use-cases: Putter, Scheduler, Project

      Controllers: Controller

      commandLineUI: UserInterface

-   The task objects of the different task classes keep information about a task, including its scheduled time, so that it can be accessed and updated by different classes

-   The day and week classes store information about a week of days and the tasks scheduled there

-   The putter, scheduler, and project classes work together to find the time available for a task or project of tasks, modify the task object to reflect that time, and add it to the user’s schedule

-   The UserInterface gathers information from the user in order to run the respective methods, and the controller connects the user input to the appropriate use case methods.

#### Scenario walkthrough

-   We chose to work with a case of someone attempting to schedule piano practice for a recital in a week, which would count as a project. We chose a project because we feel it utilizes most of the algorithms in our code and demonstrates what makes our software different from others which just keep track of tasks. Incidentally, many of the features we hope to add in the future will centre around this basic scheduling of a project.

-   The piano practice will be entered as a project and thus split into multiple nonfixed tasks, matching the frequency at which the user wishes to engage in this project.

-   Each of the tasks will be scheduled into the appropriate days in week with the help of the project, scheduler and putter classes.

#### Skeleton program

-   Our skeleton program introduces all of the classes mentioned in the CRC model as well as another class for keeping track of constants, and implements them to an extent where it is (mostly) possible to demonstrate our walkthrough scenario as described in walkthrough.md.

## What has each group member been working on

-   Everyone: involved in multiple discussions about design, set up classes for entities

-   Jeong: finalizing CRC model, unittesting

-   Janujan: only group discussions before he dropped the course and left our group

-   Hailey: implemented many of the methods in scheduler and project

-   Alon: implemented the userinterface, putter, controller

-   Issam: implemented userinterface, designed method for removing hours sleeping from the schedule, implemented projectScheduler

-   Elyse: worked on CRC cards, implemented methods in putter, scheduler, day

## What our group to work on next

-   Next steps for the entire group would be to take our progress so far and its complexity to gauge how much more we can add to our software. This will take us back to design and implementation.  We have not split this work between the different members as we plan to start by working on planning which we do as a group

-   We would like to start implementing exceptions that are specific to this program to help our user better understand the program's failure to comply with their inputs

-   Additionally, once we learn more about UIs and controllers, we can further refine our program to meet clean architecture standards

## What has worked so far with design as we started implementing code

-   Our team works well together, especially when it comes to introducing and discussing ideas as well as fleshing those ideas out. Some of us are better organizers, others prefer to focus on specific areas of coding modules, etc. We are learning to utilize each other’s strengths. Our team has had to overcome adverse circumstances, considering the late onboarding and then loss of group members, but we have been able to maintain focus and work together to maintain a shared vision and execute it.

-   Our team found it overwhelming to plan everything on paper and so we would turn to code and try and execute some of our ideas in order to inspire us to design around issues that would arise.

## Open questions our group is struggling with (that we would like our TA to address)

- Something our group has struggled with is understanding how to preserve clean architecture in the outer layers so that we do not address entities or use cases in the interface.

- Another related issue we have around our interface is understanding how to implement the interface segregation principle (from SOLID) in our design (i.e. how do we break up our interface to satisfy its criteria)

- Unsure whether our specifications should reflect the things we know we want to implement, or all of our ambitions for the program over the course of the semester. If we were to go with the latter option, how would we be able to properly design ideas that we are not sure if we can use, mostly because they rely on complexities we have not yet been able to add to our code.

- While we were double checking that our classes meet the SOLID principles, we struggled to understand how general or specific responsibilities are meant to be when employing the single responsibility principle. If each class can only have one responsibility, how can it ever have more than one method. We settled on breaking up classes with multiple unrelated responsibilities, since they clearly violated this principle. We wish to understand how to define the scope of a responsibility moving forward so that we can adhere to this principle.

- We would like to know if it is an issue to leave our instance attributes as public or if we must follow the convention to make them private

