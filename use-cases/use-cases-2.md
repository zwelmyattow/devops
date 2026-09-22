# Use Case 2: Produce Report on Salary of Employees in a Department

## Goal in Context
As an HR advisor I want to produce a report on the salary of employees in a department so that I can support financial reporting of the organisation.

## Scope
HR System

## Level
Primary task

## Preconditions
Database contains employee, department, and salary data.

## Success Condition
A report containing employees of the specified department and their salaries is generated.

## Failed Condition
The report is not generated, or the department does not exist.

## Primary Actor
HR Advisor

## Trigger
An HR Advisor requests a salary report for a specific department name.

## Main Success Scenario
1. HR Advisor requests the salary report for a target department.
2. System queries the database for employees belonging to that department and their salaries.
3. System formats the data.
4. System provides the report to the HR Advisor.

## Extensions
2a. Department does not exist in database:
1. System outputs an empty report or "Department not found" message.
2. Use case terminates.

## Sub-variations
None.

## Schedule
DUE DATE: Release 0.1