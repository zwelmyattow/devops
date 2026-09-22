# Use Case 7: Update Employee Details

## Goal in Context
As an HR advisor I want to update an employee's details so that employee's details are kept up-to-date.

## Scope
HR System

## Level
Primary task

## Preconditions
Employee exists in the database. Database allows write operations.

## Success Condition
The employee's details are successfully updated in the database.

## Failed Condition
The update fails or the employee is not found.

## Primary Actor
HR Advisor

## Trigger
An HR Advisor submits revised details for an existing employee.

## Main Success Scenario
1. HR Advisor requests to update an employee record and provides new data.
2. System validates the new data.
3. System updates the corresponding record in the database.
4. System confirms the successful update to the HR Advisor.

## Extensions
2a. Invalid data provided:
1. System prompts for correct data format.
3a. Employee record locked or database write fails:
1. System outputs an error message.

## Sub-variations
None.

## Schedule
DUE DATE: Release 0.1