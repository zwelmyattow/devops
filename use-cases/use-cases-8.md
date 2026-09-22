# Use Case 8: Delete Employee Details

## Goal in Context
As an HR advisor I want to delete an employee's details so that the company is compliant with data retention legislation.

## Scope
HR System

## Level
Primary task

## Preconditions
Employee exists in the database.

## Success Condition
The employee's record is completely removed from the database.

## Failed Condition
The deletion fails due to database errors or foreign key constraints.

## Primary Actor
HR Advisor

## Trigger
An HR Advisor issues a command to delete a specific employee's record.

## Main Success Scenario
1. HR Advisor requests the deletion of a specific employee record.
2. System prompts for confirmation.
3. HR Advisor confirms the deletion.
4. System removes the record from the database.
5. System confirms successful deletion.

## Extensions
3a. HR Advisor cancels the deletion:
1. System aborts the operation.
2. Use case terminates.
4a. Record tied to restrictive foreign keys:
1. System rejects deletion and displays dependency error.

## Sub-variations
None.

## Schedule
DUE DATE: Release 0.1