# Use Case 4: Produce Report on Salary by Role

## Goal in Context
As an HR advisor I want to produce a report on the salary of employees of a given role so that I can support financial reporting of the organisation.

## Scope
HR System

## Level
Primary task

## Preconditions
Database contains employee, title (role), and salary data.

## Success Condition
A report containing employees holding the specified role and their salaries is generated.

## Failed Condition
The report is not generated or no employees are found for the role.

## Primary Actor
HR Advisor

## Trigger
An HR Advisor requests a salary report for a specific job role (e.g., "Engineer").

## Main Success Scenario
1. HR Advisor requests the salary report for a specific role.
2. System queries the database for employees matching the role title and their current salaries.
3. System formats the data.
4. System provides the report to the HR Advisor.

## Extensions
2a. Database connection fails:
1. System outputs an error message.
2. Use case terminates.

## Sub-variations
None.

## Schedule
DUE DATE: Release 0.1