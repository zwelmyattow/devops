# Use Case 5: Add a New Employee

## Goal in Context
As an HR advisor I want to add a new employee's details so that I can ensure the new employee is paid.

## Scope
HR System

## Level
Primary task

## Preconditions
Database is accessible and capable of accepting write operations.

## Success Condition
The new employee's details are saved in the database.

## Failed Condition
The employee details are rejected or fail to write to the database.

## Primary Actor
HR Advisor

## Trigger
An HR Advisor inputs a new employee's data into the system to be saved.

## Main Success Scenario
1. HR Advisor provides new employee details (name, DOB, role, salary, etc.).
2. System validates the input data.
3. System inserts the new record into the database.
4. System confirms successful creation to the HR Advisor.

## Extensions
2a. Input data is invalid or missing required fields:
1. System rejects the input and prompts for correction.
3a. Database write fails:
1. System outputs an error message.

## Sub-variations
None.

## Schedule
DUE DATE: Release 0.1