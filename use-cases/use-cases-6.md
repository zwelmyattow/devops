# Use Case 6: View Employee Details

## Goal in Context
As an HR advisor I want to view an employee's details so that the employee's promotion request can be supported.

## Scope
HR System

## Level
Primary task

## Preconditions
Database contains employee data.

## Success Condition
The requested employee's complete details are successfully retrieved and displayed.

## Failed Condition
The employee cannot be found or the data cannot be retrieved.

## Primary Actor
HR Advisor

## Trigger
An HR Advisor requests to view a specific employee's record (e.g., via Employee Number).

## Main Success Scenario
1. HR Advisor inputs the employee identifier.
2. System queries the database for the employee's full record.
3. System displays the employee's details to the HR Advisor.

## Extensions
2a. Employee identifier does not exist:
1. System outputs an "Employee not found" message.
2. Use case terminates.

## Sub-variations
None.

## Schedule
DUE DATE: Release 0.1