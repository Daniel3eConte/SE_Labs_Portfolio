# Exercise 4: Behavioral Modeling - Sequence, Activity, and State Diagrams

## Project Overview
This final exercise shifts the focus from structure to behavior. It analyzes how the previously designed systems behave over time and in response to specific events.

## Behavioral Models
1. **ATM (Sequence Diagram)**:
   - Illustrates the chronological exchange of messages between the `User`, `ATM`, and `Bank Server`.
   - Models logic gates (`alt`) for PIN verification and fund availability.

2. **Car Insurance (Activity Diagram)**:
   - Maps the workflow of a `Claim` submission.
   - Highlights decision points (valid/invalid claim) and parallel processes (`fork`) like sending payments and emails simultaneously.

3. **Medical Clinic (State Diagram)**:
   - Tracks the lifecycle of an `Appointment` object.
   - Defines state transitions such as `Requested` -> `Confirmed` -> `Waiting` -> `Visiting` -> `Completed`.

## Technical Implementation
All diagrams are written in **PlantUML** syntax. This "Diagram-as-Code" approach ensures that the system behavior is documented precisely and can be easily updated.

## How to View
Paste the content of the `.puml` files into [PlantText.com](https://www.planttext.com) to see the interactive flows.
