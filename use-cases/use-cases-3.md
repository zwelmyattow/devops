# Use Case 3: Produce Report on Salary of Employees in My Department

## Goal in Context
As a department manager I want to produce a report on the salary of employees in my department so that I can support financial reporting for my department.

## Scope
HR System

## Level
Primary task

## Preconditions
Database contains employee, department, and salary data. Manager is authenticated for their specific department.

## Success Condition
A report containing employees of the manager's specific department and their salaries is generated.

## Failed Condition
The report is not generated, or the manager is denied access.

## Primary Actor
Department Manager

## Trigger
A Department Manager requests the salary report for their own department.

## Main Success Scenario
1. Department Manager requests the salary report.
2. System identifies the manager's department.
3. System queries the database for employees in that department and their salaries.
4. System provides the formatted report to the Department Manager.

## Extensions
2a. Manager authentication/identification fails:
1. System denies access.
2. Use case terminates.

## Sub-variations
None.

## Schedule
DUE DATE: Release 0.1