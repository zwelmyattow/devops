# Use Case 1: Produce Report on Salary of All Employees

## Goal in Context
As an HR advisor I want to produce a report on the salary of all employees so that I can support financial reporting of the organisation.

## Scope
HR System

## Level
Primary task

## Preconditions
Database contains employee and salary data.

## Success Condition
A report containing all employees and their salaries is successfully generated and displayed.

## Failed Condition
The report is not generated or displays empty/incorrect data.

## Primary Actor
HR Advisor

## Trigger
An HR Advisor initiates the request to view all salaries.

## Main Success Scenario
1. HR Advisor requests the all-employee salary report.
2. System queries the database for all employees and their current salaries.
3. System formats the retrieved data.
4. System provides the report to the HR Advisor.

## Extensions
2a. Database connection fails:
1. System outputs an error message stating "Failed to connect to database".
2. Use case terminates.

## Sub-variations
None.

## Schedule
DUE DATE: Release 0.1